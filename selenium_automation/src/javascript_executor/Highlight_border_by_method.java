package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_border_by_method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement element=	driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		WebElement element1=driver.findElement(By.id("email"));
		WebElement element2=driver.findElement(By.id("pass"));
		
		Highlight_border_by_method.drawborder(driver, element);
		Highlight_border_by_method.drawborder(driver, element2);
		

	}
	
	public static void drawborder(WebDriver driver, WebElement element ) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].style.border='5px solid red'", element);
		js.executeScript("arguments[0].style.background='yellow'", element);
		}

}
