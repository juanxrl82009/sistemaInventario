/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;



import Modelo.Categoria;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel Luna
 */
public class ControlCategoria {
    private Conexion con;
    Connection cn;
    Statement st;
    ResultSet rs;
    Categoria categoria=new Categoria();
    Object[] Datos= new Object[2]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
        array debe ser el numero de columnas que tenga nuestra consulta*/
    
    public ControlCategoria(Conexion con1){
        con=con1;     
    }

    
    
    public void agregar()
    {
    /*Se le asigna a un string el insert en la base de datos*/
         String sqlCliente="INSERT INTO CategoriaArticulo VALUES"
                 + "("+categoria.getIdCategoria()+",'"+categoria.getDescripcion()+"');";
        
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
         String sqlCliente="UPDATE CategoriaArticulo "
                 + "SET descripcionCategArticulo = '"+categoria.getDescripcion()+"' WHERE idCategoriaArticulo = " +categoria.getIdCategoria()+";";
        
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
         String sqlCliente="DELETE FROM CategoriaArticulo "
                 + "WHERE idCategoriaArticulo = " +categoria.getIdCategoria()+";";
        
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sqlCliente); /*se ejecuta en la base de datos*/
        }catch(SQLException e){}
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Object[] getDatos() {
        return Datos;
    }

}
