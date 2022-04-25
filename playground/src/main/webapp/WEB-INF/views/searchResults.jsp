<!DOCTYPE html>
<html>
    
    <head>       
        <meta charset="utf-8">
        <%@ include file="/resources/jspf/dependencies.jspf"%>
        <title>Search Results</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/profileHome.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/navbar-footer.css">
<%@ include file="/resources/jspf/dependencies.jspf"%>

<style>
body {
	font-family: "Times New Roman", Georgia, Serif;
}

h1, h2, h3, h4, h5, h6 {
	font-family: "Playfair Display";
	letter-spacing: 2px;
}
</style>
</head>
<body style="background-color: ghostwhite">

	<%@ include file="/resources/jspf/navbar.jspf"%>
	<br><br><br><br>
	<h1 style="color: ghostwhite; padding: 0.5rem 2.5rem;">Search Results</h1>
	<br><br><br>
	<div class="wrapper" style="clear: both">

		<ul class="grid cards">
            <c:forEach items="${mnemonics}" var="mnemonic">
                <a href=${pageContext.request.contextPath}/viewFlashcard-${userID}-${mnemonic.mnemonic_id} style="text-decoration: none;"><li> 
                    <%-- using c:out for security reasons --%>
                    <h2 style="color: white;"><c:out value="${mnemonic.title}" /></h2>
                    <h4 style="color: white;"><c:out value="${mnemonic.study_concept}" /></h4>
            		<h4 style="color: white;"><c:out value="${mnemonic.mnemonic_device}" /></h4>
            		<form:form action = "saveMnemonic" method = "post">
							<input type = "hidden" name = "mnemonic_id" value = "${mnemonic.mnemonic_id}"/>
							<input type = "hidden" name = "userID" value = "${userID}"/>
							<input type = "submit" value = "Save" style="background: #2ad669"/>
					</form:form>
                </li> </a>
                
            </c:forEach>
        </ul>
	</div>

	<%@ include file="/resources/jspf/footer.jspf"%>
    </body>
</html>