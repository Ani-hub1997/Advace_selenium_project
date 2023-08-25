package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {
	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
   @FindBy(name = "firstname")
   private WebElement firstnameTextfield;
   
   
   @FindBy(name = "lastname")
   private WebElement lastnameTextfield;
   @FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
   private WebElement EmployeeIdTextfield;
   @FindBy(xpath = "//button[@class='oxd-icon-button oxd-main-menu-button']")
   private WebElement savebutton;
   public WebElement getfirstnameTextfield() {
	   return firstnameTextfield;
   }
   public WebElement getlastnameTextfield() {
	   return lastnameTextfield;
   }
   
  
   }

