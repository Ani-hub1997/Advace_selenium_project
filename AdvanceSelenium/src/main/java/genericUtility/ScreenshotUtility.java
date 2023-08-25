package genericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility extends Baseclass implements IAutoConstants {
	public void takingScreenshot(WebDriver driver,String screenshotname) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File photo = ts.getScreenshotAs(OutputType.FILE);
		String path=SSPATH+screenshotname+".png";
		File file = new File(path);
		 try {
			 FileUtils.copyFile(photo, file);
		 } catch(IOException e) {
			 e.printStackTrace();
			 
		 }
		
		}
	

}



