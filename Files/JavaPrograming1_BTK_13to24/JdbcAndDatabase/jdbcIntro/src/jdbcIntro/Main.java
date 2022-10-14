package jdbcIntro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws SQLException {
		//selectDemo();
		//insertDemo();
		//updateDemo();
		//deleteDemo();
	}
	
	static void selectDemo() throws SQLException{
		Connection connection = null;
		DbHelper dbHelper = new DbHelper();
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = dbHelper.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
			ArrayList<Country> countries = new ArrayList<Country>();
			while(resultSet.next()) {
				countries.add(new Country(
						resultSet.getString("Code"),
						resultSet.getString("Name"),
						resultSet.getString("Continent"),
						resultSet.getString("Region")
						));
			}
			
			System.out.println(countries.size());
			
		} catch (SQLException exception) {
			dbHelper.showExceptionMessage(exception);
		} finally {
			connection.close();
		}
	}
	
	static void insertDemo() throws SQLException{
		Connection connection = null;
		DbHelper dbHelper = new DbHelper();
		PreparedStatement statement = null;
		try {
			connection = dbHelper.getConnection();
			
			//statement = connection.prepareStatement("insert into city (Name,CountryCode,District,Population) values ('Düzce','TUR','Düzce',152152)");
			
			String sql = "insert into city (Name,CountryCode,District,Population) values (?,?,?,?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1,"Düzce");
			statement.setString(2,"TUR");
			statement.setString(3,"Düzce");
			statement.setInt(4,152152);
			
			statement.executeUpdate();
			System.out.println("Register is added");
			
		} catch (SQLException exception) {
			dbHelper.showExceptionMessage(exception);
		} finally {
			statement.close();
			connection.close();
		}
	}
	
	static void updateDemo() throws SQLException{
		Connection connection = null;
		DbHelper dbHelper = new DbHelper();
		PreparedStatement statement = null;
		try {
			connection = dbHelper.getConnection();
			//String sql = "update city set population=80000 where id=4082";
			String sql = "update city set population=80000 where id=?";
			statement = connection.prepareStatement(sql);
			
			statement.setInt(1, 4082);
			
			statement.executeUpdate();
			System.out.println("Register is updated");
			
		} catch (SQLException exception) {
			dbHelper.showExceptionMessage(exception);
		} finally {
			statement.close();
			connection.close();
		}
	}
	
	static void deleteDemo() throws SQLException{
		Connection connection = null;
		DbHelper dbHelper = new DbHelper();
		PreparedStatement statement = null;
		try {
			connection = dbHelper.getConnection();
			String sql = "delete from city where id=?";
			statement = connection.prepareStatement(sql);
			
			statement.setInt(1, 4082);
			
			statement.executeUpdate();
			System.out.println("Register is deleted");
			
		} catch (SQLException exception) {
			dbHelper.showExceptionMessage(exception);
		} finally {
			statement.close();
			connection.close();
		}
	}
	

}
