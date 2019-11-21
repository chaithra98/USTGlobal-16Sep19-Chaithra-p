package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class WithPropertiesDelete {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		FileReader reader = null;
		PreparedStatement pstmt = null;

		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			// step 1. Load the Driver.
			Class.forName(prop.getProperty("driver-class-name"));

			//Step 2 Get the Connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);

			// Step 3 issue a query
			String sql = prop.getProperty("delete-query");
			pstmt = conn.prepareStatement(sql);
			
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			int count = pstmt.executeUpdate();

			// Step 4 Read the Result
			System.out.println(count + " row(s) affected");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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


	}

}
