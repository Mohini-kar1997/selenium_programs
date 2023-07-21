package locator_css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_atribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 // syntax== tagname and id===tagname#id
		 driver.get("https://www.facebook.com/login/");
		// driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys("mohini");
		// driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("mohini123");
		driver.findElement(By.cssSelector("input.inputtext[name=\"email\"]")).sendKeys("mohinipatil");
//driver.findElement(By.cssSelector("input.inputtext[class=\"inputtext\"]")).sendKeys("mohini");
		 driver.findElement(By.cssSelector("input.inputtext.55r1.inputtext.1kbt.inputtext._1kbt")).sendKeys("mohini");
		 
	
	}

}
