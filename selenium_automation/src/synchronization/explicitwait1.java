package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		//WebDriverWait is class
		
		WebDriverWait web=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement element=web.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
        element.sendKeys("Pune");
        
        WebDriverWait web2=new WebDriverWait(driver, Duration.ofSeconds(20));
        
        WebElement element1=web2.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest")));
        element1.sendKeys("Mumbai");
        
        //WebElement element1=web2.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest1")));  for wrong id it will wait for 20sec before throwing exception
       // element1.sendKeys("Mumbai");
        
        Thread.sleep(3000);
        
        driver.quit();
        
	}

}
