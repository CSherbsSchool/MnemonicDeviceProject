<%--
  Created by IntelliJ IDEA.
  User: Joseph
  Date: 4/23/22
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>That's an error!</title>
    <%@ include file="/resources/jspf/dependencies.jspf"%>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/homepage.css">
</head>
<body>
    <!-- Navbar (sit on top) -->
    <%@ include file="/resources/jspf/navbar.jspf"%>

    <!-- Header -->
    <header class="w3-display-container w3-content w3-wide"
            style="max-width: 1600px; min-width: 500px" id="home">
        <div class="w3-display-bottomleft w3-padding-large w3-opacity">
        </div>
    </header>
    <br><br><br>
    <h1>Oops, we've encountered an error</h1>
    <a href="/">Go Home</a>
    <%@ include file="/resources/jspf/footer.jspf"%>
</body>
</html>
