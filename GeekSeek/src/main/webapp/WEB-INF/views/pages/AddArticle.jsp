<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Create an account</title>

<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<div class="container">
		<h1 class="articleheading">SUBMIT ARTICLE</h1>
		<form:form action="AddArticle" method="post" commandName="articleForm">

			<table style="float:middle;width:40%;height:30%;text-align:left">
				<tr>
					<td class="articletd"><b>Article Category:</b></td>
					<td><form:select path="article_category"
							items="${categoryList}" /></td>
				</tr>
				
				<tr>
					<td class="articletd"><b>Article Title:</b></td>
					<td><form:input path="article_title" /></td>
				</tr>
				<tr>
					<td class="articletd"><b>Article File Name:</b></td>
					<td><form:input path="article_filename" /></td>
				</tr>
				<tr>
					<td class="articletd"><b>Article Link:</b></td>
					<td><form:input path="article_link" /></td>
				</tr>
				<tr>
					<td><input type="submit" name="AddArticle" value="Add Article" /></td>
				</tr>
			</table>
		</form:form>
	</div>

</body>
</html>
