package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	driver.manage().window().maximize();
	
	driver.switchTo().frame("iframeResult"); // switch to frame
	
/* through xpath it will enter into frame*/	
	driver.findElement(By.xpath("//button[@type=\"button\"]")).click(); // will throw nosuchelement exception
	// first we have to shift from main page to frame
	
	Thread.sleep(3000);
	driver.switchTo().defaultContent();// exit from frame
	// after exit exactly where to go ??-- decided by xpath given
	driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();	
	Thread.sleep(3000);
	driver.quit();
	}

}
