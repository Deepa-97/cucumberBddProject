package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import PageObjects.AddNewCustomerPage;
import PageObjects.LoginPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.*;

public class steps {

	public WebDriver driver;
	public LoginPage Lp;
public AddNewCustomerPage adp;


	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {

		System.setProperty("WebDriver.Chrome.driver","/BDDCucumber/Drivers/chromedriver.exe");
		driver=new ChromeDriver();

		Lp=new LoginPage(driver);
adp=new AddNewCustomerPage (driver);

	}

	@When("User Opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}


	@When("User enters Email as \"admin@yourstore.com \"and Password as {string}")
	public void user_enters_email_as_admin_yourstore_com_and_password_as(String pwd) {

		Lp.setPassword(pwd);
	}


	@And("Click on Login")
	public void click_on_login() {
		Lp.clickLogin();
	}
//////////////////////////////////login/////////////////////////////////////////////////////////
	
	
	
	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle=driver.getTitle();

		if(actualTitle.equals(expectedTitle)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}


	}

	@When("User click on Logout link")
	public void user_click_on_logout_link() {
		Lp.clickLogout();
	}

	@And("Close browser")
	public void close_browser() {
		driver.quit();
		}
	
	
	
  ///////////////////////Add new customer//////////////////////
	
	
@Then("User can view Dashboard")
public void user_can_view_dashboard() {
	String actualTitle=adp.getTitle();
	String expTitle="Dashboard / nopcommerce administration";
	
	if(actualTitle.equals(expTitle)){
		Assert.assertTrue(true);
		
	}
	else {
		Assert.assertTrue(false);
	}
}

@When("User click on customers menu")
public void user_click_on_customers_menu() {
   adp.customer_menu();
}

@When("click on customers menu item")
public void click_on_customers_menu_item() {
adp.customeritm();
}

@When("click on Add new button")
public void click_on_add_new_button() {
 adp.Addnewcustomer();
}

@Then("User can view Add new customer page")
public void user_can_view_add_new_customer_page() {
	String actualTitle=adp.getTitle();
 String expectedTitle="Add a new customer / nopCommerce administration";

	if(actualTitle.equals(expectedTitle)){
		Assert.assertTrue(true);
		
	}
	else {
		Assert.assertTrue(false);
	}




}

@When("User enter customer info")
public void user_enter_customer_info() {
   adp.setEmail("test12@gmail.com");
   adp.setPassword("abc123");
   adp.firstname("swati");
   adp.lastname("sahoo");
  adp.setCompanyname("yyyyyy");
  adp.Admincomt("good");
}

@When("click on save button")
public void click_on_save_button() {
	adp.save();
}

@Then("User can view  confirmation message\"The new customer has been added successfully\"")
public void user_can_view_confirmation_message_the_new_customer_has_been_added_successfully(String expected) {
    
String bodyTagText=driver.findElement(By.tagName("Body")).getText();
if(bodyTagText.contains(expected)){
	Assert.assertTrue(true);
	
	}
	else {
		Assert.assertTrue(false);
	}

}
}



    





