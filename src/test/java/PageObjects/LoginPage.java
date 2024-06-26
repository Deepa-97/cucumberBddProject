package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public WebDriver ldriver;

public LoginPage(WebDriver rdriver){
	
	ldriver=rdriver;
PageFactory.initElements(rdriver,this);	
}	
	
	@FindBy(id="Email")
	WebElement txtEmail;
	
	@FindBy(id="Password")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnlogin;
	
	@FindBy(linkText="Logout")
	WebElement btnlogout;
	
	
		
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}	
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	
	}
	
	public void clickLogin() {
		btnlogin.click();
	
	}
	
	public void clickLogout() {
		btnlogout.click();
	

	}
		
	}
	
	
	
	
	
	
	
	
	


