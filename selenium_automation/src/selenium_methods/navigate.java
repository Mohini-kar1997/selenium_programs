package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String title=driver.getTitle();
	System.out.println(title);
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	String title1=driver.getTitle();
	System.out.println(title1);
	driver.navigate().to("https://www.facebook.com/login/");
	Thread.sleep(2000);
	String title2=driver.getTitle();
	System.out.println(title2);
	
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.close();
	}

}
