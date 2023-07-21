package locators_linktext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Forgotten account?")).click(); // we have to give exact link as it is 
		String str=driver.findElement(By.linkText("Forgotten account?")).getText();
		System.out.println(str);

	}

}
