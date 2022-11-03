package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Display
 */
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Display() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
	System.out.println();
		try {
			Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement stmt=con.createStatement();
	 ResultSet	rs=stmt.executeQuery("select * from emp");
	 while(rs.next())
	 {
		 out.print(
				 rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3)+" : "+
	 rs.getInt(4)+ " : "+rs.getString(5));
		 out.print("<br>");
		 
	 }
	 out.print("Click hear to go to <a href='HomePage.html'>Home page </a>");
		stmt.close();
		con.close();
		} catch (Exception e) {
			System.err.println(e);
		}		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

