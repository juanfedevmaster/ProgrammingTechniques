/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg19.lambdaandfuntions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 *
 * @author jufeq
 */
public class LambdaAndFuntions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Function<String, String> trimFunction = (String p) -> {
            p = p.trim();
            return p.replace(" ", "");
        };

        SpaceBlanks spaceBlank = new SpaceBlanks();

        System.out.println(trimFunction.apply("       Juan Felipe      "));
        System.out.println(spaceBlank.apply("       Juan Felipe2      "));

        List<House> houseList = new ArrayList<>();

        houseList.add(new House("123 Elm St", 3, 250000.0, true));
        houseList.add(new House("456 Oak St", 4, 300000.0, false));
        houseList.add(new House("789 Maple St", 2, 150000.0, true));
        houseList.add(new House("101 Pine St", 5, 350000.0, true));
        houseList.add(new House("202 Birch St", 3, 200000.0, false));
        houseList.add(new House("303 Cedar St", 4, 275000.0, true));
        houseList.add(new House("404 Spruce St", 3, 240000.0, false));
        houseList.add(new House("505 Ash St", 2, 180000.0, true));
        houseList.add(new House("606 Walnut St", 4, 320000.0, false));
        houseList.add(new House("707 Cherry St", 3, 230000.0, true));

        List<House> result = houseList.stream()
                .filter(x -> x.getPrice() > 300000 && x.isHasGarden() == true)
                .toList();
        for (var house : result) {
            System.out.println(house.toString());
        }

    }

}
