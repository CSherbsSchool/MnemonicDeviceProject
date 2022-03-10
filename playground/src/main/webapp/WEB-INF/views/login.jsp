<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}resources/loginStyle.css" />
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
                <input type="submit" value="Log in" />
                <a href="#">Lost your password?</a>
                <a href="#">Register</a>
            </div>
        </form><!-- form -->

    </section><!-- content -->
</div><!-- container -->
</body>
</html>