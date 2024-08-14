/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayandmatrices;

import java.util.ArrayList;

/**
 *
 * @author jufeq
 */
public class ArrayAndMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Array
        System.out.println("===================================");
        System.out.println("==========   Array    =============");
        System.out.println("===================================");
        int arrayTest[] = new int[10];

        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = i + 1;
            System.out.println(arrayTest[i]);
        }

        //Matriz
        /*int matriz[][] = {
            {1, 2}, 
            {2, 3},
            {4, 5},
        };*/
        int matriz[][] = new int[2][2];
        int count = 1;
        System.out.println("===================================");
        System.out.println("==========   Matriz    ============");
        System.out.println("===================================");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = count;
                System.out.print(matriz[i][j] + " ");
                count++;
            }
            System.out.println("");
        }

        // ArrayList
        System.out.println("===================================");
        System.out.println("==========  Array List ============");
        System.out.println("===================================");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // ArrayList
        System.out.println("===================================");
        System.out.println("==========  Challenge =============");
        System.out.println("===================================");

        int matrizChallenge[][] = {
            {0, 0, 1},
            {0, 1, 0},
            {1, 0, 0}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= 0; j--) {
                if (matrizChallenge[i][j] == 1) {
                    System.out.println(matrizChallenge[i][j]);
                }
            }
        }

    }

}
