/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Conexion;
import Modelo.Compra;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel Luna
 */
public class ControlCompras {
    private Conexion con;
    Connection cn;
    Statement st;
    ResultSet rs;
    Compra compra=new Compra();
    Object[] Datos= new Object[4]; /*Un array donde se almacenan las filas de la tabla. el tamaño del
        array debe ser el numero de columnas que tenga nuestra consulta*/
    
    public ControlCompras(Conexion con1){
        con=con1;     
    }

    
    
    public void agregar()
    {
    /*Se le asigna a un string el insert en la base de datos*/
         String sqlCliente="INSERT INTO Compra VALUES"
                 + "(DEFAULT, "+ compra.getIdFacturacompra()+", "+compra.getIdUsuario()+", "+compra.getNitProveedor()+", '"+compra.getFechaCompra()+"', "+compra.getTotalCompra()+");";
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
         String sqlCliente="UPDATE Compra "
                + "SET idfacturacompra = '"+compra.getIdFacturacompra()+"', nitproveedor = '"+compra.getNitProveedor()+"', totalcompra = '"+compra.getTotalCompra()+"' WHERE idcompra = " +compra.getIdCompra()+";";
        
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
         String sqlCliente="DELETE FROM Compra"
                 + "WHERE idCompra = " +compra.getIdCompra()+";";
        
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn=con.getConnection();
        st=cn.createStatement();
        rs=st.executeQuery(sqlCliente); /*se ejecuta en la base de datos*/
        }catch(SQLException e){}
    }

    public Compra getCompra() {
        return compra;
    }

    public Object[] getDatos() {
        return Datos;
    }
}
    
    

