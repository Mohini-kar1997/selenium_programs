package screenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	TakesScreenshot tk=((TakesScreenshot)driver);
	File source=tk.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("C:\\Users\\mohin\\OneDrive\\Desktop\\automation_ss\\assign.jpg");
	FileHandler.copy(source, dest);
	driver.quit();
	}

}
