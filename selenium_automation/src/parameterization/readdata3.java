package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readdata3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		 
		String path="C:\\Users\\mohin\\OneDrive\\Desktop\\files_for reading\\StudentInfo.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
		
		FileInputStream file2=new FileInputStream(path);
		String data2=WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data2);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(data+data2);
		driver.findElement(By.id("pass")).sendKeys(data2);
		driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
