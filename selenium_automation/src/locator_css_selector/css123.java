package locator_css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css123 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
		 driver.findElement(By.cssSelector("input.inputtext._55r1.inputtext._1kbt.inputtext._1kbt")).sendKeys("mohini");
	}

}
