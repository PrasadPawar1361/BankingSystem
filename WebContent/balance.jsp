```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Balance</title>
<link rel="stylesheet" href="css/dashboardStyle.css">
</head>
<body>

<%@ include file="header.jsp" %>

<div class="form-container">

    <div class="form-box">

        <h2>Your Current Balance</h2>

        <h1><%= session.getAttribute("balance") %></h1>

        <a href="dashboard.jsp" class="back-btn-link">
            Back to Dashboard
        </a>

    </div>

</div>

<%@ include file="footer.jsp" %>

</body>
</html>
```
</html>