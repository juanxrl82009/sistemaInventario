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

public class Factura{	
    private int IdFactura;
    private int IdCliente;
    private int IdUsuario;
    private Date FechaFactura;
    private int TotalFactura;
    	

     public int getIdFactura() {	
        return IdFactura;	
    }	

     public void setIdFactura(int IdFactura) {	
        this.IdFactura = IdFactura;	
    }	

     public int getIdCliente() {	
        return IdCliente;	
    }	

     public void setIdCliente(int IdCliente) {	
        this.IdCliente = IdCliente;	
    }	
     public int getIdUsuario() {	
        return IdUsuario;	
    }	

     public void setIdUsuario(int IdUsuario) {	
        this.IdUsuario = IdUsuario;	
    }	
     public Date getFechaFactura() {	
        return FechaFactura;	
    }	

     public void setFechaFactura(Date FechaFactura) {	
        this.FechaFactura = FechaFactura;	
    }	
     public int getTotalFactura() {	
        return TotalFactura;	
    }	

     public void setTotalFactura(int TotalFactura) {	
        this.TotalFactura = TotalFactura;	
    }	
} 
