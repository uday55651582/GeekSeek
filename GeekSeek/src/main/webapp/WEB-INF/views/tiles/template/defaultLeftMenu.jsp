<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="container-fluid text-center"> 
      
    <br>   <div class="row">
      <div class="col-sm-12 signup">
     <aside id="blog_subscription-4" class="widget jetpack_subscription_widget">
     <h4 class="widget-title">Sign UP </h4>
      <form action="#" method="post" accept-charset="utf-8" id="subscribe-blog-blog_subscription-4">
      <div id="subscribe-text">
      <p>Share Your Knowledge With us, by signing up and submit your articles to us!</p>
     </div> <p id="subscribe-email">  
     <a href="${pageContext.request.contextPath}/registration"> 
     
 <input type="button" name="email" required="required" class="required" value="Sign UP" id="subscribe-field-blog_subscription-4" placeholder="Sign UP"/></a> 
       </p></form></aside>
       </div>
      </div>
  </div> 
  
  <br>
         
     <div class="row">
	<div class="col-sm-12 subscribe">
		<aside id="blog_subscription-4"
			class="widget jetpack_subscription_widget">
			<h4 class="widget-title">
				Subscribe to Blog<br>
			</h4>

			<form action="Subscribe" method="post">
				<div id="subscribe-text">
					<p>Enter your email address to subscribe to this blog and
						receive monthly newsletters by email.</p>
				</div>
				<p id="subscribe-email">
					<label id="jetpack-subscribe-label"
						for="subscribe-field-blog_subscription-4"
						style="visibility: hidden"> Email Address </label> <input
						type="email" name="email" required="required" class="required"
						value="" id="subscribe-field-blog_subscription-4"
						placeholder="Email Address" /> 
				</p>
				<input type="submit" value="Submit">
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>
		</aside>
	</div>
</div>

      <br><br><br>
  
   <div class="row content">
 <div class="col-sm-12 text-side">
     <div class="row">
      <div class="col-sm-12 advertise">
       <marquee direction="down" height="200" style="text-align:center;"> <p> <b>ADVERTISE HERE !! </b></p> </marquee>
       </div>
      </div>
   </div>
    </div>
