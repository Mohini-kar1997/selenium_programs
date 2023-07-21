package page_object_model_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage { //POM class
	//does not contain main method
	
	WebDriver driver; //instance variable
	
	//create constructor
	public LoginPage(WebDriver driver) { //local variable
		
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this); //Pagefactory=class,  initElements=static method
		
	}
	
	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement login;
	
	public void username(String email) {
		username.sendKeys(email);
	}
	
	public void password(String pass) {
		password.sendKeys(pass);
		
	}
	
	public void login() {
		login.click();
	}

	public void Goto() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}

}
