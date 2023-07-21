package webElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	//	WebElement un=driver.findElement(By.xpath("//img[@class=\"_97vu img\"]"));
		// System.out.println(un.isDisplayed());
		boolean un=driver.findElement(By.xpath("//img[@class=\"_97vu img\"]")).isDisplayed();
		System.out.println(un);
	}

}
