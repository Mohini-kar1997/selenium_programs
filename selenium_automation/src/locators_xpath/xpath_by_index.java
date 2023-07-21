package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_index {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//syntax---- (xpath_expression)[indexNumber]
		//driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[11]")).click();
		WebElement obj=driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[11]"));
		obj.click();

	}

}
