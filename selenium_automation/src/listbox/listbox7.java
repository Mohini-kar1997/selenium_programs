package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\mohin\\\\eclipse-workspace\\\\selenium_automation\\\\resource\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mohini");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("karambalkar");
		driver.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("belgaum");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("mohini@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("7411748240");
		
		driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();	
		
		driver.findElement(By.xpath("//input[@id=\"checkbox2\"]")).click();	
		
		
		WebElement Skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		//to get total size of the list
		
		Select s1 = new Select(Skills);
		
		List<WebElement> Listskills = s1.getOptions();
		
		System.out.println("size of skillset-->"+Listskills.size());
		
		// to get all the skills from list
		
		for(int i = 0; i< Listskills.size(); i++) {
			
			String skillvalues= Listskills.get(i).getText();
			
			System.out.println(skillvalues);
		
			if(skillvalues.equals("APIs")) {
				
				Listskills.get(i).click();
				
			}
			
		}
		 
	
		
		WebElement  year=driver.findElement(By.id("yearbox"));
		WebElement  Month=driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		WebElement  Day=driver.findElement(By.id("daybox"));
		
		//1.....How will u get the total no size of list
		
		Select S1=new Select(year);
		List<WebElement> Listyear=S1.getOptions();
		
		System.out.println("Totalyear------->"+Listyear.size());
		
		//2.........how will u print all the values
		
		for(int i=0;i<Listyear.size();i++) {
			
			String yearValues=Listyear.get(i).getText();
			
			System.out.println(yearValues);
			
			//HOW WILL U SELECT SPECIFIC VALUES FROM THE DROPDOWN
			
			if(yearValues.equals("1923")) {
				
				Listyear.get(i).click();	
			}
		}
		
		//select month
		
		Select S2=new Select(Month);
		
		List<WebElement> Monthvalues=S2.getOptions();
		
		System.out.println("Total month--------->"+Monthvalues.size());
		
		System.out.println();
		
		for(int j=0;j<Monthvalues.size();j++) {
			
			String Months=Monthvalues.get(j).getText();
			System.out.println(Months);
			
			if(Months.equals("June")) {
				
				Monthvalues.get(j).click();
				
			}
			
		}
		
		
		//select day
		
	       Select S3=new Select(Day);
		
		List<WebElement> Dayvalues=S3.getOptions();
		
		System.out.println("Total days--------->"+Dayvalues.size());
		
		System.out.println();
		
		for(int j=0;j<Dayvalues.size();j++) {
			
			String Day1=Dayvalues.get(j).getText();
			System.out.println(Day1);
			
			if(Day1.equals("8")) {
				
				Dayvalues.get(j).click();
				
			}
			
		}
		
		
	}
		
		


		

	}


