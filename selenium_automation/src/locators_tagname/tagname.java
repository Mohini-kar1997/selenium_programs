package locators_tagname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.tagName("input")).sendKeys("mohini");
		//driver.findElement(By.tagName("input")).sendKeys("patil"); -- with two same tagname it will go to the same feild 
		//preference will be given to the first feild

	}

}
