package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bass.Ulity;

public class LOGIN_PAGE_MAI extends Ulity{

	public LOGIN_PAGE_MAI() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email")
 private WebElement user;
	
	 @FindBy(id="password")
	 private WebElement pass;
	 
	@FindBy(xpath="//button[@type='submit']")
	 private WebElement click;
	
	@FindBy(xpath="//div[contains(text(),'Invalid email format')]")
	 private WebElement erorrmsg ;
	
 
	 
	 
public WebElement getErorrmsg() {
		return erorrmsg;
	}


public WebElement getPass() {
		return pass;
	}


	public WebElement getClick() {
		return click;
	}


public WebElement getUser() {
	return user;
}

    

}