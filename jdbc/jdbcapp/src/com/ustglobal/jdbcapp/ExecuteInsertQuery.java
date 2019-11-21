package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		// here we are not using select, so no need of ResultSet.. Because insert return type is integer.

		try {
			// Step 1 Load the Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// Step 2 Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//Step 3 Issue SQL Query
			String sql = " insert into employee_info "
					+ "values(7,'Pooja',35000,'F') ";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);

			// Step 4 Read the Result
			System.out.println(count + " Row(s) inserted");

		} catch (SQLException e) {
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

			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

	} // End of main
}
