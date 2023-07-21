package page_object_model_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard_page {
	WebDriver driver;

	public dashboard_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//p[@class=\"oxd-userdropdown-name\"]")
	private WebElement name;
	
	@FindBy(xpath="//p[@class=\"oxd-text oxd-text--p\"]")
	private WebElement time_at;
	
	public void name_validation(String myname) {
		  String text=name.getText();
		if(name.equals(myname)) {
			System.out.println("name is correct");
		}
		else {
			System.out.println("name is incorrect");
		}
		
		
	}
    
	public void timeat() {
		boolean time=time_at.isDisplayed();
		System.out.println(time);
	}
}
