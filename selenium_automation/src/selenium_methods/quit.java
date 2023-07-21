package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe null");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(5000);
		// driver.close(); only close current url
		driver.quit();// return type is void ---use to quit all the methods
		
	}

}
