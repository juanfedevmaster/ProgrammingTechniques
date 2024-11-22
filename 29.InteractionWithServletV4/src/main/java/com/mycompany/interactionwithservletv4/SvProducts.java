/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.interactionwithservletv4;

import Entities.Product;
import JSONPersistance.ProductService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author jufeq
 */
public class SvProducts extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext context = request.getServletContext();
        String filePath = context.getRealPath("/WEB-INF/classes/META-INF/products.json");

        RequestDispatcher dispatcher;

        String id = request.getParameter("Id");

        ProductService productService = new ProductService(filePath);
        List<Product> products = productService.getProducts();

        if (id != null && !id.isEmpty()) {
            int idProduct = Integer.parseInt(id);
            Product product = products.stream().filter(x -> x.getId() == idProduct).findFirst().get();

            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("productDetails.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("products", products);

            dispatcher = request.getRequestDispatcher("products.jsp");
            dispatcher.forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext context = request.getServletContext();
        String filePath = context.getRealPath("/WEB-INF/classes/META-INF/products.json");
        
        ProductService productService = new ProductService(filePath);
        List<Product> products = productService.getProducts();

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String price = request.getParameter("price");

        if (id != null && !id.isEmpty()) {
            int idProduct = Integer.parseInt(id);
            Product product = products.stream().filter(x -> x.getId() == idProduct).findFirst().get();
            
            double priceConvert = Double.parseDouble(price);
            product.setName(name);
            product.setPrice(priceConvert);
            
            productService.saveJson(products);
            request.setAttribute("products", products);
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("products.jsp");
        dispatcher = request.getRequestDispatcher("products.jsp");
        dispatcher.forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
