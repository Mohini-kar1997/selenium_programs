package locators_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class by_id {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.drive", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\driver_files\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://practicetestautomation.com/practice-test-login/");
		 
		 driver.findElement(By.id("username")).sendKeys("student123");
		 
		 driver.findElement(By.name("password")).sendKeys("126547");
	}

}
