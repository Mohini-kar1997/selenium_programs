package locators_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_by_name {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.drive", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\driver_files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.name("email")).sendKeys("mohini");

	}

}
