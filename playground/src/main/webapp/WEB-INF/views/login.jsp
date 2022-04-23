<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/loginStyle.css" />
</head>
<body>
<div class="container">
    <section id="content">
        <form action="loginUser" method="post">
            <h1>Login</h1>
            <div>
                <input type="text" name = "userName" placeholder="Username" required="" id="username" />
            </div>
            <div>
                <input type="password" name = "userPassword" placeholder="Password" required="" id="password" />
            </div>
            <div>
                <input type="submit" value="Log in" />
               <%-- <a href="#">Lost your password?</a> --%>
                <a href="${pageContext.request.contextPath}/">Back To Home</a>
                <a href="${pageContext.request.contextPath}/createAccount">Register</a>
            </div>
        </form>

    </section>
</div>
</body>
</html>