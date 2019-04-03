/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Conexion;
import Modelo.Cuenta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author daniel
 */
public class ControlCuenta {
    Conexion con=new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    Cuenta cuenta=new Cuenta();
    
    
    
    
    public void agregarCuenta(){
      String sqlCuenta="INSERT INTO Cuenta VALUES"
                 + "("+cuenta.getIdCuenta()+","+ "crypt('"+cuenta.getContraseña()+"', gen_salt('bf', 8)),"+cuenta.getIdCategoCuenta()+")";
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sqlCuenta); /*se ejecuta en la base de datos*/
       /* rs=st.executeQuery(sqlCuenta); */
        }catch(SQLException e){}
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }
    
}




