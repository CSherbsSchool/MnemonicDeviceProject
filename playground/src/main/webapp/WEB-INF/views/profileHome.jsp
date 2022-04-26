<!DOCTYPE html>

<html>
<head>
<title>My Sets : MnemonicStudy.com</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/profileHome.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/navbar-footer.css">
	<%@ include file="/resources/jspf/favicon.jspf"%>
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
<body style="background-color: ghostwhite;">

	<%@ include file="/resources/jspf/navbar.jspf"%>
	<br><br><br><br>
	<h1 style="padding: 0.5rem 2.5rem;">My Mnemonics</h1>
	<br><br><br>
	<div class="wrapper" style="clear: both">

		<ul class="grid cards">
			<c:forEach items="${mnemonics}" var="i">
				<a href=${pageContext.request.contextPath}/viewFlashcard-${userID}-${i.mnemonic_id} style="text-decoration: none;"><li>			
						<h2>${i.title}</h2>
						<c:choose>
							<c:when test="${i.isPrivate}">
								<p style="color: #FF8585">Private</p>
							</c:when>
							<c:otherwise>
								<p style="color: #2ad669">Published</p>
							</c:otherwise>
						</c:choose>
						<form:form action = "deleteMnemonic" method = "post">
							<input type = "hidden" name = "mnemonic_id" value = "${i.mnemonic_id}"/>
							<input type = "hidden" name = "userID" value = "${userID}"/>
							<input type = "submit" value = "Delete" style="background: #2ad669"/>
						</form:form>
				</li></a>

			</c:forEach>
			
		</ul>
	</div>
	

	<%@ include file="/resources/jspf/footer.jspf"%>
</body>
</html>