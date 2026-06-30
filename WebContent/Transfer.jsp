<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Transfer Amount</title>

<link rel="stylesheet" href="css/dashboardStyle.css">

</head>
<body>

    <%@ include file="header.jsp" %>

    <div class="form-container">

        <div class="form-box">

            <h2>Transfer Amount</h2>

            <form action="Transfer1" method="post">

                <label>Sender Account Number</label>
                <input type="text"
                       name="acno"
                       placeholder="Enter Sender Account Number"
                       required>

                <label>Transfer Amount</label>
                <input type="number"
                       name="amt"
                       placeholder="Enter Amount"
                       required>

                <label>Receiver Account Number</label>
                <input type="text"
                       name="rec"
                       placeholder="Enter Receiver Account Number"
                       required>

                <button type="submit">
                    Transfer Amount
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