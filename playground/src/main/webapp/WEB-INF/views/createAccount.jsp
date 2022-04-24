<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <title>Create an Account</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/loginStyle.css" />
</head>
<body>
<div class="container">
    <section id="content">
        <form action="addUser" method="post">
            <h1>Sign Up</h1>
            <div>
                <input type="text" name="userName" placeholder="Username" required="" id="username" />
            </div>
            <div>
                <input type="text" name="userEmail" placeholder="Email" required="" id="email" />
            </div>
            <div>
                <input type="password" name="userPassword" placeholder="Password" required="" id="password" />
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