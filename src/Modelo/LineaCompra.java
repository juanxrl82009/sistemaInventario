/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author danie
 */
public class LineaCompra {
    
    private int IdLinea;
    private int IdArticulo;
    private int IdCompra;
    private int CantidadArticulo;
    private int CostoArticulo;
    private int Subtotal;
    
    public int getIdLinea() {	
        return IdLinea;	
    }	

     public void setIdLinea(int IdLinea) {	
        this.IdLinea = IdLinea;	
    }	
     
     public int getIdArticulo() {	
        return IdArticulo;	
    }	

     public void setIdArticulo(int IdArticulo) {	
        this.IdArticulo = IdArticulo;	
    }	
     
     public int getIdCompra() {	
        return IdCompra;	
    }	

     public void setIdCompra(int IdCompra) {	
        this.IdCompra = IdCompra;	
    }	
     
     public int getCantidadArticulo() {	
        return CantidadArticulo;	
    }	

     public void setCantidadArticulo(int CantidadArticulo) {	
        this.CantidadArticulo = CantidadArticulo;	
    }	
     
     public int getCostoArticulo() {	
        return CostoArticulo;	
    }	

     public void setCostoArticulo(int CostoArticulo) {	
        this.CostoArticulo = CostoArticulo;	
    }	
     
     public int getSubtotal() {	
        return Subtotal;	
    }	

     public void setSubtotal(int Subtotal) {	
        this.Subtotal = Subtotal;	
    }
}
