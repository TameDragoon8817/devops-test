package devopsdemo;

import java.sql.*;

public class Util {
	private static String rootname="root";
	private static String rootpass="147895";
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/devopstest?serverTimezone=GMT";
	
	@SuppressWarnings("deprecation")
	public static Connection getConnection()throws InstantiationException,IllegalAccessException,ClassNotFoundException,SQLException{
		Class.forName(driver).newInstance();
		return DriverManager.getConnection(url, rootname, rootpass);
	}

}
