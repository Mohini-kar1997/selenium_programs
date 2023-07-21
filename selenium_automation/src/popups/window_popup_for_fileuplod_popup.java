package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_popup_for_fileuplod_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/upload");
		
		driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\mohin\\OneDrive\\Desktop\\Employee.xlsx");
		driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
		
		Thread.sleep(3000);
		
		Boolean b=driver.findElement(By.xpath("//h3[contains(text(),'File Uploaded!')]")).isDisplayed();
		System.out.println(b);
        driver.quit();
	}

}
