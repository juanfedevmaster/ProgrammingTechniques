/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg19.lambdaandfuntions;

/**
 *
 * @author jufeq
 */
public class House {
    private String address;
    private int numRooms;
    private double price;
    private boolean hasGarden;

    // Constructor
    public House(String address, int numRooms, double price, boolean hasGarden) {
        this.address = address;
        this.numRooms = numRooms;
        this.price = price;
        this.hasGarden = hasGarden;
    }

    // Getters and Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", numRooms=" + numRooms +
                ", price=" + price +
                ", hasGarden=" + hasGarden +
                '}';
    }
}

