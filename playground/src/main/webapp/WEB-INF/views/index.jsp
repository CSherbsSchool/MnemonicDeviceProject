<!DOCTYPE html>

<html>
<head>
	<title>Mnemonic Study - Home</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/home.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/navbar-footer.css">

	<%@ include file="/resources/jspf/dependencies.jspf"%>

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
<br><br><br><br><br>
<div style="padding: 8rem;">
	<div class="container">
		<div class="slider">

			<div class="box1 box">
				<div class="bg"></div>
				<div class="details">
					<h1 style="color: white">Welcome to MnemonicStudy.com!</h1>
					<p style="color: white">
						Create and study mnemonics. Publish them for other users to study.
					</p>
					<form action="createAccount" method="post" >
						<button style="color: black">Get Started</button>
					</form>
				</div>

				<div class="illustration"><div class="inner"></div></div>
			</div>


			<div class="box2 box">
				<div class="bg"></div>
				<div class="details">
					<h1 style="color: white">Mnemonic</h1>
					<p style="color: white">
						noun: a device such as a pattern of letters, ideas, or associations that assists in remembering something.
					</p>
					<form action="login" method="post" >
						<button>Study Now</button>
					</form>
				</div>

				<div class="illustration"><div class="inner"></div></div>
			</div>

			<div class="box3 box">
				<div class="bg"></div>
				<div class="details">
					<h1 style="color: white">Save for later</h1>
					<p style="color: white">
						Find a mnemonic you like?
						Save it to your profile to study it later!
					</p>
					<form action="login" method="post" >
						<button style="color: black">Login</button>
					</form>

				</div>

				<div class="illustration"><div class="inner"></div></div>
			</div>

			<div class="box4 box">
				<div class="bg"></div>
				<div class="details">
					<h1 style="color: white">Meet the Team</h1>
					<p style="color: white">
						Head to our about page to learn about our developers.
						Or check out our team's github.
					</p>
					<a href="https://github.com/CSherbsSchool/MnemonicDeviceProject" target="_blank"><button>Introduce Me</button></a>
				</div>

				<div class="illustration"><div class="inner"></div></div>
			</div>

			<div class="box5 box">
				<div class="bg"></div>
				<div class="details">
					<h1 style="color: white">Share</h1>
					<p style="color: white">
						You really should share this website with your friends.
						Oh wait...
					</p>
					<a href="https://github.com/CSherbsSchool/MnemonicDeviceProject" target="_blank"><button style="color: black">Share</button></a>
				</div>

				<div class="illustration"><div class="inner"></div></div>
			</div>


		</div>

		<svg xmlns="http://www.w3.org/2000/svg" class="prev" width="56.898" height="91" viewBox="0 0 56.898 91"><path d="M45.5,0,91,56.9,48.452,24.068,0,56.9Z" transform="translate(0 91) rotate(-90)" fill="#fff"/></svg>
		<svg xmlns="http://www.w3.org/2000/svg" class="next" width="56.898" height="91" viewBox="0 0 56.898 91"><path d="M45.5,0,91,56.9,48.452,24.068,0,56.9Z" transform="translate(56.898) rotate(90)" fill="#fff"/></svg>
		<div class="trail">
			<div class="box1 active"></div>
			<div class="box2"></div>
			<div class="box3"></div>
			<div class="box4"></div>
			<div class="box5"></div>
		</div>
	</div>
</div>

<!-- Page content -->
<div class="w3-content"  id="content" style="max-width: 1100px">

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
					<button type="submit" style="color:#000;border:0px #000 solid;background-color: #6bda5c;" class="w3-bar-item w3-button mdp-mat-icon-decorated">
						View profile <i class="material-icons">arrow_right</i>
					</button>
				</form>
			</c:otherwise>
		</c:choose>
	</div>

</div>

<script src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/16327/gsap-latest-beta.min.js"></script>
<script src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/16327/CSSRulePlugin3.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.3.2/gsap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.3.2/CSSRulePlugin.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/home.js"></script>
<%@ include file="/resources/jspf/footer.jspf"%>
</body>
</html>


