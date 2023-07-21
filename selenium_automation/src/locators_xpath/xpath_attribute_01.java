package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_attribute_01 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.xpath("//input[@fdprocessedid=\"ukbifm\"]")).sendKeys("mohini");
	}

}
