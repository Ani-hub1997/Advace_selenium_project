package ConnectToDtabase;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadingDataFromJDBC {
	public static void main(String[] args) throws SQLException {
		//creating a driver reference;
		//Driver dbDriver =new Driver();
		
		//Register the driver
		//DriverManager.registerDriver(dbDriver);
		
		//getconnection
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/advaceselenium","root","root");
		
		 Statement statement = connection.createStatement();
	
		 ResultSet data=statement.executeQuery("select * from demo");
		 
		 while(data.next()) {
			 System.out.println(data.getString("id")+" "+data.getString("name")+" "+data.getString("contact"));
		 }
		 
		 connection.close();
		
	}

}
