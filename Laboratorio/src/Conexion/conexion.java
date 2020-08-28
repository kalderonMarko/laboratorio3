/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kimig
 */
public class conexion {
    Connection conect= null;
    String user="root";
    String pass="87654321";
    
    public Connection conexion (){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect=DriverManager.getConnection("jdbc:mysql://127.0.0.1/orden",user,pass);
        } catch (Exception e) {
            System.out.println("Error de coneccion");
            e.printStackTrace();
        }
        return conect;
    }
    
    public Connection desconected(){
        conect=null;
        if (conect != null) {
            System.out.println("No se puede desconectar");
        }
            return conect;

    }
}
