package project;
import java.sql.*;


public class Dbconnection {
	private static final String url="jdbc:mysql://localhost:3306/project";
	private static final String username="root";
	private static final String pass="";
	
	public static Connection getConnection() throws Exception {
		return DriverManager.getConnection(url,username,pass);
	}

}
