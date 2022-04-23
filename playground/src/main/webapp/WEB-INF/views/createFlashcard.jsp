<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/resources/jspf/dependencies.jspf"%>
<title>Create a New Flashcard</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mnemonicCreation.css">
</head>
<body>
	<div id="navbar">
		<%@ include file="/resources/jspf/navbar.jspf"%>
	</div>
	<br>
	<br>
	<br>
	<p>UserId: ${userID}</p>
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
			<input type="text" name="title" style="width: 1000px;" placeholder="Title" required="" id="title" />
		</div>
		<div>
			<input type="text" name="study_concept" style="width: 1000px;" placeholder="Study Concept (words separated by spaces)" required="" id="study_concept" />
		</div>
		<div>
			<input type="text" name="mnemonic_device" style="width: 1000px;" placeholder="Mnemonic Device(words separated by spaces)" required="" id="mnemonic_device" />
		</div>
		<div>
			<input type="text" name="tag" style="width: 1000px;" placeholder="Optional: Search Tags (words separated by spaces)" id="tag" />
		</div>
		<div>
			<input type='hidden' value='0' name='isPrivate'>
			<input type="checkbox" name="isPrivate" value="1" id="isPrivate" />
			<label for="isPrivate"> Make Private</label>
		</div>
		<div>
			<input type="hidden"  name="creator_userID" value="${userID}" id="creator_userID" />
		</div>
		<div>
			<input type="submit" value="Post" />
		</div>
	</form>
</body>
</html>