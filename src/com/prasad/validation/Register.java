package com.prasad.validation;



import java.io.IOException;


import java.sql.Connection;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prasad.connection.DBConnection;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		doGet(request, response);
		int ano=0;
		String aname = request.getParameter("name");
		String city = request.getParameter("city");
		String mobile = request.getParameter("mobile");
		String  balance = request.getParameter("amount");
		String email = request.getParameter("email");
		String pass =request.getParameter("password");
				
			try{
			 Connection con = DBConnection.Connect();
					
			PreparedStatement ps = con.prepareStatement("insert into user values (?, ?, ?, ?, ?, ?, ?)");
					
			    ps.setInt(1, ano);
			  	ps.setString(2, aname);
			  	ps.setString(3, city);
			  	ps.setString(4, mobile);
			  	ps.setString(5, balance);
			  	ps.setString(6, email);
			  	ps.setString(7, pass);
			  	
			  	int p = ps.executeUpdate();
		
			  	if(p>0){
			  		
			
			  		
			  		response.sendRedirect("index.jsp");
			  	}
			  	else{
			  		
			  		response.sendRedirect("create.jsp");
			  	}
				}
			catch(Exception e){
					e.printStackTrace();
					
				}
	}

}
