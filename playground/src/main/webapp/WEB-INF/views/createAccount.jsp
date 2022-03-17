<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/loginStyle.css" />
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
                <input type="text" placeholder="Email" required="" id="email" />
            </div>
            <div>
                <input type="password" placeholder="Password" required="" id="password" />
            </div>
            <div>
                <input type="password" placeholder="Confirm Password" required="" id="confirmpassword" />
            </div>
            <div>
                <input type="submit" value="Create an account" />
            </div>
        </form><!-- form -->

    </section><!-- content -->
</div><!-- container -->
</body>
</html>