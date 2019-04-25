/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author danie
 */

import java.util.Date;

public class Compra{	
    private int IdCompra;
    private int IdFacturacompra;
    private int IdUsuario;
    private int NitProveedor;
    private Date FechaCompra;
    private int TotalCompra;
    	

     public int getIdCompra() {	
        return IdCompra;	
    }	

     public void setIdCompra(int IdCompra) {	
        this.IdCompra = IdCompra;	
    }	

     public int getIdFacturacompra() {	
        return IdFacturacompra;	
    }	

     public void setIdFacturacompra(int IdFacturacompra) {	
        this.IdFacturacompra = IdFacturacompra;	
    }	
     public int getIdUsuario() {	
        return IdUsuario;	
    }	

     public void setIdUsuario(int IdUsuario) {	
        this.IdUsuario = IdUsuario;	
    }	
     public int getNitProveedor() {	
        return NitProveedor;	
    }	

     public void setNitProveedor(int NitProveedor) {	
        this.NitProveedor = NitProveedor;	
    }	
     public Date getFechaCompra() {	
        return FechaCompra;	
    }	

     public void setFechaCompra(Date FechaCompra) {	
        this.FechaCompra = FechaCompra;	
    }	
     
     public int getTotalCompra() {	
        return TotalCompra;	
    }	

     public void setTotalCompra(int TotalCompra) {	
        this.TotalCompra = TotalCompra;	
    }	


 } 
