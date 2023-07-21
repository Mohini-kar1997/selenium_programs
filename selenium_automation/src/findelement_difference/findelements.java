package findelement_difference;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// import list of java
	List<WebElement> serachbox=	driver.findElements(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));//return single webelement because only one is there
	System.out.println(serachbox.size());
	
	List<WebElement> links=driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));//returns list of webelement
	System.out.println(links.size());
	
	for(WebElement ele:links) {
		System.out.println(ele.getText());
	}
	
	List<WebElement> link1=driver.findElements(By.xpath("//a[@class=\"nav\"]")); // if element is not present it will return zero
	System.out.println(link1.size());
	

	}

}
