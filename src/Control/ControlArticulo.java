/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Articulo;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel Luna
 */
public class ControlArticulo {
     Conexion con=new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    Articulo articulo=new Articulo();
    Object[] Datos= new Object[6]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
        array debe ser el numero de columnas que tenga nuestra consulta*/
    
    
    public ControlArticulo(Conexion con1){
        con=con1;  
    }

    
    
    public void agregar()
    {
    /*Se le asigna a un string el insert en la base de datos*/
         String sqlArticulo="INSERT INTO Articulo VALUES"
                 + "("+articulo.getIdArticulo()+",'"+ articulo.getNombre()+"','"+articulo.getCategoria()+"',"+articulo.getNitProveedor()+","+articulo.getCodBarra()+","+articulo.getCosto()+");"
                 + "INSERT INTO registroinventario VALUES"
                 + "("+articulo.getIdArticulo()+",0);";
        
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sqlArticulo); /*se ejecuta en la base de datos*/
        }catch(SQLException e){}
    }
    
    public void modificar()
    {
    /*Se le asigna a un string el insert en la base de datos*/
         String sqlProveedor="UPDATE Articulo "
                 + "SET nombreArticulo = '"+articulo.getNombre()+"', idCategoriaArticulo = "+articulo.getCategoria()+", nitProveedor = "+articulo.getNitProveedor()+", codBarraArticulo = "+articulo.getCodBarra()+", precioArticulo = "+articulo.getCosto()+" WHERE idArticulo = " +articulo.getIdArticulo()+";";
        
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
         String sqlProveedor="DELETE FROM Articulo "
                 + "WHERE idarticulo = " +articulo.getIdArticulo()+";";
        
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sqlProveedor); /*se ejecuta en la base de datos*/
        }catch(SQLException e){}
    }

    
    public Articulo getArticulo(){
        return articulo;
    }
    
  
    
    public Object[] getDatos() {
        return Datos;
    }

 
}
    
    

