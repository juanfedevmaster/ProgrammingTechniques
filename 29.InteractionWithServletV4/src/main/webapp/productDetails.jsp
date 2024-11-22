<%-- 
    Document   : productDetails
    Created on : 20/11/2024, 7:07:25 a. m.
    Author     : jufeq
--%>

<%@page import="Entities.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <% Product product = (Product) request.getAttribute("product");%>
        <div class="container text-center">
            <div class="row">
                <div class="col">

                </div>
                <div class="col mt-5 border border-dark rounded">
                    <form action="SvProducts" method="post" class="pt-3 pb-3">
                        <div class="form-group">
                            <label for="id" class="form-label d-flex justify-content-start">Id Product</label>
                            <input type="number" class="form-control" name="id" id="id" value="<%= product.getId()%>" readonly="true">
                        </div>
                        <div class="form-group">
                            <label for="name" class="form-label d-flex justify-content-start">Product Name</label>
                            <input type="text" class="form-control" name="name" id="name" value="<%= product.getName()%>">
                        </div>
                        <div class="form-group">
                            <label for="price" class="form-label d-flex justify-content-start">Product Price</label>
                            <input type="number" class="form-control" name="price" id="price" value="<%= product.getPrice()%>">
                        </div>
                        <div class="form-label d-flex justify-content-start mt-3">
                            <input type="submit" class="btn btn-primary" value="Guardar">
                        </div>
                    </form>
                </div>
                <div class="col">

                </div>
            </div>
        </div>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
