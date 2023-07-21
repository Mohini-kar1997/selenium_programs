package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.close();
	}

}
