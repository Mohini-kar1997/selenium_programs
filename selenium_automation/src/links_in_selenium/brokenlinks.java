package links_in_selenium;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
        
		System.out.println("number of links present in the webpage"+links.size());
		
		int brokenlinks=0;
		
		for(WebElement element:links) {
			String url1=element.getAttribute("href");
			if(url1==null || url1.isEmpty()) {
				System.out.println("url is empty or null");
			}
			URL link=new URL(url1);
			HttpsURLConnection httpscode=(HttpsURLConnection)link.openConnection();
			httpscode.connect();
			
			//200-ok
			//201-creadted
			//400-badref
			
			if(httpscode.getResponseCode()>=400) {
				System.out.println(httpscode.getResponseCode()+"-->"+url1+"*****************************************is broken link");
				brokenlinks++;
				
			}
			else {
				System.out.println(httpscode.getResponseCode()+"-->"+url1+"is valid link");
			}
			
			
		}
		
		driver.quit();
	}

}
