package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//syntax---//tagname[text()='textvalue']
		// <tagname>text</tagname>---text--anything inbetween ><
		driver.findElement(By.xpath("//a[text()='Create a Page']")).click();

	}

}
