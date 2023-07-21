package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class fluentwait1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		//waiting for 20sec for an element to be present on the page checking for its presence once every 5 seconds
		
		Wait<WebDriver> Mywait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		
		//usage of fluent wait
		
		WebElement element=Mywait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("email12"));
			}
		});
		
		element.sendKeys("test123");
			
		

	}

}
