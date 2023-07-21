package actions_class_mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		//drag and drop
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
	WebElement source=	driver.findElement(By.id("box3"));
    WebElement dest= driver.findElement(By.id("box103"));
    Thread.sleep(3000);
    
    Actions action=new Actions(driver);
    
    action.dragAndDrop(source, dest).build().perform();
    
    Thread.sleep(9000);
    
   //driver.quit();
	}

}
