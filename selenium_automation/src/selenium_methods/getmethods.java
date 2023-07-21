package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		//it is static method which receives string arguments--returns string
		//system is class
		WebDriver driver=new ChromeDriver(); //webdriver--interface
		driver.get("https://www.facebook.com/login/");//used to open application or entered url on web browser
		//return type is void
		//driver.get("https://www.ace46765.com/login/");--for wrong url --webdriver exception
		

	}

}
