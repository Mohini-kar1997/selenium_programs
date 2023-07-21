package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tesst {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://byjus.com/learn/profile");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your mobile number\"]")).sendKeys("7411748240");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//input[@autocomplete=\"one-time-code\"][1]")).sendKeys("5");
		
	}

}
