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
 * Servlet implementation class CreditAmt
 */
public class CreditAmt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreditAmt() {
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
		
		int Account_Num = Integer.parseInt(request.getParameter("acno"));
		
		int Amount = Integer.parseInt(request.getParameter("amt"));
		
		try{
			Connection con = DBConnection.Connect();
			
			PreparedStatement ps = con.prepareStatement("select * from user where ano = ?");
			
			ps.setInt(1, Account_Num);
			
			ResultSet rs = ps.executeQuery();
				while(rs.next()){
					
					int old_bal = rs.getInt(5);	
					System.out.println("old_bal:-"+ old_bal);
					
					int new_bal = old_bal + Amount;
					System.out.println("new_bal:- "+ new_bal);
					
				
			PreparedStatement ps1 = con.prepareStatement("update user set balance=? where ano=? ")	;
			ps1.setInt(1, new_bal);
			ps1.setInt(2, Account_Num);
			
			int i = ps1.executeUpdate();
			if(i>0){
				System.out.println("credited......");
				response.sendRedirect("dashboard.jsp");
			}
			else{
				System.out.println("failed.......");
				response.sendRedirect("credit.jsp");
			}
		}
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
			
		}
		
	
	}

}
