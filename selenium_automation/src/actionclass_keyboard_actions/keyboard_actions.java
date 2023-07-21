package actionclass_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		WebElement input1=driver.findElement(By.id("email"));
		WebElement input12=driver.findElement(By.id("pass"));
		
		Thread.sleep(3000);
		
		input1.sendKeys("mohini123");
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		
		
		//ctrl+a
       action.keyDown(Keys.CONTROL);
       action.sendKeys("a");
       action.keyUp(Keys.CONTROL);
       action.build().perform();
       
       //ctrl+c
       action.keyDown(Keys.CONTROL);
       action.sendKeys("c");
       action.keyUp(Keys.CONTROL);
       action.build().perform();
      
       //tab
       action.keyDown(Keys.TAB);
       action.build().perform();
       
       //ctrl+v
       action.keyDown(Keys.CONTROL);
       action.sendKeys("v");
       action.keyUp(Keys.CONTROL);
       action.build().perform();
       
       
       //compare text
       
       if(input1.getAttribute("value").equals(input12.getAttribute("value"))) {
    	   System.out.println("coppied coorrect");
       }
       else
       {
    	   System.out.println("copied incorrect");
       }
       
       
       driver.quit();
       
	}

}
