package screenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshort1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//take screenshort and copy object
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination=new File("\\Users\\mohin\\OneDrive\\Desktop\\automation_ss\\sample.jpg");
		
		FileHandler.copy(source, destination);
		driver.quit();

	}

}
