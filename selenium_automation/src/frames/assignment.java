package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/frames");
	driver.manage().window().maximize();
	driver.switchTo().frame("frame1");
	Thread.sleep(3000);
	String data=driver.findElement(By.xpath("//h1[contains(text(),'This is a sample page')]")).getText();
	System.out.println(data);
	driver.quit();
	}

}
