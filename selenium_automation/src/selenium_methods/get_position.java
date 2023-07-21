package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_position {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe null");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize(); // give differnt position according to max and min
        Thread.sleep(3000);
        System.out.println(driver.manage().window().getPosition());
        driver.close();

	}

}
