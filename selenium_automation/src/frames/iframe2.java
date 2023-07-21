package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	driver.manage().window().maximize();
	driver.switchTo().frame("singleframe");
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("automation");
	Thread.sleep(3000);
	 driver.switchTo().defaultContent();
	 driver.findElement(By.xpath("//a[text()='Home']")).click();
	 Thread.sleep(3000);
	 driver.quit();
	}

}
