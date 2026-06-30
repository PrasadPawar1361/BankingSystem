<%@ page import="java.sql.*" %>
<%@ page import="com.prasad.connection.DBConnection" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Users</title>

<link rel="stylesheet" href="css/dashboardStyle.css">

</head>
<body>

<%@ include file="header.jsp" %>

<div class="view-user-container">

    <div class="view-user-box">

        <h2>Bank Account Holders</h2>

        <table>

            <tr>
                <th>Account No</th>
                <th>Name</th>
                <th>Email</th>
                <th>City</th>
                <th>Mobile</th>
                <th>Balance</th>
            </tr>

            <%
            try {

                Connection con = DBConnection.Connect();

                PreparedStatement ps = con.prepareStatement("SELECT * FROM user");

                ResultSet rs = ps.executeQuery();

                while(rs.next()) {
            %>

            <tr>
                <td><%= rs.getInt("ano") %></td>
                <td><%= rs.getString("aname") %></td>
                <td><%= rs.getString("email") %></td>
                <td><%= rs.getString("city") %></td>
                <td><%= rs.getString("mobile") %></td>
                <td><%= rs.getDouble("balance") %></td>
            </tr>

            <%
                }

                rs.close();
                ps.close();
                con.close();

            } catch(Exception e) {
                out.println("<tr><td colspan='6'>Error loading users</td></tr>");
            }
            %>

        </table>

        <br>

        <a href="dashboard.jsp">
            <button class="btn">Back to Dashboard</button>
        </a>

    </div>

</div>

<%@ include file="footer.jsp" %>

</body>
</html>