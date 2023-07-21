package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_title {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.driver","C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe null");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        String title=driver.getTitle();//returns string
        System.out.println(title);
        
        driver.close();
        
        String expected_title="Log in to Facebook";//it will be mentioned in requirments;
        
        if(title.equals(expected_title)) {
        	System.out.println("correct title");
        }
        else {
        	System.out.println("incorrect titile");
        }
        }

}
