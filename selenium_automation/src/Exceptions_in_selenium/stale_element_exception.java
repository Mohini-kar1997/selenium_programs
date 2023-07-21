package Exceptions_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stale_element_exception {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		
		link.click();
		
		driver.navigate().back();
		
		//link.click(); //StaleElementReferenceException--because element reference is not present

		try {
			link.click();
		}catch(StaleElementReferenceException e){
			WebElement link1=driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
			link1.click();
			
			
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
