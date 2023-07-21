package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//implicit wait-dynamic-applicable to all elements in program
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);//wait applicable to each elelement
		
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);//static wait for particular step.
		
		driver.findElement(By.id("email")).sendKeys("mohini123");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.quit();
		
		//if execution happens in 5 seconds ignores remaining time
		// te tyala load vayla time det within tya time mde load nahi jhal tar ch exception throw karel
	}

}
