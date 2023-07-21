package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class permission_popup {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	 option.addArguments("---disable-notifications");
	 
	 //javascript alert and confirmation popup
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
