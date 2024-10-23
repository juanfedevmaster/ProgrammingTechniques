/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg21.readfilesproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jufeq
 */
public class ReadFilesProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("D:\\UdeA\\Cursos\\UdeA2024-2\\GIT\\21.ReadFilesProject\\src\\pkg21\\readfilesproject\\test.txt");
        Scanner scan = new Scanner(file);
        var lineText = "";
            
        System.out.println("Read file...");
        while(scan.hasNextLine()){
            lineText += scan.nextLine();
            System.out.println(lineText);
        }
        
        FileWriter fileWriter = new FileWriter("D:\\UdeA\\Cursos\\UdeA2024-2\\GIT\\21.ReadFilesProject\\src\\pkg21\\readfilesproject\\test.txt");
        String[] objects = {"One", "Two", "Three"};
        
        for(String obj : objects){
            lineText += obj;
        }
        fileWriter.write(lineText);
        
        fileWriter.close();
    }
    
}
