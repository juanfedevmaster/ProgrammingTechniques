/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import Entities.Student;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import static com.mongodb.client.model.Updates.*;

public class StudentRepository {

    private MongoDatabase database;
    private MongoCollection<Document> studentsCollection;

    public StudentRepository() {
        var client = MongoClients.create("mongodb://localhost:27017"); // Conexión local
        database = client.getDatabase("school");
        studentsCollection = database.getCollection("students");
    }

    // Create
    public void addStudent(Student student) {
        studentsCollection.insertOne(student.toDocument());
        System.out.println("Student added: " + student);
    }

    // Read
    public Student getStudentById(String id) {
        Document doc = studentsCollection.find(Filters.eq("id", id)).first();
        return doc != null ? Student.fromDocument(doc) : null;
    }

    // Update
    public void updateStudent(String id, String name, int age, String course) {
        studentsCollection.updateOne(Filters.eq("id", id),
                combine(set("name", name), set("age", age), set("course", course)));
        System.out.println("Student updated: " + id);
    }

    // Delete
    public void deleteStudent(String id) {
        studentsCollection.deleteOne(Filters.eq("id", id));
        System.out.println("Student deleted: " + id);
    }
}
