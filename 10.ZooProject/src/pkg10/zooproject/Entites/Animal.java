/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.zooproject.Entites;

import pkg10.zooproject.Entites.Enumerator.Skin;

/**
 *
 * @author jufeq
 */
public class Animal {
    private Skin skin;
    private String name;

    public Animal(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    public Animal() {
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
