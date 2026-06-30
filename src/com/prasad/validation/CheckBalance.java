
package com.prasad.validation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.prasad.connection.DBConnection;

public class CheckBalance extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CheckBalance() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int accno = Integer.parseInt(request.getParameter("accno"));
		String password = request.getParameter("password");

		try {

			Connection con = DBConnection.Connect();

			PreparedStatement ps = con.prepareStatement(
					"select balance from user where ano=? and pass=?");

			ps.setInt(1, accno);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				double balance = rs.getDouble("balance");

				HttpSession session = request.getSession();
				session.setAttribute("balance", balance);

				response.sendRedirect("balance.jsp");
			}

			else {

				response.sendRedirect("checkBalance.jsp");
			}

		}

		catch (Exception e) {

			System.out.println(e);

		}

	}
}

