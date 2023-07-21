package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox2 {

	public static void main(String[] args) throws InterruptedException {
		//using select class-by visible text
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("mohini");
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\" and @name=\"lastname\"]")).sendKeys("patil");
		driver.findElement(By.name("reg_email__")).sendKeys("133");
		driver.findElement(By.id("password_step_input")).sendKeys("456789");
		WebElement day=driver.findElement(By.id("day"));
		
		WebElement month=driver.findElement(By.id("month"));
		
		WebElement year=driver.findElement(By.id("year"));
		Select select1=new Select(day);
		//select by visible text (string text)
		select1.selectByVisibleText("7");
		Thread.sleep(3000);
		Select select2=new Select(month);
		select2.selectByVisibleText("Feb");
		Thread.sleep(5000);
		Select select3=new Select(year);
		select3.selectByVisibleText("2021");

	}

}
