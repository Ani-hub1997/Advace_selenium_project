package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility implements IAutoConstants {
	public String readingDataFromPropertyFile(String key) {
		FileInputStream fis =null;
		try {
			fis=new FileInputStream(PROPERTYFILEPATH);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties pp =new Properties();
		try {
			pp.load(fis);
		} catch(IOException e) {
			e.printStackTrace();
		}
		return pp.getProperty(key);

}
}


