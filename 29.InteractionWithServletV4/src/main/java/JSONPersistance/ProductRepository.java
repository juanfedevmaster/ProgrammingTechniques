/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSONPersistance;

import Entities.Product;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author jufeq
 */
public class ProductRepository {

    private MongoDatabase dataBase;
    private MongoCollection<Document> productCollection;

    public ProductRepository() {
        var client = MongoClients.create("mongodb+srv://juanfeblogmaster:admin@cluster0.uzawp.mongodb.net/");
        dataBase = client.getDatabase("FinalProjectDB2");
        productCollection = dataBase.getCollection("Products");
    }

    // Read all Products
    public List<Product> getProducts() {
        FindIterable<Document> documents = productCollection.find();
        List<Product> products = new ArrayList<>();

        for (Document doc : documents) {
            products.add(Product.fromDocument(doc));
        }

        return products;
    }

    // Read Product from Id
    public Product getProduct(int id) {
        Document doc = productCollection.find(Filters.eq("id", id)).first();
        return doc != null ? Product.fromDocument(doc) : null;
    }

    // Update Product
    public void updateProduct(int id, String name, double price) {
        productCollection.updateOne(Filters.eq("id", id),
                combine(set("name", name), set("price", price)));
        System.out.println("Product update: "+ id);
    }
    
    // Delete
    public void deleteProduct(int id) {
        productCollection.deleteOne(Filters.eq("id", id));
        System.out.println("Product deleted: " + id);
    }
    
    // Create
    public void addProduct(Product product) {
        productCollection.insertOne(product.toDocument());
        System.out.println("Product added: " + product);
    }
}
