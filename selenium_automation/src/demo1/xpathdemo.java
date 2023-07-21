package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login/");
WebElement web=driver.findElement(By.xpath("//img[@alt=\"Facebook\"]"));

boolean b=web.isDisplayed();
System.out.println(b);

	}

}
