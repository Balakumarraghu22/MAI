package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bass.Ulity;

public class MAI_POST_PROJECT extends Ulity {

	public MAI_POST_PROJECT() {
		PageFactory.initElements(driver, this);

	
	}
    
	@FindBy(xpath="//input[@name='project_title']")
	private WebElement projecttitle ;
	
	@FindBy(xpath="//select[@name='category']")
	private WebElement  Category;
	
	@FindBy(xpath="//select[@name='sub_category']")
	private WebElement Subcategory;
	
	@FindBy(xpath="//div[@class='ql-editor ql-blank']//p")
	private WebElement  Description;
	
	@FindBy(xpath="//button[normalize-space()='Browse']")
	private WebElement validimage;
	
	
	@FindBy(xpath = "//select[@name='budget_type']")
	private WebElement BudgetType;
	
	@FindBy(xpath="//div[@class='css-19bb58m']")
	private WebElement ProjectCounty;
	
	private WebElement StartingDate;
	
	private WebElement ExpiryDate;
	
	private WebElement ProjectDurationDays;
	
	private WebElement asthePostCode;
	
	private WebElement  checkbox;
	
	private WebElement button;
	
	public WebElement getProjecttitle() {
		
		
		return projecttitle;
	}
	public WebElement getCategory() {
		
		
		return Category;
	}
	public WebElement getSubcategory() {
		return Subcategory;
	}
	public WebElement getDescription() {
		return Description;
	}
	public WebElement getValidimage() {
		return validimage;
	}
	public WebElement getBudgetType() {
		return BudgetType;
	}
	public WebElement getProjectCounty() {
		return ProjectCounty;
	}
	public WebElement getStartingDate() {
		return StartingDate;
	}
	public WebElement getExpiryDate() {
		return ExpiryDate;
	}
	public WebElement getProjectDurationDays() {
		return ProjectDurationDays;
	}
	public WebElement getAsthePostCode() {
		return asthePostCode;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getButton() {
		return button;
	}

	
	
}
