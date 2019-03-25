/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author John Castro
 */
public class articulo {
    
    private int idArticulo;
    private String nomArticulo;
    private int idCategoria;
    private String nitProveedor;
    private int costo;

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNomArticulo() {
        return nomArticulo;
    }

    public void setNomArticulo(String nomArticulo) {
        this.nomArticulo = nomArticulo;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNitProveedor() {
        return nitProveedor;
    }
    public void setNitProveedor(String nitProveedor) {
        this.nitProveedor = nitProveedor;
    }
    
    public int getCosto() {
        return costo;
    }
    
     public void setCosto(int costo) {
        this.costo = costo;
    }

   

  
    
    
    
}
