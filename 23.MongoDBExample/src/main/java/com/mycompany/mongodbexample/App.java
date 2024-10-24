/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mongodbexample;

/**
 *
 * @author jufeq
 */
import Entities.Student;
import Persistance.StudentRepository;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu: \n1. Add Student\n2. Get Student\n3. Update Student\n4. Delete Student\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    // Add Student
                    System.out.println("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.println("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Student Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter Student Course: ");
                    String course = scanner.nextLine();
                    
                    Student student = new Student(id, name, age, course);
                    repository.addStudent(student);
                    break;
                    
                case 2:
                    // Get Student
                    System.out.println("Enter Student ID to retrieve: ");
                    String searchId = scanner.nextLine();
                    Student foundStudent = repository.getStudentById(searchId);
                    if (foundStudent != null) {
                        System.out.println("Student found: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                    
                case 3:
                    // Update Student
                    System.out.println("Enter Student ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.println("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.println("Enter new age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter new course: ");
                    String newCourse = scanner.nextLine();
                    repository.updateStudent(updateId, newName, newAge, newCourse);
                    break;
                    
                case 4:
                    // Delete Student
                    System.out.println("Enter Student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    repository.deleteStudent(deleteId);
                    break;
                    
                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

