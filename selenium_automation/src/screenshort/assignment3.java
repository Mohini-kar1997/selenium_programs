package screenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class assignment3 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		assignment3.Takescrenshot();
		assignment3.Takescrenshot();
		assignment3.Takescrenshot();
		driver.quit();		

	}
	
	public static void Takescrenshot() throws IOException {
		TakesScreenshot tk=((TakesScreenshot)driver);
	File source=tk.getScreenshotAs(OutputType.FILE);
	String ssname="take_assign";
String random=RandomString.make(3);
	File dest=new File("C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\screenshorts\\"+ssname+random+".jpg");
	FileHandler.copy(source, dest);
	
	}

}
