<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Debit Amount</title>

<link rel="stylesheet" href="css/dashboardStyle.css">

</head>
<body>

<%@ include file="header.jsp" %>

<div class="form-container">

    <div class="form-box">

        <h2>Debit Amount</h2>

        <form action="DebitAmt" method="post">

            <label>Account Number</label>
            <input type="number"
                   name="acno"
                   placeholder="Enter Account Number"
                   required>

            <label>Amount</label>
            <input type="number"
                   name="amt"
                   placeholder="Enter Amount"
                   required>

            <button type="submit">
                Debit Amount
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