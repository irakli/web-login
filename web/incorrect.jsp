<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information Incorrect</title>
</head>
<body>
<h1>Please Try Again</h1>
<h2>Either username or password is incorrect. Please try again.</h2>

<form action="Login" method="post">
    <p>Username: <input type="text" name="username" title="title"/>
    <p>Password: <input type="password" name="password" title="title"/>
        <input type="submit" value = "login"/></p>
</form>
<a href="${pageContext.request.contextPath}/create.jsp">Create New Account</a>
</body>
</html>
