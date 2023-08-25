package pim;

import org.testng.annotations.Test;

import genericUtility.Baseclass;
import genericUtility.ExcelUtility;

public class ST_PIM_02 extends Baseclass {
@Test(dataProvider = "TestCase01",dataProviderClass = ExcelUtility.class)

public void Creating_an_employee_details_with_valid_details(String a,String b) throws InterruptedException {
	pimpage.getPimButton().click();
	pimpage.getAddEmployeeButton().click();
    addemployeepage.getfirstnameTextfield().sendKeys(a);
    addemployeepage.getlastnameTextfield().sendKeys(b);
    Thread.sleep(2000);
	
}
}
