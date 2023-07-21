package links_in_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_links2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
        
		System.out.println("number of links present in the webpage"+links.size());
		
		for(WebElement link:links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
		Thread.sleep(8000);
		driver.quit();

	}

}
