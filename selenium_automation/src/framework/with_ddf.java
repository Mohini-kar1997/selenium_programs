package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class with_ddf {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String path="C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\testdata\\username.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		String username=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		
        FileInputStream file2=new FileInputStream(path);
		
		String password=WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String userName="Paul Collings";
		
        String name=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		
		if(userName.equals(name)) {
			System.out.println("correct username");
		}
		else {
			System.out.println("incorrect username");
		}
driver.quit();
		
		

	}

}
