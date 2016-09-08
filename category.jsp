<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<title>Welcome, Enter The Category Details</title>
    <head>
    </head>
    <body>
    ${msg}
        <h1> add a Category</h1>
        <c:url> var="addAction" value="/category/add"></c:url>
        
        <form:form action=${addAction} commandName="category">
             <table>
               
                <tr>
                    <td><form:label path="id"><spring:message text="ID"/></form:label>
                    <c:choose>
                    <c:when test="${!empty category.id}">
                    <td><form:input path="id" disabled="true" readonly="true"/></td>
                    </c:when>
                    <c:otherwise>
                    <td><form:input path="id" pattern=".{4,7}" required="true"
                          title="id should contains 4 to 7 characters"/> </td>
                    </c:otherwise>
                    </c:choose>
                    
                </tr>
                <tr>
                    <td><form:label path="name"><spring:message text="name"/> </form:label>
                    <td><form:input  path="name" required="true" /></td>
                </tr>
                <tr>
                    <td><form:label path="description"><spring:message text="description"/></form:label>
                    <td><form:input path="description" required="true"/></td>
                </tr>
                
                <tr>
                    <td colspace="2"><c:if test="${!empty category.name}">
                      <input type="submit" value="<spring:message text="Edit Category"/>"/>
                     </c:if> <c:if test="${empty category.name}">
                     <input type="submit" value="<spring:message  text="Add Category"/>"/>
                     </c:if></td>
                </tr>
            </table>
        </form:form>
        <br>
        <h3>Category List</h3>
        <c:if test="${!empty categoryList}">
        <table class="tg">
        <tr>
        <th width="80">Category ID</th>
        <th width="120"> category name</th>
        <th width="120">Category Description</th>
        <th width="60">Edit </th>
        <th width="60">Delete</th>
        </tr>
        <c:forEach items="${categoryList}" var="category">
        <tr>
        <td>${category.id}</td>
        <td>${category.name}</td>
        <td>${category.description}</td>
        <td><a href="<c:url value="category/edit/${category.id}"/>">Edit</a></td>
        <td><a href="<c:url value="category/remove/${category.id}"/>">Delete</a></td>
        </tr>
        </c:forEach>
        </table>
        </c:if>
    </body>
</html>