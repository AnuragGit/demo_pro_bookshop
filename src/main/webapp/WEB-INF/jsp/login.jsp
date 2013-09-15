<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE HTML>
<html>
<head>
<title>Baby Shop Login Pages</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">

<link rel="stylesheet" type="text/css" href="resources/css/jquery-ui.css" />
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css" />


<script type="text/javascript" src="resources/js/jquery.1.9.1.js"></script>
<script type="text/javascript" src="resources/js/jquery-ui.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.js"></script>
</head>

<body>
<div class="container">
<br/><br/>
<c:if test="${not empty param.error}">
    <div class="control-group error">
        Your login attempt was not successful, try again.<br />
        Reason: ${sessionScope.SPRING_SECURITY_LAST_EXCEPTION.message}
    </div>
</c:if>
<form class="form-horizontal" action="${pageContext.request.contextPath}/j_spring_security_check" method="post">
  <div class="control-group">
    <label class="control-label" for="inputEmail">Email</label>
    <div class="controls">
      <input type="text" class="input-mediam" id="inputEmail" placeholder="Email">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputPassword">Password</label>
    <div class="controls">
      <input type="password" id="inputPassword" placeholder="Password">
    </div>
  </div>
  <div class="control-group">
    <div class="controls">
      <label class="checkbox">
        <input type="checkbox"> Remember me
      </label>
      <button type="submit" class="btn btn-primary">Sign in</button>
    </div>
  </div>
</form>

</div>
</body>
</html>