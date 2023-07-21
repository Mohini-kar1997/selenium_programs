package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_current_url {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); 
	driver.get("https://www.facebook.com/login/"); //it will open url in browser
    String url= driver.getCurrentUrl();// it returns string
    System.out.println(url);
    if(url.equals("https://www.facebook.com/login/")) {
    	System.out.println("correct url");
    }
    else
    {
    	System.out.println("incorrect url");
    }
    Thread.sleep(2000);
    driver.close();

	}

}
