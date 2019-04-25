/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Conexion;
import Modelo.Proveedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel Luna
 */
public class ControlProveedor {
     Conexion con=new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    Proveedor proveedor=new Proveedor();
    Object[] Datos= new Object[4]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
        array debe ser el numero de columnas que tenga nuestra consulta*/
    
    public ControlProveedor(Conexion con1){
        con=con1;  
    }

    
    
    public void agregar()
    {
    /*Se le asigna a un string el insert en la base de datos*/
         String sqlProveedor="INSERT INTO Proveedor VALUES"
                 + "("+proveedor.getNit()+",'"+ proveedor.getNomProveedor()+"', '"+proveedor.getDireccion()+"', '"+proveedor.getTelefono()+"');";
        
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sqlProveedor); /*se ejecuta en la base de datos*/
        }catch(SQLException e){}
    }
    
    public void modificar()
    {
    /*Se le asigna a un string el insert en la base de datos*/
         String sqlProveedor="UPDATE Proveedor "
                 + "SET nombreproveedor = '"+proveedor.getNomProveedor()+"', direccionproveedor = '"+proveedor.getDireccion()+"', telefonoproveedor = '"+proveedor.getTelefono()+"' WHERE nitproveedor = " +proveedor.getNit()+";";
        
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sqlProveedor); /*se ejecuta en la base de datos*/
        }catch(SQLException e){}
    }
    
    public void eliminar()
    {
    /*Se le asigna a un string el insert en la base de datos*/
         String sqlProveedor="DELETE FROM Proveedor "
                 + "WHERE nitproveedor = " +proveedor.getNit()+";";
        
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sqlProveedor); /*se ejecuta en la base de datos*/
        }catch(SQLException e){}
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public Object[] getDatos() {
        return Datos;
    }
}
    
    

