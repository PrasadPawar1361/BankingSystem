<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>

<link rel="stylesheet" href="css/dashboardStyle.css">

</head>
<body>

<%@ include file="header.jsp" %>

<div class="dashboard-box">

    <h2>Welcome To Bank services</h2>

    <a href="creditAmount.jsp"><button> Credit Amount</button></a>

    <a href="debit.jsp"><button> Debit Amount</button></a>

    <a href="Transfer.jsp"><button> Transfer Amount</button></a>

    <a href="check_bal.jsp"><button> Check Balance</button></a>

    <a href="ViewUser.jsp"><button> View User</button></a>

    <a href="index.jsp"><button> Logout</button></a>

</div>

<%@ include file="footer.jsp" %>

</body>
</html>