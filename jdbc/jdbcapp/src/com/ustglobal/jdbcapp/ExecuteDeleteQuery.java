package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			// Step 1 Load the Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//Step 2 Get the Connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			// Step 3 issue a query
			String sql = "delete from employee_info where id=6";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);

			// Step 4 Read the Result
			System.out.println(count + " row(s) affected");

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}

			} catch (SQLException e2) {
				e2.printStackTrace();		
			}
		}


	}
}
