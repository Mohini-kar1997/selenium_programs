package webElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		boolean un=driver.findElement(By.xpath("//label[text()='Female']")).isEnabled();
		System.out.println(un);

	}

}
