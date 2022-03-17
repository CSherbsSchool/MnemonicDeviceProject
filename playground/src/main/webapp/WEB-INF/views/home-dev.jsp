<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <title>Playground</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/myStyle.css">
    <%-- <style>
        body {font-family: "Times New Roman", Georgia, Serif;}
        h1, h2, h3, h4, h5, h6 {
            font-family: "Playfair Display";
            letter-spacing: 5px;
        }
    </style> --%>
</head>
<body>

<!-- Navbar (sit on top) -->
<div class="w3-top">
    <div class="w3-bar w3-white w3-padding w3-card" style="letter-spacing:4px;">
        <a href="#home" class="w3-bar-item w3-button">Mnemonic Device Flashcards</a>
        <!-- User profile dropdown -->
        <div class="w3-right w3-dropdown-hover">
        	<button class="w3-button mdp-mat-icon-decorated">
                <i class="material-icons">person</i> Log in <i class="material-icons">arrow_drop_down</i>
            </button>
            <div class="w3-dropdown-content w3-bar-block w3-border">
			    <a href="${pageContext.request.contextPath}/login" class="w3-bar-item w3-button">Log in</a>
			    <a href="${pageContext.request.contextPath}/createAccount" class="w3-bar-item w3-button">Create account</a>
			    
			</div>
        </div>
    </div>
</div>

<!-- Header -->
<header class="w3-display-container w3-content w3-wide" style="max-width:1600px;min-width:500px" id="home">
    <div class="w3-display-bottomleft w3-padding-large w3-opacity">
    </div>
</header>

<br><br>

<!-- Page content -->
<div class="w3-content" style="max-width:1100px">
    <h1 class="w3-center">Welcome To Mnemonic Device Flash Cards</h1><br>
</div>

</body>
</html>
