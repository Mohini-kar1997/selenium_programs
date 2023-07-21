package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		By input1=By.id("src");
		
		explicitwait2.waitforelement(driver, input1, 20).sendKeys("Pune");

       By input2=By.id("dest");
		
		explicitwait2.waitforelement(driver, input2, 20).sendKeys("Mumbai");
		
		
		//  By input2=By.id("dest1"); for wrong id it will wait for 20sec before throwing exception
		
	//	explicitwait2.waitforelement(driver, input2, 20).sendKeys("Mumbai");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}
	
	public static WebElement waitforelement(WebDriver driver, By locator, int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);
	}

}
