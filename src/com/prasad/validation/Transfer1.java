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
 * Servlet implementation class Transfer1
 */
public class Transfer1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transfer1() {
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
			
			int rec = Integer.parseInt(request.getParameter("rec"));
			
			
			try{
				Connection con = DBConnection.Connect();
				
				PreparedStatement ps = con.prepareStatement("select * from user where ano = ?");
				
				ps.setInt(1, Account_Num);
				
				ResultSet rs = ps.executeQuery();
					while(rs.next()){
						
						int old_bal = rs.getInt(5);	
						
						if(old_bal<=0){
							response.sendRedirect("creditAmount.jsp");
						}
						
						
						int new_bal = old_bal - Amount;
						
					
				PreparedStatement ps1 = con.prepareStatement("update user set balance=? where ano=? ")	;
				ps1.setInt(1, new_bal);
				ps1.setInt(2, Account_Num);
				
				int i = ps1.executeUpdate();
				
				
				
				PreparedStatement ps2 = con.prepareStatement("select * from user where ano = ?");
				
				ps2.setInt(1, rec);
			
				
				ResultSet rs1 = ps2.executeQuery();
				while(rs1.next()){
					
					
					
					
					
					int rec1 = rs1.getInt(5) + Amount;
					PreparedStatement ps3 = con.prepareStatement("update user set balance=? where ano=? ")	;
					
					ps3.setInt(1, rec1);
					ps3.setInt(2, rec);
					int k = ps3.executeUpdate();
					
				
				
				if(k > 0){
					System.out.println("credited......");
					response.sendRedirect("dashboard.jsp");
				}
				else{
					System.out.println("failed.......");
					response.sendRedirect("Transfer.jsp");
				}
			}
			}
			}
			
			catch(Exception e){
				System.out.println(e);
				e.printStackTrace();
			}
	}
}
		
