package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name = "Username")
	private WebElement UsernameTextfield;
	
	@FindBy(name ="password")
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "//button[@type='submit']")
	private  WebElement loginButton;

	public WebElement getUsernameTextfield() {
		return UsernameTextfield;
	}
	
	public WebElement getpasswordTextfield() {
		return passwordTextfield;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginToApplication(String Username,String password) {
		getUsernameTextfield().sendKeys(Username);
		getpasswordTextfield().sendKeys(password);
		getLoginButton().click();
		
	}
}
