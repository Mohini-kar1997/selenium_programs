package locators_linktext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partial_linktext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	driver.findElement(By.partialLinkText("Forgotten")).click(); // any String part of link not necessarily to give entire link as it is 

	}

}
