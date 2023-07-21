package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_by_elements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.w3schools.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		WebElement element=driver.findElement(By.xpath("//h1[contains(text(),'Code Editor')]"));
		
	
		js.executeScript("arguments[0].scrollIntoView();", element);
		 //not working
		

	}

}
