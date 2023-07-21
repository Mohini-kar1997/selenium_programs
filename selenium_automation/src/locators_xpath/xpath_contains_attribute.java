package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains_attribute {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[contains(@class,'text _55r1')]")).sendKeys("mohini@123");//contains by attribute
		// syntax---//tagname[contains(@Attributename,'attributevalue')]
		driver.findElement(By.xpath("//input[contains(@class,'_9npi inputtext _9npi')]")).sendKeys("1234");
		//syntax---//tagname[contains(text(),'textvalue']
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();//contains by text

	}

}

