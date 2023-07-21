package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		WebElement outer=driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
        driver.switchTo().frame(outer);
        Thread.sleep(2000);
        /* String text=driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
		System.out.println(text);*/
        WebElement inner=driver.findElement(By.xpath("//div[@class=\"iframe-container\"]//iframe"));
		driver.switchTo().frame(inner);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("welcome");
		Thread.sleep(3000);
		driver.quit();
	}

}
