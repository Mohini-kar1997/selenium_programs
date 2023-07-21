package actions_class_mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_over {

	public static void main(String[] args) throws InterruptedException {
		//move mouse to the particular element
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		
		WebElement account=driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));//mouse over to account and list
		
		Actions action=new Actions(driver);
		
		action.moveToElement(account).build().perform();
		//this action will move mouse to the particular element
		
		//to pause the screen=source column then ctrl+\
		driver.findElement(By.xpath("(//span[contains(text(),'Sign in') and @class=\"nav-action-inner\"])[1]")).click();// not understood index
		
		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("mohinikarambalkar@gmail.com");
		
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("12345");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		
		Thread.sleep(3000);
		
		boolean text=driver.findElement(By.xpath("//span[@class=\"a-list-item\"]")).isDisplayed();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	}

}
