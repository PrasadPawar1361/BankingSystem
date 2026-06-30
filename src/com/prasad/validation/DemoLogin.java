package com.prasad.validation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prasad.connection.DBConnection;

/**
 * Servlet implementation class DemoLogin
 */
public class DemoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("username");

		String password = request.getParameter("password");
		
		
		
		try{
			Connection con = DBConnection.Connect();
			
			PreparedStatement ps = con.prepareStatement("select * from user where email=? and pass=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			int i=0;
			while(rs.next()){
				i=1;
			}
			if(i>0){
				response.sendRedirect("dashboard.jsp");
			}
			else{
				response.sendRedirect("index.jsp");
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
