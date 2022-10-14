package jdbcIntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
	private String userName = "root";
	private String password = "12345";
	private String dbName = "world";
	private String dbUrl = "jdbc:mysql://localhost:3306/"+dbName;
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dbUrl,userName,password);
	}
	
	public void showExceptionMessage(SQLException exception) {
		System.out.println("Error : "+exception.getMessage());
		System.out.println("Error Code : "+exception.getErrorCode());
	}
	
}
