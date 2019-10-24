<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Doctor</title>
</head>
<% 
  String userLogged = (String)request.getSession().getAttribute("user");
  


%>
<body>
<%
if(userLogged!=null && userLogged.equalsIgnoreCase("user")) {
	response.sendRedirect("/zuserAuth/welcome.jsp");
}
%>

<form method ="post" action="/zuserAuth/Authenticate">
<table> 
<tr><td>User Id:</td><td><Input type ="text" name="user" maxlength="20"/></td> </tr>
<tr><td>Password:</td><td><Input type ="password" name="password" maxlength="20"/></td> </tr>
<tr><td><Input Type = "Submit" name="login" value="login">/</td> </tr>


</table>
</form>
</body>
</html>