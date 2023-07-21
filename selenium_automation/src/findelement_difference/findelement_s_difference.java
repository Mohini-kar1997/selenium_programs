package findelement_difference;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement_s_difference {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement serach=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")); //returns single webelement
	serach.sendKeys("mobile");
	Thread.sleep(3000);
	
	WebElement link=driver.findElement(By.xpath("//a[@class=\"nav-a  \"]")); //here multiple elements are present but it will return single/first element
	System.out.println(link.getText());

	
//	WebElement link2=driver.findElement(By.xpath("//a[@class=\"navv-a  \"]")); //if element is not present=nosuchelement exception
	//System.out.println(link2.getText());
	
	driver.quit();
	
	

	}

}
