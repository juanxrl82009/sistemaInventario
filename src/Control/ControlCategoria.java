/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


import Modelo.Conexion;
import Modelo.Categoria;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Usuario
 */
public class ControlCategoria {
    private Conexion con;
    Connection cn;
    Statement st;
    ResultSet rs;
    Categoria categoria = new Categoria();
    Object[] Datos = new Object [2];
    
    public ControlCategoria (Conexion con1){
        con=con1;
    }
    
    public void agregar()
    {
        String sqlCategoriaArticulo = "INSERT INTO CategoriaArticulo VALUES"
                +"("+categoria.getIdCategoria()+",'"+categoria.getDescripcion()+"');";  
    try
    {
    cn=con.getConnection();
    st=cn.createStatement();
    rs=st.executeQuery(sqlCategoriaArticulo);
    }catch(SQLException E){}
    }
    
    public void modificar()
    {
        String sqlCategoriaArticulo="UPDATE CategoriaArticulo"
                + "SET Descripcion = '"+categoria.getDescripcion()+" ' WHERE idCategoriaArticulo = "+categoria.getIdCategoria()+";";
    try{
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sqlCategoriaArticulo);
    }catch(SQLException e){}
    }
    
    public void eliminar()
    {
       String sqlCategoriaArticulo = "DELETE FROM CategoriaArticulo"
               + "WHERE idCategoriaArticulo= "+ categoria.getIdCategoria()+";";
    try{
       cn=con.getConnection();
       st=cn.createStatement();
       rs=st.executeQuery(sqlCategoriaArticulo);
        }catch(SQLException E){}
    }
    
    public Categoria getCategoria(){
        return categoria;
    }
    
    public Object [] getDatos() {
        return Datos;
    }
}
