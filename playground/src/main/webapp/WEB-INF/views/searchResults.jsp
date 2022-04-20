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
        
        <h1 style="color: ghostwhite">Search Results</h1>
        
        <ul class="grid cards">
            <c:forEach items="${mnemonics}" var="mnemonic">
                <a href="#" style="text-decoration: none;"><li> 
                
                    <h2 style="color: ghostwhite">${mnemonic.title}</h2>
                    <p style="color: ghostwhite">${mnemonic.creator_userID}</p>
            
                </li> </a>
            
                
            </c:forEach>
        </ul>
        
    </body>
</html>
