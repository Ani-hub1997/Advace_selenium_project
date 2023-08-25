package genericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
	@DataProvider(name = "test data")

public Object[][] readingMultipleData() throws EncryptedDocumentException, InvalidFormatException, IOException {
	
	
File file=new File("./src/test/resources/TestCase01.xlsx");
Workbook workbook =WorkbookFactory.create(file);
Sheet sheet=workbook.getSheet("Sheet1");
int rowCount = sheet.getPhysicalNumberOfRows();
int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
Object[][] data=new Object[rowCount][cellCount];
for(int row=0;row<rowCount;row++) {
	Row actRow = sheet.getRow(row);
	for(int cell=0;cell<actRow.getPhysicalNumberOfCells();cell++) {
		data [row][cell]= actRow.getCell(cell).toString();
	}
}
return data;
}
}
