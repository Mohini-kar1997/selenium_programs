package links_in_selenium;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlink {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
        
		System.out.println("number of links present in the webpage"+links.size());
		
		int brokenlinks=0;
		
		for(WebElement element:links) {
			String url=element.getAttribute("href");
			if(url==null || url.isEmpty()) {
				System.out.println("url is empty");
			}
		}
		
		//URL link=new URL(url);
		


		driver.quit();


	}

}
