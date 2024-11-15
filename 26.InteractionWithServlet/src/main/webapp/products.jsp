<%-- 
    Document   : products.jsp
    Created on : 14/11/2024, 7:06:20 a. m.
    Author     : jufeq
--%>
<%@page import="java.util.List"%>
<%@page import="Entities.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%var listProducts = (List<Product>) request.getAttribute("products"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.datatables.net/2.1.8/css/dataTables.dataTables.css" rel="stylesheet">
    </head>
    <body>
        <h1>
            Lista de Productos
        </h1>
        <table id="example" class="display" style="width:100%">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Price</th>
                </tr>
            </thead>
            <tbody>
                <%for (Product p : listProducts) {%>
                <tr>
                    <td><%=p.getId()%></td>
                    <td><%=p.getName()%></td>
                    <td><%=p.getPrice()%></td>
                </tr>
                <%}%>
            </tbody>
        </table>
        <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
        <script src="https://cdn.datatables.net/2.1.8/js/dataTables.js"></script>

        <script>
            $('#example').DataTable();
        </script>
    </body>

</html>
