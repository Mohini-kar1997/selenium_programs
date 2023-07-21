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

public class assignment2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		WebElement text=driver.findElement(By.xpath("//h2[text()='Login to Kite']"));
		Thread.sleep(2000);
        TakesScreenshot tk=((TakesScreenshot)text);
        File source=tk.getScreenshotAs(OutputType.FILE);
        String imagename="Assignment_text";
        String random=RandomString.make(4);
        File dest=new File("C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\screenshorts\\"+imagename+random+".jpg");
        FileHandler.copy(source, dest);
        driver.quit();
        }

}
