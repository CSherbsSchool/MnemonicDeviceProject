<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<%@ include file="/resources/jspf/dependencies.jspf"%>
	<title>Create a New Flashcard</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mnemonicCreation.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/navbar-footer.css">
	<%@ include file="/resources/jspf/favicon.jspf"%>
</head>
<body style="background: ghostwhite">
<%@ include file="/resources/jspf/navbar.jspf"%>
<br>
<br>
<br>
<%--	<p>UserId: ${userID}</p> why do we have this here....--%>
<%--	<form:form modelAttribute="mnemonic" action="addMnemonic" method="POST">--%>
<%--		<form:input path="title" placeholder="Mnemonic" />--%>
<%--		<form:input path="mnemonic_device" placeholder="Mnemonic"/>--%>
<%--		<form:input path="study_concept" placeholder="Study Concept"/>--%>
<%--		<form:hidden path="creator_userID" value="${userID}"/>--%>
<%--		<br>--%>
<%--		<form:checkbox path="isPrivate" label="Make Private" />--%>
<%--		<br>--%>
<%--		<input type="Submit" value="Post">--%>
<%--	</form:form>--%>

<form action="addMnemonic" method="post">
	<h1>Create Mnemonic</h1>
	<div>
		<input type="text" name="title" style="width: 1000px; padding-block: 1rem" placeholder="Title" required="" id="title" />
	</div>
	<br><br>
	<div>
		<input type="text" name="study_concept" style="width: 1000px; padding-block: 1rem" placeholder="Study Concept (words separated by spaces)" required="" id="study_concept" />
	</div>
	<br><br>
	<div>
		<input type="text" name="mnemonic_device" style="width: 1000px; padding-block: 1rem" placeholder="Mnemonic Device(words separated by spaces)" required="" id="mnemonic_device" />
	</div>
	<br><br>
	<div>
		<input type="text" name="tag" style="width: 1000px; padding-block: 1rem" placeholder="Optional: Search Tags (words separated by spaces)" id="tag" />
	</div>
	<br><br>
	<div>
		<input type="checkbox" name="isPrivate" value="1" id="isPrivate" style="width: 25px; height: 25px"/>
		<label for="isPrivate"> Make Private</label>
	</div>
	<br><br>
	<div>
		<input type="hidden"  name="creator_userID" value="${userID}" id="creator_userID" />
	</div>
	<br><br>
	<div>
		<input type="submit" value="Post" style="background: #2ad669; color: black"/>
	</div>
</form>
<%@ include file="/resources/jspf/footer.jspf"%>
</body>
</html>