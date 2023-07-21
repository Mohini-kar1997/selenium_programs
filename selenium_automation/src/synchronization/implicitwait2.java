package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		driver.findElement(By.id("search2")).sendKeys("automation");
		
		driver.findElement(By.id("learntocode_searchbtn")).click();
		
		driver.quit();

	}

}
