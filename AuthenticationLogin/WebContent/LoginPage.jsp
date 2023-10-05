<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="http://localhost:8080/AuthenticationLogin/assets/bootstrap/bootstrap.min.css" rel="stylesheet" />

<title>Login</title>
</head>
<body>
<%
String email = request.getParameter("email");
String password = request.getParameter("password");


%>

  <div>
    <h4 class="">Login</h4>
    <div class="card p-5">
      <form action="login" method="post">
        <div class="mb-3">
          <label for="exampleInputEmail1" class="form-label">Email Address</label>
          <input type="text" class="form-control" id="exampleInputEmail1" name="email">
          <div id="emailHelp" class="form-text">we will never share your email with anyone else.</div>
        </div>
        <div class="mb-3">
          <label for="exampleInputPassword1" class="form-label">Password</label>
          <input type="password" class="form-control" id="exampleInputPassword1" name="password">
        </div>
        <button type="submit" class="btn btn-primary w-100">Login</button>
      </form>
    </div>
  </div>
<script type="text/javascript" src="http://localhost:8080/AuthenticationLogin/assets/bootstrap/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="http://localhost:8080/AuthenticationLogin/assets/js/login.js"></script>
</body>
</html>