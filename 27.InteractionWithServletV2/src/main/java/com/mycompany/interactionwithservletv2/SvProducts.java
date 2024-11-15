/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.interactionwithservletv2;

import Entities.Product;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jufeq
 */
public class SvProducts extends HttpServlet {

    private List<Product> products = new ArrayList<>();

    private void generateProducts() {
        String[] productNames = {
            "Laptop", "Mouse", "Keyboard", "Monitor", "Headphones",
            "Smartphone", "Tablet", "Smartwatch", "Printer", "Camera",
            "Speaker", "Router", "USB Drive", "External HDD", "Power Bank",
            "Microphone", "Webcam", "Projector", "Scanner", "Charger"
        };

        Random random = new Random();

        for (int i = 1; i <= 20; i++) {
            String name = productNames[random.nextInt(productNames.length)];
            double price = 10 + (1000 - 10) * random.nextDouble();
            Product product = new Product(i, name, Math.round(price * 100.0) / 100.0);
            products.add(product);
        }
    }

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        /*if (products.size() == 0) {
            generateProducts();
        }*/

        ServletContext context = request.getServletContext();
        String filePath = context.getRealPath("/WEB-INF/classes/Persistance/products.json");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            Gson gson = new Gson();
            Type type = new TypeToken<List<Product>>() { }.getType();
            products = gson.fromJson(br, type);
            request.setAttribute("products", products);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("products.jsp");
            dispatcher.forward(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException exe) {
            exe.printStackTrace();
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
