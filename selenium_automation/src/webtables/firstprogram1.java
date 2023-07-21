package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstprogram1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// for scroll down
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement element=driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));

		js.executeScript("arguments[0].scrollIntoView();", element);
		
		//first way--number of rows in table
		
		int row=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("total number of rows--->"+row);
		
		//second way
		List<WebElement> row1=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println(row1.size());
		
		//number of columns in table
		int column=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("total number of rows--->"+column);
		
		List<WebElement> col=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		System.out.println(col.size());
		
		//retrive specific data
		String data=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[3]")).getText();
		System.out.println(data);
		
		
		//retrive all rowa and column
		
		for(int i=2;i<=row;i++) {
			for(int j=1;j<=column;j++) {
				String data1=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data1+"|");
			}
			System.out.println();
		}
		
		
		
		
	}

}
