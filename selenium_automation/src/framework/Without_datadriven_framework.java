package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_datadriven_framework {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String username="Paul Collings";
		
		String name=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		
		if(username.equals(name)) {
			System.out.println("correct username");
		}
		else {
			System.out.println("incorrect username");
		}
driver.quit();
	}

}
