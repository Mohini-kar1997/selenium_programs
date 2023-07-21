package map_interface;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\driver_files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String name = logintest.logindata().get("D");
		
		String arr[]=name.split(":");
		
		//a[0]:mohini  a[1]: mohini1123
		
		driver.findElement(By.id("email")).sendKeys(arr[0]);
		
		driver.findElement(By.id("pass")).sendKeys(arr[1]);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	String actualString=	driver.getTitle();
	
	if(actualString.equals("Login to facebook")) {
		System.out.println("correct title");
	}
	else {
		System.out.println("incorrect title");
	}

	}
	
	public static HashMap<String, String> logindata() {
		
		HashMap<String, String> hMap = new HashMap<>();
		
		hMap.put("A","ketan:ketan123");
		hMap.put("B","aakash:aakash123");
		hMap.put("C","ketana:ketana123");
		hMap.put("D","mohii:mohini123");
		
		return hMap;
	}

}
