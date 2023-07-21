package popup_assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("parentWindow id-->"+parentwindow);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//a[text()=\"Visit W3Schools.com!\"]")).click();
		
		Thread.sleep(5000);
		
		Set<String>childwindow=driver.getWindowHandles();
		
		
		System.out.println("childwindow id-->"+childwindow);
		
		List<String> windowlist=new ArrayList(childwindow);
		String parent=windowlist.get(0);
		String child = windowlist.get(1);
		
		System.out.println("parentwindow-->"+parent);
		System.out.println("childwindow-->"+child);
		driver.switchTo().window(child);
		Boolean logo =driver.findElement(By.xpath("//i[@class=\"fa fa-logo ws-hover-text-green\"]")).isDisplayed();
		
		System.out.println(logo);
		Thread.sleep(4000);
		driver.switchTo().window(parentwindow);
		Thread.sleep(5000);
		String parentwindow2=driver.getWindowHandle();
		
		System.out.println(parentwindow2);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		String runtext=driver.findElement(By.xpath("//button[@id=\"runbtn\"]")).getText();
		System.out.println(runtext);
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}


	}


