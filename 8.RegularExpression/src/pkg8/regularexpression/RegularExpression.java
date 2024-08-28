/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jufeq
 */
public class RegularExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] dates = {"31/02/2023","12/05/2023", "01/01/2000", "32/05/2023", "12/13/2023", "12/05/23"};
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

        Pattern pattern = Pattern.compile(regex);

        for (String date : dates) {
            Matcher matcher = pattern.matcher(date);

            if (matcher.matches()) {
                System.out.println(date + " es una fecha valida.");
            } else {
                System.out.println(date + " es una fecha invalida.");
            }
        }
    }

}
