/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Conexion;
import Modelo.LineaCompra;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel Luna
 */
public class ControlLineaCompra {
    private Conexion con;
    Connection cn;
    Statement st;
    ResultSet rs;
    LineaCompra lineaCompra=new LineaCompra();
    Object[] Datos= new Object[4]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
        array debe ser el numero de columnas que tenga nuestra consulta*/
    
    public ControlLineaCompra(Conexion con1){
        con=con1;     
    }

    
    
    public void agregar()
    {
    /*Se le asigna a un string el insert en la base de datos*/
         String sqlCliente="INSERT INTO LineaCompra VALUES"
                 + "(DEFAULT, "+ lineaCompra.getIdArticulo()+", "+lineaCompra.getIdCompra()+", "+lineaCompra.getCantidadArticulo()+", "+lineaCompra.getCostoArticulo()+", "+lineaCompra.getSubtotal()+");";
        System.out.println(sqlCliente);
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
         String sqlCliente="UPDATE LineaCompra "
                + "SET idarticulo = '"+lineaCompra.getIdArticulo()+"', idcompra = '"+lineaCompra.getIdCompra()+"', cantidadarticulo = '"+lineaCompra.getCantidadArticulo()+"', costoarticulo = '"+lineaCompra.getCostoArticulo()+"', subtotal = '"+lineaCompra.getSubtotal()+"' WHERE idcompra = " +lineaCompra.getIdLinea()+";";
        
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
         String sqlCliente="DELETE FROM LineaCompra"
                 + "WHERE idCompra = " +lineaCompra.getIdLinea()+";";
        
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sqlCliente); /*se ejecuta en la base de datos*/
        }catch(SQLException e){}
    }

    public LineaCompra getLineaCompra() {
        return lineaCompra;
    }

    public Object[] getDatos() {
        return Datos;
    }
}
    
    

