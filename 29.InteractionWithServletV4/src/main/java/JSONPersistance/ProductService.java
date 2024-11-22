/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSONPersistance;

import Entities.Product;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jufeq
 */
public class ProductService {
      private String path;

    public ProductService() {
    }

    public ProductService(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    public List<Product> getProducts(){
        List<Product> products = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(this.path))) {
            Gson gson = new Gson();
            Type type = new TypeToken<List<Product>>() { }.getType();
            products = gson.fromJson(br, type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return products;
    }
    
    public void saveJson(List<Product> products) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(this.path)) {
            gson.toJson(products, writer);
            System.out.println("Archivo JSON guardado correctamente en: " + this.path);
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo JSON: " + e.getMessage());
        }
    }
}
