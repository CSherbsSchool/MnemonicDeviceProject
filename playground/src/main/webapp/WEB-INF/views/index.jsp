<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <title>Playground</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <style>
        body {font-family: "Times New Roman", Georgia, Serif;}
        h1, h2, h3, h4, h5, h6 {
            font-family: "Playfair Display";
            letter-spacing: 5px;
        }
    </style>
</head>
<body>

<!-- Navbar (sit on top) -->
<div class="w3-top">
    <div class="w3-bar w3-white w3-padding w3-card" style="letter-spacing:4px;">
        <a href="#home" class="w3-bar-item w3-button">Mnemonic Device Flashcards</a>
        <!-- Right-sided navbar links. Hide them on small screens -->
        <div class="w3-right w3-hide-small">
            <form action="${contextPath.request.contextPath}/login" method = "post">
                <input type="submit" value="Log In" class="w3-bar-item w3-button">
            </form>
            <form action="${contextPath.request.contextPath}/createAccount" method = "post">
                <input type="submit" value="Create Account" class="w3-bar-item w3-button">
            </form>
        </div>
    </div>
</div>

<!-- Header -->
<header class="w3-display-container w3-content w3-wide" style="max-width:1600px;min-width:500px" id="home">
    <div class="w3-display-bottomleft w3-padding-large w3-opacity">
    </div>
</header>

<!-- Page content -->
<div class="w3-content" style="max-width:1100px">
    <h1 class="w3-center">Welcome To Mnemonic Device Flash Cards</h1><br>
</div>

</div>
</body>
</html>


    <!--
</div>



</body>
</html>-->
