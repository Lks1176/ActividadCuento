/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personal.control;

import personal.model.User;
import com.google.gson.*;
import java.io.*;
import java.util.Properties;
/**
 *
 * @author User
 */
public class infoJson {    
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();    
        String fileJson = "C:\\Users\\User\\Documents\\NetBeansProjects\\Tale\\Datos\\taleLogin.json";   
        String info = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileJson))) {
            String line;
            while ((line = br.readLine()) != null) {
                info += line;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Properties properties = gson.fromJson(info, Properties.class);
        String user = (String) properties.get("username");
        String pass = (String) properties.get("password");

        User reader = gson.fromJson(info, User.class);
    }
}
