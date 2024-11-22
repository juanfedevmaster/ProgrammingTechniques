/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import org.bson.Document;

/**
 *
 * @author jufeq
 */
public class Product {
    private int id;
    private String name;
    private double price;

    public Product() {
        this.id = 0;
        this.name = "";
        this.price = 0.0;
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Document toDocument() {
        return new Document("id", id)
                .append("name", name)
                .append("price", price);
    }
    
    // Static Methods
    public static Product fromDocument(Document doc){
        return new Product(
                doc.getInteger("id"),
                doc.getString("name"),
                doc.getDouble("price")
        );
    }
}