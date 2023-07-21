package actionclass_keyboard_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_actions2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/key_presses?");
		
	WebElement element=	driver.findElement(By.id("target"));
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		act.sendKeys(Keys.ESCAPE).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		act.sendKeys(Keys.SHIFT).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		Thread.sleep(3000);
		
		
		driver.quit();
	}
	
	}
	


