/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO_Billing_s;

/**
 *
 * @author SHAHEEN PC
 */
import java.sql.*;
import javax.swing.*;

public class JavaConnection {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\HASEEB\\Documents\\NetBeansProjects\\OO_Billing\\src\\OO_Billing_s\\mydatabase.sqlite");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        return null;
    }
    
    
}
