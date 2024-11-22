/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.interactionwithservletv4;

import Entities.Product;
import JSONPersistance.ProductRepository;
import JSONPersistance.ProductService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Comparator;
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

        ProductRepository productRepo = new ProductRepository();
        RequestDispatcher dispatcher;

        String id = request.getParameter("Id");
        String action = request.getParameter("action");

        if (action == null) {

            if (id != null && !id.isEmpty() && id.equals("0")) {
                Product product = new Product();

                request.setAttribute("product", product);
                dispatcher = request.getRequestDispatcher("productDetails.jsp");
                dispatcher.forward(request, response);
            } else if (id != null && !id.isEmpty() && !id.equals("0")) {
                int idProduct = Integer.parseInt(id);
                Product product = productRepo.getProduct(idProduct);

                request.setAttribute("product", product);
                dispatcher = request.getRequestDispatcher("productDetails.jsp");
                dispatcher.forward(request, response);
            } else {
                List<Product> products = productRepo.getProducts();
                request.setAttribute("products", products);

                dispatcher = request.getRequestDispatcher("products.jsp");
                dispatcher.forward(request, response);
            }
        } 
        
        if(action != null && action.equals("delete")){
            if (id != null && !id.isEmpty()) {
                int idProduct = Integer.parseInt(id);
                productRepo.deleteProduct(idProduct);

                List<Product> products = productRepo.getProducts();
                request.setAttribute("products", products);

                dispatcher = request.getRequestDispatcher("products.jsp");
                dispatcher.forward(request, response);
            }
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

        ProductRepository productRepo = new ProductRepository();

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String price = request.getParameter("price");

        if (id != null && !id.isEmpty() && id.equals("0")) {
            int idProduct = Integer.parseInt(id);
            double priceProduct = Double.parseDouble(price);

            List<Product> products = productRepo.getProducts();
            int maxId = products.stream().max(Comparator.comparing(Product::getId)).get().getId() + 1;

            Product product = new Product(maxId, name, priceProduct);
            productRepo.addProduct(product);

            products.add(product);

            request.setAttribute("products", products);

        } else if (id != null && !id.isEmpty() && !id.equals("0")) {
            int idProduct = Integer.parseInt(id);
            double priceProduct = Double.parseDouble(price);
            productRepo.updateProduct(idProduct, name, priceProduct);

            List<Product> products = productRepo.getProducts();
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
