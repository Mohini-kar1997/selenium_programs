package locator_css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
	 public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/login/");
		 //by id  === #id
		 driver.findElement(By.cssSelector("#email")).sendKeys("mohini");
		 driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
		 driver.findElement(By.cssSelector("#loginbutton")).click();
		 
		 
		 
		
	}

}
