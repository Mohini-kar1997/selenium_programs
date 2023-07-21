package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class fluentwait2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		By input1=By.id("email");
		By input2=By.id("pass"); 
		
		//for wrong id wait for 20sec and throws timeout exception
		
		fluentwait2.waitforfluent(driver, input1).sendKeys("mohini123");
		fluentwait2.waitforfluent(driver, input2).sendKeys("mohini123");
		
		Thread.sleep(3000);
		driver.quit();

	}
	
	public static WebElement waitforfluent(WebDriver driver, final By Source) {
		Wait<WebDriver> Mywait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		WebElement element=Mywait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(Source);
			}
		});
		
		return element;
	}
	

}
