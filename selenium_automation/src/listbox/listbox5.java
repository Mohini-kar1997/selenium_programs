package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("mohini");
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\" and @name=\"lastname\"]")).sendKeys("patil");
		driver.findElement(By.name("reg_email__")).sendKeys("133");
		driver.findElement(By.id("password_step_input")).sendKeys("456789");
        WebElement day=driver.findElement(By.id("day"));
		
		WebElement month=driver.findElement(By.id("month"));
		
		WebElement year=driver.findElement(By.id("year"));
		
		String Dob="23/Mar/2019";
		
		String[] date=Dob.split("/");
		//0-23
		//1-4
		//2-2019
		
		ListBox(day,date[0]);
		ListBox(month, date[1]);
		ListBox(year, date[2]);
		
		// ListBox(day,"22");
		// ListBox(month, "3");
		// ListBox(year. "2019");
		
	}

	private static void ListBox(WebElement element, String Text) {
		Select select1=new Select(element);
		select1.selectByVisibleText(Text);
		
	}

}
