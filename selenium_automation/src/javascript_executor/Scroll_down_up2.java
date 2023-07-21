package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down_up2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.w3schools.com/");
		
		JavascriptExecutor js= driver;  //javascriptexecutor is interface
		
		//scrolldown
		
		js.executeScript("window.scrollBy(0,2000)", "");
		
		Thread.sleep(4000);
		
		//scrollup
		
		js.executeScript("window.scrollBy(0,-2000)", "");
		
		driver.quit();
		

	}

}
