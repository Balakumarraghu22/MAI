package stepruner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import bass.Ulity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.LOGIN_PAGE_MAI;

public class MAI_LOGINPAGE extends Ulity {
	


	
@Given("I am on the MAI Project Owner Login page")
public void iAmOnTheMAIProjectOwnerLoginPage() {
	browers();
	driver.manage().window().maximize();
	
	driver.get("https://www.myproject.ai/project-owner/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
    
}
//Successful login with valid credentials

@When("I enter a valid email address {string}")
public void iEnterAValidEmailAddress(String email ) {
	
	LOGIN_PAGE_MAI L= new LOGIN_PAGE_MAI();
	L.getUser().sendKeys(email);
	
   
}
@When("I enter a valid password {string}")
public void iEnterAValidPassword(String pass) {
	LOGIN_PAGE_MAI L= new LOGIN_PAGE_MAI();
   
    L.getPass().sendKeys(pass);
}
@When("I click on the button")
public void iClickOnTheButton( ) {
	
	LOGIN_PAGE_MAI L= new LOGIN_PAGE_MAI();
	L.getClick().click();
  
}
@Then("I should be redirected to the dashboard")
public void iShouldBeRedirectedToTheDashboard() {
    
    
}

//Login attempt with invalid credentials/

@When("I enter an invalid email address {string}")
public void iEnterAnInvalidEmailAddress(String USERIN) {
	LOGIN_PAGE_MAI L= new LOGIN_PAGE_MAI();
    L.getUser().sendKeys(USERIN);

}
@When("I enter an invalid password {string}")
public void iEnterAnInvalidPassword(String PASS) {
	LOGIN_PAGE_MAI L= new LOGIN_PAGE_MAI();
	L.getPass().sendKeys(PASS);
	
    
}
@When("I click on the  button")
public void iClickOnTheButton1() {
	LOGIN_PAGE_MAI L= new LOGIN_PAGE_MAI();
	L.getClick().click();
}
@Then("I should see an error message ")
public void iShouldSeeAnErrorMessage() {
    
	
}


// 

@When("I leave the email address field blank")
public void iLeaveTheEmailAddressFieldBlank() {
	LOGIN_PAGE_MAI L= new LOGIN_PAGE_MAI();
	L.getUser().sendKeys();
}
@When("I leave the password field blank")
public void iLeaveThePasswordFieldBlank() {
	LOGIN_PAGE_MAI L= new LOGIN_PAGE_MAI();
	L.getPass().sendKeys();
}
@When("I click on the {string} button")
public void iClickOnTheButton(String string) {
	LOGIN_PAGE_MAI L= new LOGIN_PAGE_MAI();
	L.getClick().click();
}
@Then("I should see an error message {string}")
public void iShouldSeeAnErrorMessage(String string) {
    
}






}
