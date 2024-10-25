/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mongodbloadtest;

import Entities.Student;
import Persistance.StudentRepository;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jufeq
 */
public class App {

    private static int id = 100000000;
    private static StudentRepository repository = new StudentRepository();

    private static final List<String> NAMES = Arrays.asList(
            "Liam", "Olivia", "Noah", "Emma", "Oliver", "Ava", "Elijah", "Sophia", "William", "Isabella",
            "James", "Mia", "Benjamin", "Amelia", "Lucas", "Harper", "Henry", "Evelyn", "Alexander", "Abigail",
            "Michael", "Emily", "Ethan", "Ella", "Daniel", "Elizabeth", "Matthew", "Camila", "Aiden", "Luna",
            "Joseph", "Sofia", "John", "Avery", "David", "Mila", "Wyatt", "Aria", "Carter", "Scarlett",
            "Julian", "Penelope", "Grayson", "Layla", "Leo", "Chloe", "Jayden", "Victoria", "Gabriel", "Madison"
    );

    private static final List<String> LAST_NAMES = Arrays.asList(
            "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez",
            "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Thomas", "Taylor", "Moore", "Jackson", "Martin",
            "Lee", "Perez", "Thompson", "White", "Harris", "Sanchez", "Clark", "Ramirez", "Lewis", "Robinson",
            "Walker", "Young", "Allen", "King", "Wright", "Scott", "Torres", "Nguyen", "Hill", "Flores",
            "Green", "Adams", "Nelson", "Baker", "Hall", "Rivera", "Campbell", "Mitchell", "Carter", "Roberts"
    );

    private static final List<String> COURSES = Arrays.asList(
            "Logic I", "Logic II", "Programming Technics", "Softweare Architecture"
    );

    public static String getRandomName() {
        Random random = new Random();
        return NAMES.get(random.nextInt(NAMES.size()));
    }

    public static String getRandomLastName() {
        Random random = new Random();
        return LAST_NAMES.get(random.nextInt(LAST_NAMES.size()));
    }

    public static String getRandomCourses() {
        Random random = new Random();
        return COURSES.get(random.nextInt(COURSES.size()));
    }

    public static int getRandomAge() {
        Random random = new Random();
        return random.nextInt(80 - 14 + 1) + 14;
    }
    
    public static void preCharge(){
        var repository = new StudentRepository();
        for (int i = 0; i < 1000000; i++) {
            String name = getRandomName();
            String lastName = getRandomLastName();
            String course = getRandomCourses();
            int age = getRandomAge();
            var idStudent = (id + i) + "";
            
            var fullName = name + " " + lastName;

            var student = new Student(idStudent, fullName, age, course);
            repository.addStudent(student);
            System.out.println(student);
        }
    }
    
    public static void main(String[] args) {
        //preCharge();
        var student = repository.getStudentById("100555772");
        System.out.println(student);
    }
}
