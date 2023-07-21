package listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2_redbus {

	static WebDriver driver;
	 @SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
	      System.setProperty("Webdriver.Chrome.driver", "C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  
	  driver.get("https://www.redbus.in/");
	  
	  Thread.sleep(4000);
	  
	  driver.findElement(By.id("src")).sendKeys("pune");
	  
	  Thread.sleep(3000);
	  
	  List<WebElement> city = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//li"));
	  Thread.sleep(4000);
	  
	  //to print total size in dropdown
	  System.out.println("total cities="+city.size());
	  
	  // to print all values from dropdown
	  String option="Indapur";
	  for(int i = 0; i< city.size(); i++) {
	   String citynames= city.get(i).getText();
	   System.out.println(citynames);
	   Thread.sleep(2000);
	   
	   //to select the specific value from dropdown
	   if(city.get(i).getText().equals("Indapur")) {
	           System.out.println( city.get(i).getText());
	           city.get(i).click();
	   }
	   
	   if(city.get(i).getText().contains(option)) {
	    city.get(i).click();
	   }
	  }
	  
	        driver.findElement(By.id("dest")).sendKeys("mumbai");
	        List<WebElement> destcity = driver.findElements(By.xpath("//li[@class=\"sc-iwsKbI jTMXri cursorPointing\"]"));
	        Thread.sleep(4000);
	        System.out.println(destcity.size());
	        
	        //to print all city values
	        for(int j =0; j< destcity.size(); j++) {
	           String destcitynames=  destcity.get(j).getText();
	           System.out.println(destcitynames);
	           
	           //to select specific values
	           
	           if(destcity.get(j).getText().equals("Sion")) {
	            System.out.println(destcity.get(j).getText());
	            destcity.get(j).click();
	           }
	        }
	  
	  
	  
	  
	  Thread.sleep(4000);
	  driver.close();
	 }

	}


