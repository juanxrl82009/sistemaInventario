/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static java.lang.Class.forName;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author daniel
 */

/*Esta clase es la que nos ayudara a conectar la base de datos con el programa en netbeans*/
public class Conexion {
    
    private Connection connection=null;
    private String baseDatos;
    private String usuario;
    private String contrasena;
    
    public Conexion() {
     
    }
    
     public void CrearConexion(){
         
         if(connection!=null){
             return;
         }
         try{
            Class.forName("org.postgresql.Driver"); 
            /*En esta parte nos conectamos con la base de datos, se pone la base de datos, el usuario y la contraseña.*/
            //connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+baseDatos,usuario,contrasena); 
            connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/sistemainventariofinal","postgres","postgres"); 
         
            if(connection!=null){
                System.out.println("La conexión es exitosa");
            }
         }
         catch(Exception e){}   
            System.out.println("Hay problemas en la conexión");
         }

     
    public Connection getConnection(){
        return connection;
    }
    
    

    public String getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}



