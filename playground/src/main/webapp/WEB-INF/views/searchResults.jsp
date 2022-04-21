<!DOCTYPE html>
<html>
    
    <head>       
        <meta charset="utf-8">
        <%@ include file="/resources/jspf/dependencies.jspf"%>
        <title>Search Results</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/loginStyle.css" />   
    </head>
    
    <body style="background-color: #414762;">
        
        <div id="navbar">
            <%@ include file="/resources/jspf/navbar.jspf"%>
	</div>
	<br><br><br><br><br>
        
        <h1 style="color: black;">Search Results</h1>
        
        <ul class="grid cards">
            <c:forEach items="${mnemonics}" var="mnemonic">
                <a href="#" style="text-decoration: none; padding: 32px; "><li> 
                    <%-- using c:out for security reasons --%>
                    <h2 style="color: black;"><c:out value="${mnemonic.title}" /></h2>
                    <p style="color: black;"><c:out value="${mnemonic.study_concept}" /></p>
            
                </li> </a>
            
                
            </c:forEach>
        </ul>
        
    </body>
</html>
