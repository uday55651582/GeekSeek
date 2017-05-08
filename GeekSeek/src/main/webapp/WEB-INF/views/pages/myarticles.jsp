
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>



<div class="container">
<h3 style="text-align: center;
    text-transform: uppercase;
    color: magenta;">My Articles</h3>
<br>
<table style="text-align:Left; width:40%;height:10%">
<thead>
<tr>
<th width="150px">Article Title<br></th>
</tr>
</thead>
<tbody>
<c:forEach var="article" items="${myarticles}">
	<tr>
		<td>  <a target="_blank" href="resources/HTML/${article.article_filename}.html">${article.article_title}</a></td> 
		<td>
		
	</tr>
</c:forEach>
</tbody>
</table>
<br>
</div>

