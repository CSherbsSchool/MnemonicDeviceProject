<!DOCTYPE html>

<html>
<head>
    <title>Study : MnemonicStudy.com</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/studyView.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/navbar-footer.css">
    <%@ include file="/resources/jspf/dependencies.jspf"%>
   <style>
        body {font-family: "Times New Roman", Georgia, Serif;}
        h1, h2, h3, h4, h5, h6 {
            font-family: "Playfair Display";
            letter-spacing: 2px;
        }
    </style>
</head>
<body style="background-color: ghostwhite;">

    <%@ include file="/resources/jspf/navbar.jspf" %>
    <br><br><br><br>
    <h1 style="color: #37393A; padding: 0.5rem 2.5rem;">Study</h1>
    <br><br><br>
    
    <div class="wrapper" style="clear: both">
        <div class="card">
            <div class="card__face card__face--front"> Device
                <ul>
                	<c:forEach var = "word" items = "${device}">
                    <li>${word}</li>
                    </c:forEach>
                </ul>
            </div>
            <div class="card__face card__face--back"> Concept
                <ul>
                	<c:forEach var = "word" items = "${concept}">
                    <li>${word}</li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </div>
    <%@ include file="/resources/jspf/footer.jspf" %>
	<script src = "/resources/js/studyView.js">
	</script>

</body>
</html>
