<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check Balance</title>

<link rel="stylesheet" href="css/dashboardStyle.css">

</head>
<body>

<%@ include file="header.jsp" %>

<div class="balance-container">

    <div class="balance-box">

        <h2>Check Account Balance</h2>

        <form action="CheckBalance" method="post">

            <label>Account Number</label>
            <input type="text"
                   name="accno"
                   placeholder="Enter Account Number"
                   required>

            <label>Password</label>
            <input type="password"
                   name="password"
                   placeholder="Enter Password"
                   required>

            <button type="submit">
                Check Balance
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