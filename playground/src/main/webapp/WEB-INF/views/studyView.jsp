<!DOCTYPE html>

<html>
<head>
    <title>Study : MnemonicStudy.com</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="studyView.css" />
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
    <div id="navbar">
        <%@ include file="/resources/jspf/navbar.jspf" %>
    </div>
    <h1 style="color: #37393A; padding: 0.5rem 2.5rem;">Study</h1>
    <div class="wrapper" style="clear: both">
        <div class="card">
            <div class="card__face card__face--front"> Device
                <%-- <ul>
                    <li>Please</li>
                    <li>Excuse</li>
                    <li>My</li>
                    <li>Dear</li>
                    <li>Aunt</li>
                    <li>Sally</li>
                    <li>${mnemonic.mnemonic_device}</li>
                </ul>--%>
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
<!-- <script>
    var card = document.querySelector('.card');
    card.addEventListener( 'click', function() {
        card.classList.toggle('is-flipped');
    });
</script> -->
</body>
</html>
