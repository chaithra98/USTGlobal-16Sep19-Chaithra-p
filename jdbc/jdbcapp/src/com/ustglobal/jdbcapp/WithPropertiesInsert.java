package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class WithPropertiesInsert {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		// here we are not using select, so no need of ResultSet.. Because insert return type is integer.

		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			// step 1. Load the Driver.
			Class.forName(prop.getProperty("driver-class-name"));
			

			// Step 2 Get the connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);

			//Step 3 Issue SQL Query
			String sql = prop.getProperty("insert-query");
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);

			String name = args[1];
			pstmt.setString(2, name);

			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);

			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
			
			

			// Step 4 Read the Result
			System.out.println(count + " Row(s) inserted");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// Step 5 Close all JDBC objects
			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(reader != null) {
					reader.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	} // End of main
}
