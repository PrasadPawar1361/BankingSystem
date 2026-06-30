<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
<link rel="stylesheet" href="css/dashboardStyle.css">
</head>
<body>

<%@ include file="header.jsp" %>


<div class="login-container">

    <div class="login-card">

        <h2>User Login</h2>

        <form action="DemoLogin" method="post">

            <label>Username</label>
            <input type="text" name="username"
                   placeholder="Enter Email" required>

            <label>Password</label>
            <input type="password" name="password"
                   placeholder="Enter Password" required>

            <button type="submit" class="btn">
                Login
            </button>

        </form>

        <hr>

        <a href="create.jsp">
            <button class="btn btn-danger">
                New User?
            </button>
        </a>

    </div>

</div>

<%@ include file="footer.jsp" %>

</body>
</html>
