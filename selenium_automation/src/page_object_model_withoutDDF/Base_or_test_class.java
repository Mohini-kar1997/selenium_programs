package page_object_model_withoutDDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_or_test_class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		
		lp.Goto();
		lp.username("ADMIN");
		lp.password("admin123");
		lp.login();
		Thread.sleep(3000);
		
		dashboard_page d=new dashboard_page(driver);
		
		d.name_validation("boef Habibi");
		d.timeat();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
