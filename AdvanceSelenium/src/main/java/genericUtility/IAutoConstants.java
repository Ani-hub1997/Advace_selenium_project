package genericUtility;

import java.time.LocalDateTime;

public interface IAutoConstants {
	String EXCELPATH ="./src/test/resources/test data.xlsx";
	String JDBC_URL ="jdbc:mysql://localhost:3306/advaceselenium";
	String JDBC_UN ="root";
	String JDBC_Pwd ="root";
	String PROPERTYFILEPATH="./srcc/test/resources/commondata.properties";
    String SSPATH ="./errorshots/";
    String TIME = LocalDateTime.now().toString().replace(":",". ");
    String DIRECTORY = System.getProperty("user.dir");

}
