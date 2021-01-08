/**
 * Lecture 44: Use JDBC to send SQL statements after connection
 * Lecture 45: Insert, update, delete data using JDBCX
 */

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class MainJDBC {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/employees_database?serverTimezone=UTC";	
		
		int rowsAffected;
		
		try {
			//establish connection object
			Connection conn = DriverManager.getConnection(url, "root", "password123");
			
			//create a Statement object to send to the database
			Statement statement = conn.createStatement();
			
			//execute the statement object  
			
			//selecting
//			ResultSet resultSet = statement.executeQuery("select * from employees_tbl");
//			
//			/* process the result:
//			*  to continue, the database driver needs to be inside the project:
//			*  go to: create folder 'lib',
//			*  copy the mysql-connector-java-8.0.22.JAR file and paste it into 'lib' folder
//			*  (placed in MySQL folder under Programmer)
//			*  furthermore go to: 
//			*  Properties on JDBC project -> Java Build Path -> Liblaries tab
//			*  select Classpath -> click AddJARs button -> select JAR file from JDBC project			
//			*/
//			int salaryTotal = 0;
//			
//			while(resultSet.next()) {
////				System.out.println(resultSet.getString("dept"));
//				salaryTotal = salaryTotal + resultSet.getInt("salary");
//			}
//			System.out.println(salaryTotal);			

			
			//inserting
			rowsAffected = statement.executeUpdate("insert into employees_tbl(id,name,dept,salary) "
					+ "values(1000,'Jimmy','Sales',4700);");
			
			//deleting
			rowsAffected = statement.executeUpdate("UPDATE employees_tbl SET salary = 5600 WHERE id = 700;");
			
			System.out.println("Insert done, rows affected: " + rowsAffected);				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
