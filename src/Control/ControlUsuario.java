/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author daniel
 */
public class ControlUsuario {
    Conexion con=new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    Usuario usuario=new Usuario();
    Object[] Datos= new Object[3]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
        array debe ser el numero de columnas que tenga nuestra consulta*/
    
    public ControlUsuario(){
    }

    
    
    public void agregar()
    {
    /*Se le asigna a un string el insert en la base de datos*/
         String sqlUsuario="INSERT INTO Usuario VALUES"
                 + "("+usuario.getIdUsuario()+",'"+ usuario.getNombre()+"',"+usuario.getTelefono()+")";
         String sqlCuenta="INSERT INTO Cuenta VALUES"
                 + "()";
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sqlUsuario); /*se ejecuta en la base de datos*/
       /* rs=st.executeQuery(sqlCuenta); */
        }catch(SQLException e){}
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Object[] getDatos() {
        return Datos;
    }

    
    


}

    
    

