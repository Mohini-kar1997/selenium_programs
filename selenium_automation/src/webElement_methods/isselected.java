package webElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("mohini");
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\" and @name=\"lastname\"]")).sendKeys("patil");
		driver.findElement(By.name("reg_email__")).sendKeys("133");
		driver.findElement(By.id("password_step_input")).sendKeys("456789");
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//option[@value=\"6\"]")).click();
		boolean un=driver.findElement(By.xpath("//option[@value=\"6\"]")).isSelected();
		System.out.println(un);

	}

}
