package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {
	public PIMPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Employee List")
	private WebElement EmloyeeListButton;
	
	@FindBy(linkText = "Add Employee")
	private WebElement AddEmployeeButton;
	
	public WebElement getEmployeeListButton() {
		return EmloyeeListButton;
	}
    public WebElement getAddEmployeeButton() {
    	return AddEmployeeButton;
    }
    	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
    	private WebElement PimButton;

		public WebElement getPimButton() {
			return PimButton;
		}
    
   
}
