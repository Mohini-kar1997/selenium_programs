package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlight_border {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement element=	driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
	WebElement element1=driver.findElement(By.id("email"));
	
	js.executeScript("arguments[0].style.border='5px solid red'", element);
	js.executeScript("arguments[0].style.border='5px solid yellow'", element1);
	
		
		
		Thread.sleep(3000);
	driver.quit();

	}

}
