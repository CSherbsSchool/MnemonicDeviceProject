<!DOCTYPE html>

<html>
<head>
<title>Playground</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


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

	<!-- Page content -->
	<div class="w3-content"  id="content" style="max-width: 1100px">
		<h1 class="w3-center">Welcome To Mnemonic Device Flash Cards</h1>
		<div style="background-color: rgba(0, 0, 0, 0.7); padding: 16px; border-radius: 4px;">
		<h2>mnemonic</h2>
		
			<p>
			  <b>noun:</b> a device such as a pattern of letters, ideas, or associations that assists in remembering something. (source: Oxford Languages via Google)
			
			</p>
		</div>
			<p>
			With MnemonicStudy.com, you can browse the selection of mnemonics posted by other students, or you can post your own. All mnemonics you post
			 are automatically saved to your profile, and you can also save other students' mnemonics to your profile page for quick access.
			</p>
		
		<br>
		<div id="button-container" class="w3-center">
			<c:choose>
			  <c:when test="${empty userName}">
				<a class="w3-button mdp-mat-icon-decorated"
		             href="${pageContext.request.contextPath}/login"> 
		              Log in <i class="material-icons">arrow_right</i>
		        </a>
		      </c:when>
		      <c:otherwise>
		      <form action="profile" method="post" >
                   <input type="hidden" name="userID" value="${userID}"/>
                   <button type="submit"  style="color:#000;border:0px #000 solid;background-color:#fff;" class="w3-bar-item w3-button mdp-mat-icon-decorated">
                       View profile <i class="material-icons">arrow_right</i>
                   </button>
                   
               </form>
		    <%--   <a class="w3-button mdp-mat-icon-decorated"
	                 href="#"> 
	                  
	            </a> --%>
	         
		      </c:otherwise>
	        </c:choose>
        </div>

	</div>
</body>
</html>


