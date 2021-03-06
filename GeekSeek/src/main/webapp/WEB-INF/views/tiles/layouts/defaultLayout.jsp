<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>

<head>
<meta charset="ISO-8859-1">
<title>GeekSeek</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Bootstrap Script file-->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="//angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.13.0.js"></script>
<!-- External Stylesheet -->
<link rel="stylesheet" type="text/css" href="resources/css/mystyle.css">

</head>


<body>
	<header id="header">
		<tiles:insertAttribute name="header" />
	</header>

	<div class="container-fluid text-center">

		<div class="row menu">

			<div class="col-md-12 sidenav" id="sidemenu">

				<tiles:insertAttribute name="menu" />
			</div>

        </div>
        
        <div class="row content">
        
			<div class="col-md-10 sidenav" id="site-content">
				<tiles:insertAttribute name="body" />
			</div>
			
			<div class="col-md-2 sidenav" id="site-content">
				<tiles:insertAttribute name="LeftMenu" />
			</div>
			
			
	    </div>
	     <div class="row footer">
			<div class="col-md-12 footer" id="footer">
				<tiles:insertAttribute name="footer" />
			</div>
			
	    </div>
	     
		</div>
	
</body>
</html>