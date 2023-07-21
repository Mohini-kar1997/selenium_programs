package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe4 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		String text=driver.findElement(By.xpath("//h1[contains(text(),'This page is displayed in an iframe')]")).getText();
		System.out.println(text);
		driver.switchTo().parentFrame();
	String text1=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]")).getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
