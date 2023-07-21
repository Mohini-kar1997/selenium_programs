package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup2_js1 {

	public static void main(String[] args) throws InterruptedException {
		// javascript alert and confirmation popup
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert A1=new Alert(); -- we can not create object of interface
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	Boolean result_displayed=	driver.findElement(By.xpath("//h4[text()='Result:']")).isDisplayed();
	System.out.println(result_displayed);
		

	}

}
