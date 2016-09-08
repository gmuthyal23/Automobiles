<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register user</title>
</head>
<body>
      <h2>please fill in details</h2>
      <form:form action="user/register" method="post" commandName="userdetails">
      <table>
      <tr>
          <td><form:label path="id">
              <spring:message text="ID"/>
              </form:label></td>
       <td><form:label path="id" pattern=".{4,7}" required="true"
            title="id should contain 4 to 7 characters"/></td>
            </tr>
        <tr>
         <td><<form:label path="name">
              <spring:message text="NAME"/>
              </form:label></td>  
           <td><form:label path="name"   required="true"
            title="name should not be empty"/></td>
            </tr> 
       </table>
       </form:form>     
</body>
</html>