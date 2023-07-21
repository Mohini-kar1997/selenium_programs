package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contains_by_attribute1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        // syntax---- //tagname[contains(@atrrbuteName,'attributevalue')]
        driver.findElement(By.xpath("//input[contains(@class,'_55r1 inputtext _1kbt')]")).sendKeys("mohini09876");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("1234567890");
        driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _52e0')]")).click();
        driver.close();
        }

}
