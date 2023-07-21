package actions_class_mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {

	public static void main(String[] args) throws InterruptedException {
		//double click action
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	WebElement element=	driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));

	Actions action=new Actions(driver);
	
	action.doubleClick(element).build().perform();
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();
	
	driver.quit();
	}

}
