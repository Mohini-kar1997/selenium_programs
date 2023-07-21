package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.drive", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\driver_files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
