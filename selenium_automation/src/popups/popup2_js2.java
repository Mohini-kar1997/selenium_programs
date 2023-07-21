package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup2_js2 {
	public static void main(String[] args) throws InterruptedException {
		//javascript alert and confirmation popup
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert a1=new Alert(); ---can not create object
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(4000);
	Alert text=	driver.switchTo().alert();
	System.out.println("alert message--->"+text.getText());
	Thread.sleep(3000);
	text.sendKeys("welcome");
	Thread.sleep(3000);
	text.accept();
	Thread.sleep(3000);
	driver.quit();
		
	}

}
