package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_method {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");// to open the url on browser
		Thread.sleep(5000);
		driver.close(); // to close the current open browser--return type is void

	}

}
