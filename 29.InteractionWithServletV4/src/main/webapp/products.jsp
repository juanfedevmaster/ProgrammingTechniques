<%@page import="Entities.Product"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link href="https://cdn.datatables.net/2.1.8/css/dataTables.dataTables.css" rel="stylesheet">
    </head>
    <body>
        <% List<Product> products = (List<Product>) request.getAttribute("products");%>
        <div class="container text-center">
            <div class="row">
                <div class="col-2">

                </div>
                <div class="col-8">
                    <h1>Lista de Productos</h1>
                    <a class="btn btn-primary" role="button" aria-disabled="true" href="SvProducts?Id=0">Crear</a>
                    <table id="tableProducts" class="display" style="width:100%">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Name</th>
                                <th>Price</th>
                                <th>-</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% for (Product p : products) {%>
                            <tr>
                                <td>
                                    <%=p.getId()%>
                                </td>
                                <td>
                                    <%=p.getName()%>
                                </td>
                                <td>
                                    <%=p.getPrice()%>
                                </td>
                                <td>
                                    <a class="btn btn-primary" role="button" aria-disabled="true" href="SvProducts?Id=<%=p.getId()%>">Modificar</a>
                                    <a class="btn btn-danger" role="button" aria-disabled="true" href="SvProducts?Id=<%=p.getId()%>&action=delete">Eliminar</a>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
                <div class="col-2">

                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
        <script src="https://cdn.datatables.net/2.1.8/js/dataTables.js"></script>
        <script>
            new DataTable('#tableProducts');
        </script>
    </body>
</html>
