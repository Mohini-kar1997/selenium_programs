package locators_classname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.className("inputtext")).sendKeys("mohini");
	// driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi- ")).sendKeys("1234");

		// driver.findElement(By.className("inputtext")).sendKeys("1234");//goes to the same feild

		/*In this case, this class name marked as "inputtext _55r1 inputtext _9npi inputtext _9npi- "contains three 
		spaces thereby making it three different classes*/
		/*Hence, Selenium mentions the error stating it cannot find multiple classes together.
		In this case, you can opt to locate element by CSS selector in Selenium or by XPath in Selenium using the class name attribute.*/
	}

}
 