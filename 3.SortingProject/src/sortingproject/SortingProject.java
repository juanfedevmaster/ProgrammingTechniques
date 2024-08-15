/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortingproject;

/**
 *
 * @author juan.quintanag
 */
public class SortingProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sortBySelection();
    }

    public static void sortByInsertion() {
        int[] arrayToSorting = {1, 7, 7, 5, 6, 2, 4, 7, 10, 12, 25};
        int n = arrayToSorting.length;

        System.out.println("Array not sort (Insertion method):");
        printArray(arrayToSorting);

        for (int i = 0; i < n; i++) {
            int p = arrayToSorting[i];
            int j = i - 1;
            while (j >= 0 && p < arrayToSorting[j]) {
                arrayToSorting[j + 1] = arrayToSorting[j];
                j--;
            }
            arrayToSorting[j + 1] = p;
        }

        System.out.println("Array sorted (Insertion method):");
        printArray(arrayToSorting);

    }

    public static void sortBySelection() {
        int[] arrayToSorting = {1, 7, 7, 5, 6, 2, 4, 7, 10, 12, 25};
        int n = arrayToSorting.length;

        System.out.println("Array not sort (Selection method):");
        printArray(arrayToSorting);
        
        for (int i = 0; i < n; i++) {
            int p = i;
            int j = i + 1;
            while (j < n) {
                if (arrayToSorting[j] < arrayToSorting[p]) {
                    p = j;
                }
                j++;
            }

            int temp = arrayToSorting[i];
            arrayToSorting[i] = arrayToSorting[p];
            arrayToSorting[p] = temp;
        }
        
        System.out.println("Array sorted (Selection method):");
        printArray(arrayToSorting);
    }

    public static void printArray(int[] arrayList) {
        for (int element : arrayList) {
            System.out.println("Element: " + element);
        }
    }

}
