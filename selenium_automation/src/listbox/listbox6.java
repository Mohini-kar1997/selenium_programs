package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listbox6 {

	public static void main(String[] args) throws InterruptedException {
		// handle listbox without select class 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

		//driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("pune");
		
		driver.findElement(By.id("src")).sendKeys("pune");
		// driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("mumbai");
		
		List<WebElement> city=driver.findElements(By.xpath("//ul[@class=\"C120_suggestions\"]//li"));
		Thread.sleep(4000);
		System.out.println("Total count-->" +city.size());
		
		for(int i=0; i<city.size(); i++) {
			String citynames=city.get(i).getText();
			System.out.println(citynames);
			
			if(city.get(i).getText().equals("wakad")) {
				System.out.println(city.get(i).getText());
				city.get(i).click();
				}
		}
		
	}

}
