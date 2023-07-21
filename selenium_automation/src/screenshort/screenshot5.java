package screenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"Facebook\"]"));
		Thread.sleep(3000);
		TakesScreenshot tk=((TakesScreenshot)logo); // use only webelemet to typecast the interface
		File source=tk.getScreenshotAs(OutputType.FILE);
		String imagename="fblog0_";
		String random=RandomString.make(4);
		File Dest=new File("C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\screenshorts\\"+imagename+random+".jpeg");// at the end \\ is mandatory
		FileHandler.copy(source, Dest);
		driver.quit();

	}

}
