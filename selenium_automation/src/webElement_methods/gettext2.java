package webElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String expected1="log in to fb";
	String actual=driver.findElement(By.xpath("//div[text()='Log in to Facebook']")).getText();
	System.out.println(actual);
	if(expected1.equals(actual)) {
		System.out.println("correct text");
	}
	else {
		System.out.println("incorrect text");
	}
	}

}
