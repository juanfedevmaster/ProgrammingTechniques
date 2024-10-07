/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg19.lambdaandfuntions;

import java.util.function.Function;

/**
 *
 * @author jufeq
 */
public class SpaceBlanks implements Function<String, String> {

    @Override
    public String apply(String p) {
        p = p.trim();
        return p.replace(" ", "");
    }

}
