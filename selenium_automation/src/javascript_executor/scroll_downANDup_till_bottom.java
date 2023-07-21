package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_downANDup_till_bottom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.w3schools.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scrolldown till bottom
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		Thread.sleep(3000);
		
		//scroll up
		
		js.executeScript("document.documentElement.scrollTop=0", "");

	}

}
