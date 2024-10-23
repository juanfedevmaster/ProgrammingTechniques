/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import Entities.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jufeq
 */
public class LoginPersistance {
    
    public boolean validateUserAndPassword(String user, String pass) {
        Gson gson = new Gson();

        try (Reader reader = new FileReader("login.json")) {
            List<User> lstUser = new ArrayList<User>();
            lstUser = gson.fromJson(reader,
                    new TypeToken<ArrayList<User>>() { }.getType());

            var userExist = lstUser.stream().anyMatch(x -> 
                    x.getUser().equals(user)
                    && x.getPassUser().equals(pass));

            return userExist;
        } catch (Exception exe) {
            System.out.println("Error, el archivo no existe");
        }

        return false;
    }
}
