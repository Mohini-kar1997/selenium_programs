package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_js3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("test");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		String expectedmessage="Please enter your password";
	Alert text=	driver.switchTo().alert();
	String alertmessage=text.getText();
	if(expectedmessage.equals(alertmessage))
		System.out.println("correct alert message");
	else
		System.out.println("incorrect alert message");
	Thread.sleep(3000);
	text.accept();
	Thread.sleep(3000);
	driver.quit();
	}

}
