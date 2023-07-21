package locators_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_by_id {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
		 driver.findElement(By.id("email")).sendKeys("mohini2432654");

	}

}
