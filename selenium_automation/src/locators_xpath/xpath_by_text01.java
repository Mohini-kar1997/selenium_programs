package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_text01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		//driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		//driver.findElement(By.xpath("//button[text()='           Sign in         ']")).click();
		driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();

	}

}
