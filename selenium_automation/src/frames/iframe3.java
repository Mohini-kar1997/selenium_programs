package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();	
		WebElement outer=driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		driver.switchTo().frame(outer); // entered into outer frame
		String text=driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
		System.out.println(text);
		WebElement inner=driver.findElement(By.xpath("html/body/section/div/div/iframe"));// WebElement inner=driver.findElement(By.xpath("//div[@class=\"iframe-container\"]//iframe"));
		driver.switchTo().frame(inner);
		String text1=driver.findElement(By.xpath("//h5[contains(text(),'iFrame Demo')]")).getText();
	   System.out.println(text1);
	   driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("welcome");
	  // driver.switchTo().parentFrame();
	   Thread.sleep(3000);
	   
	   driver.switchTo().defaultContent();
	   driver.findElement(By.xpath("//a[text()='WebTable']")).click();
	   System.out.println("execution is complete");
	   driver.quit();
	}

}
