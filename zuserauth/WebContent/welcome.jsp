<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Doctor</title>
</head>
<body>
<%
 String user = (String) request.getSession().getAttribute ("user");
%>
<form method ="get" action="/zuserAuth/Authenticate?Logout="<%= user%>>
<table>

<tr><td>Welcome </td><td><%=user%></td> </tr>
<tr><td>Welcome to Castle Portal</td><td></td> </tr>
<tr><td><Input Type = "Submit" name="Logout" value="logout"/></td> </tr>


</table>
</form>
</body>
</html>