package page_object_model_withDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_or_test_class {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		
		lp.Goto();
		String path="C:\\Users\\mohin\\eclipse-workspace\\selenium_automation\\testdata\\username.xlsx";
		FileInputStream file=new FileInputStream(path);
		Sheet data=WorkbookFactory.create(file).getSheet("Sheet1");
		
		String username=data.getRow(1).getCell(0).getStringCellValue();
		lp.username(username);
		String pass=data.getRow(1).getCell(1).getStringCellValue();
		lp.password(pass);
		lp.login();
		Thread.sleep(3000);
		
		dashboard_page d=new dashboard_page(driver);
		String name=data.getRow(1).getCell(2).getStringCellValue();
		d.name_validation(name);
		d.timeat();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
