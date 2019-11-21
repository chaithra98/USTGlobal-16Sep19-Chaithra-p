package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCWithPropertiesSelect {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;

		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			// step 1. Load the Driver.
			Class.forName(prop.getProperty("driver-class-name"));
			
			// step2. Get the connection. 
			String url = prop.getProperty("url");	//	?user=root&password=root	// NoSuitableDriverFound -- URL 
			// Port no -- CommunicationLinkFaliure, accessDenied
			conn = DriverManager.getConnection(url, prop);

			//step 3. Issue SQL query.
			stmt = conn.createStatement();
			String sql = prop.getProperty("select-query");
			rs = stmt.executeQuery(sql);

			//step 4. read the result.
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");


				System.out.println("ID "+id);
				System.out.println("Name "+name);
				System.out.println("Salary is "+sal);
				System.out.println("Gender is "+gender);
				System.out.println("**************************");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		// step 5. close all JDBC objects
		finally {
			try {
				if(conn !=null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(rs != null) {
					rs.close();
				}
				if(reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	} // End of main
} // End of MyFirstDB


