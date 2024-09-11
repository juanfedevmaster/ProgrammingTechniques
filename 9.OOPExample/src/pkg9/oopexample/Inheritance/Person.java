/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.oopexample.Inheritance;

/**
 *
 * @author jufeq
 */
public class Person {
    private String id;
    private String name;
    private String lastName;
    private String career;
    private String university;
    private int age;
    private float height;
    private boolean gender;
    
    public Person(){
    
    }
    
    public Person(String id, String name, String lastName, String career, String university, int age, float height, boolean gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.career = career;
        this.university = university;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }
    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}