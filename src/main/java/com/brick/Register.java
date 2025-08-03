package com.brick;
import java.sql.*;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class Register extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("pass");
		String gender = req.getParameter("gender");
		String city = req.getParameter("city");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/registration";
		String uname = "root";
		String pass = "root";
		String query ="insert into userdetails values(?,?,?,?,?);";
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DriverManager.getConnection(url, uname, pass);
			pst = con.prepareStatement(query);
			pst.setString(1, name);
			pst.setString(2, email);
			pst.setString(3, password);
			pst.setString(4, gender);
			pst.setString(5, city);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
