package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {

	
	

	public WebDriver ldriver;

	public AddNewCustomerPage(WebDriver rdriver){
		
		ldriver=rdriver;
	PageFactory.initElements(ldriver,this);	
	}	
	
	@FindBy(xpath="((//a[@class='nav-link'])[21]")
	WebElement ink_customermenu;
	
	
	@FindBy(xpath="((//a[@class='nav-link'])[22]")
	WebElement ink_customeritem;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement addnew ;
	
	
	@FindBy(id="Email")
	WebElement txtmail;
	
	
	@FindBy(id="Password")
	WebElement txtpw  ;
	
    @FindBy(id="FirstName")
	WebElement fstnm;  ;
	
	@FindBy(id="LastName")
	WebElement Lstnm  ;
	
	@FindBy(id="Company")
	WebElement companynm;
	
	@FindBy(id="AdminComment")
	WebElement admincmt;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement savebtn;  
	  
	
public String getTitle() {
	return ldriver.getTitle();
}	
	
public void customer_menu() {
	ink_customermenu.click();
}	
public void customeritm() {
	ink_customeritem.click();
}		
public void Addnewcustomer() {
	addnew.click();
}		
	
public void setEmail(String email) {
	txtmail.sendKeys(email);
}		
public void setPassword(String password) {
	txtpw .sendKeys(password);
}	
public void firstname(String firstnm) {
fstnm.sendKeys(firstnm);
}	
	
public void lastname(String lastname) {
	Lstnm .sendKeys(lastname);
}		
	
	

public void setCompanyname(String company) {
	companynm.sendKeys(company);
}	
	
public void Admincomt(String comment) {
	admincmt.sendKeys(comment);
}	
	
public void save() {
	savebtn.click();
}	
	
	
	
	
	
	
	
	
	
	
}
