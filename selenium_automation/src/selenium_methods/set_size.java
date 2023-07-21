package selenium_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class set_size {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe null");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Dimension d1=new Dimension(800, 700);
		driver.manage().window().setSize(d1);
		
		Thread.sleep(6000);
		
		System.out.println(driver.manage().window().getSize());
		driver.close();

	}

}
