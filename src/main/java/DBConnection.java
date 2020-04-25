/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nimra Sajid
 */
public class DBConnection {
    public static Connection con;
    public static String msAccDB = "..//BikeShop.accdb";
    public static String dbUrl = "jdbc:ucanaccess://" + msAccDB;
            
    public static Connection getConnection(){
        
        try{
            
            con = DriverManager.getConnection(dbUrl, "", "");
            
        }catch(Exception ex){
            System.out.println(""+ex);
        
        }
        
        return con;
    }
}
