package locator_css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://login.yahoo.com/?.intl=in");
		// driver.findElement(By.cssSelector("input.inputtext[tabindex=\"1\"]")).sendKeys("mohini");
		// driver.findElement(By.id("username")).sendKeys("mohini");
		// driver.findElement(By.cssSelector("input.inputtext[type=\"email\"]")).sendKeys("moini");
		 driver.findElement(By.cssSelector("input.inputtext[name=\"username\"]")).sendKeys("mohini@yahoo");

	}

}
