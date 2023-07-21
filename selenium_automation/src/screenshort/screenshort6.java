package screenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshort6 {
     static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		String file="FFFFacebook";
		screenshort6.Takesscreenshot("fbb_logo");
		screenshort6.Takesscreenshot(file);
		screenshort6.Takesscreenshot("test1"+file);
		driver.quit();

	}
	
	
	public static void Takesscreenshot(String Filename) throws IOException, InterruptedException {
		TakesScreenshot tk=((TakesScreenshot)driver);
		Thread.sleep(2000);
		File source=tk.getScreenshotAs(OutputType.FILE);
	    String random= RandomString.make(4);
	    File dest=new File("C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\screenshorts\\"+Filename+random+".jpg");
	    FileHandler.copy(source, dest);
	}

}
