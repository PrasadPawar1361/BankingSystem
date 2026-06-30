<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Credit Amount</title>

<link rel="stylesheet" href="css/dashboardStyle.css">

</head>
<body>

<%@ include file="header.jsp" %>

<div class="form-container">

    <div class="form-box">

        <h2>Credit Amount</h2>

        <form action="CreditAmt" method="post">

            <label>Account Number</label>
            <input type="text"
                   name="acno"
                   placeholder="Enter Account Number"
                   required>

            <label>Amount</label>
            <input type="number"
                   name="amt"
                   placeholder="Enter Amount"
                   required>

            <button type="submit">
                Credit Amount
            </button>

        </form>

        <a href="dashboard.jsp" class="back-btn-link">
            Back to Dashboard
        </a>

    </div>

</div>

<%@ include file="footer.jsp" %>

</body>
</html>