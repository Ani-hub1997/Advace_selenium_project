package genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import genericUtility.PropertyUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.AddEmployeePage;
import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.PIMPage;

public class Baseclass {
	public static WebDriver driver;
	public PropertyUtility property;
	public LoginPage login;
	public HomePage home;
	public PIMPage pimpage;
	public AddEmployeePage addemployeepage;
	
	
	
	@BeforeClass
	public void launchingBrowser() {
		property= new PropertyUtility();
		if(property.readingDataFromPropertyFile("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(property.readingDataFromPropertyFile("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		} else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void navigatingToApplication() {
		login=new LoginPage(driver);
		home=new HomePage(driver);
		pimpage=new PIMPage(driver);
		addemployeepage=new AddEmployeePage(driver);
		driver.get(property.readingDataFromPropertyFile("url"));
		login.loginToApplication(property.readingDataFromPropertyFile("username"),property.readingDataFromPropertyFile("password"));
		}
	@AfterMethod
	public void signOutFromApplication() {
     System.out.println("sign out");		
	}
	@AfterClass
	public void closingTheBrowser() {
		driver.quit();
	}

}


