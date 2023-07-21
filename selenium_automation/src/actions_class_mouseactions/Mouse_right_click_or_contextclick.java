package actions_class_mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_right_click_or_contextclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement element=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		
		Actions action=new Actions(driver);
		
		action.contextClick(element).build().perform();
		
		driver.findElement(By.xpath("//li[@class=\"context-menu-item context-menu-icon context-menu-icon-copy\"]")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		action.contextClick(element).build().perform();
		driver.findElement(By.xpath("//li[@class=\"context-menu-item context-menu-icon context-menu-icon-paste\"]")).click();
		Thread.sleep(3000);
	System.out.println(driver.switchTo().alert().getText());
	
	driver.switchTo().alert().accept();
	
	driver.quit();
	

	}

}
