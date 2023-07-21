package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_attribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//syntax----//tagname[@attributeName="attributevalue"
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("mohini@com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("abcccccc");
		Thread.sleep(3000);
		WebElement b=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		boolean result=b.isEnabled();
		System.out.println(result);
		
		
	}

}
