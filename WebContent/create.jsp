<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<link rel="stylesheet" href="css/dashboardStyle.css">
</head>
<body>

<%@ include file = "header.jsp" %>
	<div class="create">
	 <form action="Register" method="post">
	  
	 
    <div class="c">

        <h2>Create Bank Account</h2>

        <form action="Register" method="post">

            <label>Enter Name</label>
            <input type="text" placeholder="Name" name="name">

            <label>Enter City</label>
            <input type="text" placeholder="City" name="city">

            <label>Enter Mobile</label>
            <input type="text" placeholder="Mobile" name="mobile">

            <label>Enter Initial Amount</label>
            <input type="number" placeholder="Amount" name="amount">

            <label>Enter Email</label>
            <input type="email" placeholder="Email" name="email">

            <label>Enter Password</label>
            <input type="password" placeholder="Password" name="password">

            <button type="submit">Create Account</button>

            <a href="index.jsp" class="back-btn">Back</a>

        </form>

    </div>

	</div>
<%@ include file = "footer.jsp"%>
	
</body>
	

</html>
