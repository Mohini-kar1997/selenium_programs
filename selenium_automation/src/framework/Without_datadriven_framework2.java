package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_datadriven_framework2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("DV1510");
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Vijay@123");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
