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
	<form:form modelAttribute="mnemonic">
		<form:input path="mnemonic_device" placeholder="Mnemonic"></form:input>
		<form:input path="study_concept" placeholder="Study Concept"></form:input>
		<br>
		<form:checkbox path="private" label="Make Private" />
		<br>
		<input type="Submit" value="Post">
	</form:form>
</body>
</html>