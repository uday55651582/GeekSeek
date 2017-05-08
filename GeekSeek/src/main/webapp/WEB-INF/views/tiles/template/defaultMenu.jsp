<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<sec:authorize var="loggedIn" access="isAuthenticated()" />
<c:choose>
	<c:when test="${loggedIn}">

		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="collapse navbar-collapse" id="myNavbar" style="background-color: black; font-weight: bold;">
					<ul class="nav navbar-nav navbar-left">
					    <li><a
							href="${pageContext.request.contextPath}/">Home</a></li>
						<li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="${pageContext.request.contextPath}/">Travel<span class="caret"></span></a>
                         <ul class="dropdown-menu">
                         <li><a href="${pageContext.request.contextPath}/tourguide">Tour Guide</a></li>
                         <li><a href="${pageContext.request.contextPath}/tourgallery">Gallery</a></li>
                         <li><a href="${pageContext.request.contextPath}/exoticplaces">Exotic Places</a></li>
                         </ul>
                       </li>
						<li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="${pageContext.request.contextPath}/">Food<span class="caret"></span></a>
                         <ul class="dropdown-menu">
                         <li><a href="#">World's Top</a></li>
                         </ul></li>
						<li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="${pageContext.request.contextPath}/">Technology<span class="caret"></span></a>
                         <ul class="dropdown-menu">
                         <li><a href="#">Softwares</a></li>
                         <li><a href="#">Tutorials</a></li>
                         <li><a href="#">Trends</a></li>
                         </ul>
                       </li>
						<li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="${pageContext.request.contextPath}/">Entertainment<span class="caret"></span></a>
                         <ul class="dropdown-menu">
                         <li><a href="#">Movies</a></li>
                         <li><a href="#">Shows</a></li>
                         </ul></li>
						<li><a href="${pageContext.request.contextPath}/AddArticle">Add Article</a></li>
						<li><a href="${pageContext.request.contextPath}/myarticles">My Article</a></li>						

						
					</ul>
					<ul class="nav navbar-nav navbar-right">					
						<c:set var="contextPath"
							value="${pageContext.request.contextPath}" />
						<c:if test="${pageContext.request.userPrincipal.name != null}">
							<form id="logoutForm" method="POST"
								action="${contextPath}/logout">
								<input type="hidden" name="${_csrf.parameterName}"
									value="${_csrf.token}" />
							</form>
							<li class="active"><a onclick="document.forms['logoutForm'].submit()">Logout</a></li>
						</c:if>		
					</ul>
				</div>
			</div>
	</nav>
		
</c:when>
	<c:otherwise>
		<nav class="navbar navbar-inverse"
			style="background-color: black; font-weight: bold;">
			<div class="container-fluid">
				<div class="collapse navbar-collapse" id="myNavbar"
					style="background-color: black; font-weight: bold;">
					<ul class="nav navbar-nav navbar-left">
					    <li><a
							href="${pageContext.request.contextPath}/">Home</a></li>
						<li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="${pageContext.request.contextPath}/">Travel<span class="caret"></span></a>
                         <ul class="dropdown-menu">
                         <li><a href="${pageContext.request.contextPath}/tourguide">Tour Guide</a></li>
                         <li><a href="${pageContext.request.contextPath}/tourgallery">Gallery</a></li>
                         <li><a href="${pageContext.request.contextPath}/exoticplaces">Exotic Places</a></li>
                         </ul>
                       </li>
						<li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="${pageContext.request.contextPath}/">Food<span class="caret"></span></a>
                         <ul class="dropdown-menu">
                         <li><a href="#">World's Top</a></li>
                         </ul></li>
						<li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="${pageContext.request.contextPath}/">Technology<span class="caret"></span></a>
                         <ul class="dropdown-menu">
                         <li><a href="#">Softwares</a></li>
                         <li><a href="#">Tutorials</a></li>
                         <li><a href="#">Trends</a></li>
                         </ul>
                       </li>
						<li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="${pageContext.request.contextPath}/">Entertainment<span class="caret"></span></a>
                         <ul class="dropdown-menu">
                         <li><a href="#">Movies</a></li>
                         <li><a href="#">Shows</a></li>
                         </ul></li>
						
					</ul>
					<ul class="nav navbar-nav navbar-right">
						
						<li style="text-align:right;"><a href="${pageContext.request.contextPath}/login"><span
								class="glyphicon glyphicon-log-in"></span> Login</a></li>
						<li style="text-align:right;"><a href="${pageContext.request.contextPath}/registration"><span
								class="glyphicon glyphicon-user"></span> Sign UP</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</c:otherwise>
</c:choose>


