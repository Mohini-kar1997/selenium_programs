package webElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_method {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mohini"); 
	
	WebElement obj= driver.findElement(By.xpath("//input[@type=\"password\"]"));
	obj.sendKeys("12345"); 
	driver.findElement(By.id("loginbutton")).click();
	}

}
