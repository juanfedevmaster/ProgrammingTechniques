/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import Entidades.Persona;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jufeq
 */
public class Archivo {

    public boolean GuardarPersona(Persona p) throws IOException {
        String lineText = LeerArchivo();
        FileWriter fileWriter = new FileWriter("D:\\UdeA\\Cursos\\UdeA2024-2\\GIT\\21.ReadFilesProject\\src\\pkg21\\readfilesproject\\test.txt");
        
        lineText += p.getInfoPersona();
        
        fileWriter.write(lineText);

        fileWriter.close();

        return true;
    }

    public String LeerArchivo() throws FileNotFoundException {
        File file = new File("D:\\UdeA\\Cursos\\UdeA2024-2\\GIT\\21.ReadFilesProject\\src\\pkg21\\readfilesproject\\test.txt");
        Scanner scan = new Scanner(file);
        var lineText = "";

        System.out.println("Read file...");
        while (scan.hasNextLine()) {
            lineText += scan.nextLine()+"\n";
        }
        
        return lineText;
    }
}
