<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Product Details</h3>
        
        <form:form method="POST" action="/addProduct" modelAttribute="product">
             <table>
               
                <tr>
                    <td><label for="id">id</label></td>
                    <td><form:input type="text" path="id"/></td>
                </tr>
                <tr>
                    <td><label for="name">name</label></td>
                    <td><form:input type="text" path="name"/></td>
                </tr>
                <tr>
                    <td><label for="description">description</label></td>
                    <td><form:input type="text" path="description"/></td>
                </tr>
                <tr>
                    <td><label for="price">price</label></td>
                    <td><form:input  path="price"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>