/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel Luna
 */
public class ControlCliente {
     Conexion con=new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    Cliente cliente=new Cliente();
    Object[] Datos= new Object[4]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
        array debe ser el numero de columnas que tenga nuestra consulta*/
    
    public ControlCliente(){
    }

    
    
    public void agregar()
    {
    /*Se le asigna a un string el insert en la base de datos*/
         String sqlCliente="INSERT INTO Cliente VALUES"
                 + "("+cliente.getIdCliente()+",'"+ cliente.getNombre()+"', '"+cliente.getDireccion()+"', '"+cliente.getTelefono()+"');";
        
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sqlCliente); /*se ejecuta en la base de datos*/
        }catch(SQLException e){}
    }
    
    public void modificar()
    {
    /*Se le asigna a un string el insert en la base de datos*/
         String sqlCliente="UPDATE Cliente "
                 + "SET nombrecliente = '"+cliente.getNombre()+"', direccioncliente = '"+cliente.getDireccion()+"', telefonocliente = '"+cliente.getTelefono()+"' WHERE idcliente = " +cliente.getIdCliente()+";";
        
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sqlCliente); /*se ejecuta en la base de datos*/
        }catch(SQLException e){}
    }
    
    public void eliminar()
    {
    /*Se le asigna a un string el insert en la base de datos*/
         String sqlCliente="DELETE FROM Cliente "
                 + "WHERE idcliente = " +cliente.getIdCliente()+";";
        
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sqlCliente); /*se ejecuta en la base de datos*/
        }catch(SQLException e){}
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Object[] getDatos() {
        return Datos;
    }
}
    
    

