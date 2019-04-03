/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author daniel
 */

/*Esta clase es la que nos ayudara a conectar la base de datos con el programa en neatbeans*/
public class Conexion {
    Connection con;
    
    public Conexion() {
    try{
 Class.forName("org.postgresql.Driver"); 
 
 /*En esta parte "jdbc:postgresql://localhost:5432/ProyectoDS" modificar ProyectoDS por el nombre que le tengan
 a la base de datos del proyecto, despues de esto va el usuario de la base de datos y la contraseña que le tienen
en mi caso el usuario donde esta la base de datos es postgres y la contraseña danielcardona.
modifiquenlo segun lo tengan ustedes */
 con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProyectoDS","postgres","1727654");        
    }
    catch(Exception e){}           
}
    
    public Connection getConnection(){
        return con;
    }
}



