package locator_css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_tag_id {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 // syntax== tagname and id===tagname#id
		 driver.get("https://www.facebook.com/login/");
		 driver.findElement(By.cssSelector("input#email")).sendKeys("mohini");
		 driver.findElement(By.cssSelector("input#pass")).sendKeys("4567");

	}

}
