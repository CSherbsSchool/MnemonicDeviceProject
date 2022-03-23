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
        <form action="">
            <h1>Login</h1>
            <div>
                <input type="text" placeholder="Username" required="" id="username" />
            </div>
            <div>
                <input type="password" placeholder="Password" required="" id="password" />
            </div>
            <div>
                <input type="submit" value="Log in"/>
                <a href="#">Lost your password?</a>
                <form action="${contextPath.request.contextPath}/" method = "post">
                    <a href="#">Back To Home</a>
                </form>
                <form action="${contextPath.request.contextPath}/app/createAccount" method = "post">
                    <a href="/app/createAccount">Register</a>
                </form>
            </div>
        </form><!-- form -->

    </section><!-- content -->
</div><!-- container -->
</body>
</html>