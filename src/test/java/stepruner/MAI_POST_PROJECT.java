package stepruner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import bass.Ulity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.LOGIN_PAGE_MAI;

public class MAI_POST_PROJECT extends Ulity {
	
	
	//io.cucumber.junit.UndefinedStepException: The step 'I am on the "Post a Project" page' and 13 other step(s) are undefined.
	//You can implement these steps using the snippet(s) below:

	@Given ("I am on the page")
	public void i_am_on_the_page( ) {
	    browers();
	    LOGIN_PAGE_MAI p = new LOGIN_PAGE_MAI();
	    p.getUser().sendKeys("jrb224487@gmail.com");
	    p.getPass().sendKeys("Jrb@224487");
	    p.getClick().click();;
	    driver.findElement(By.xpath("//a[@role='button']")).click();	    
	}
	
	

	@When("I enter {string} as the Project Title")
	
	public void iEnterAsTheProjectTitle(String nmae) {
		pom.MAI_POST_PROJECT p =new pom.MAI_POST_PROJECT();
		p.getProjecttitle().sendKeys(nmae);
		 
		
	   
	}
	@When("I select {string} from the Category dropdown")
	public void iSelectFromTheCategoryDropdown(String string) {
	    pom.MAI_POST_PROJECT p = new pom.MAI_POST_PROJECT();
	    WebElement category = p.getCategory();
	    Select  s = new Select(category);
	    s.selectByVisibleText("Bricklaying");
		
	   
	}
	@When("I select {string} from the Sub-category dropdown")
	public void iSelectFromTheSubCategoryDropdown(String string) {
	    
	   pom.MAI_POST_PROJECT p = new pom.MAI_POST_PROJECT();
	   WebElement subcategory = p.getSubcategory();
	   Select s = new Select(subcategory);
	   s.selectByVisibleText("Retaining Walls");
	  
	  
		
	}
	@When("I write {string} in the Project Description")
	public void iWriteInTheProjectDescription(String description) {
		
		
		
	    pom.MAI_POST_PROJECT p = new pom.MAI_POST_PROJECT();
	    p.getDescription().sendKeys(description);
	   driver.findElement(By.xpath("//div[@name='files']")).click();
	   
	   
	}
	@When("I upload a valid image in {string} format")
	public void iUploadAValidImageInFormat(String string) {
	    pom.MAI_POST_PROJECT p = new pom.MAI_POST_PROJECT();
	    WebElement validimage = p.getValidimage();
	    validimage.click();
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", validimage);
	    
	   
	}
	@When("I select {string} as the Budget Type")
	public void iSelectAsTheBudgetType(String string) throws InterruptedException {
	Thread.sleep(30);
		
	    pom.MAI_POST_PROJECT p = new pom.MAI_POST_PROJECT();
	    WebElement budgetType = p.getBudgetType();
	  Select s = new Select(budgetType); s.selectByIndex(1);
	   
	}
	@When("I enter {string} as the Project County")
	public void iEnterAsTheProjectCounty(String string) {
	   pom.MAI_POST_PROJECT p = new pom.MAI_POST_PROJECT();
	   WebElement projectCounty = p.getProjectCounty();
	   Select s = new Select(projectCounty);
	   s.selectByIndex(2);
	   
	}
	@When("I set the Starting Date to {string}")
	public void iSetTheStartingDateTo(String string) {
	    
	   
	}
	@When("I set the Expiry Date to {string}")
	public void iSetTheExpiryDateTo(String string) {
	    
	   
	}
	@When("I enter {string} as the Project Duration Days")
	public void iEnterAsTheProjectDurationDays(String string) {
	    
	   
	}
	@When("I enter {string} as the Post Code")
	public void iEnterAsThePostCode(String string) {
	    
	   
	}
	@When("I check the {string} checkbox")
	public void iCheckTheCheckbox(String string) {
	    
	   
	}
	@Then("I should see a confirmation message {string}")
	public void iShouldSeeAConfirmationMessage(String string) {
	    
	   
	}



	
	

}