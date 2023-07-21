package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authentication_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//driver.switchTo().alert().sendKeys("admin");
		//driver.switchTo().alert().sendKeys("admin");
		
		String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.quit();
	}

}
