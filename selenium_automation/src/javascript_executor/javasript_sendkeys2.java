package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javasript_sendkeys2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement element1=driver.findElement(By.id("email"));
		WebElement element2=driver.findElement(By.id("pass"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//second way
		
		js.executeScript("arguments[0].value='"+"testqe"+"';", element1);
		js.executeScript("arguments[0].value='"+"tes123"+"';", element2);
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
