/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Articulo {
    
    private int idArticulo;
    private String nombre;
    private int Categoria;
    private int nitProveedor;
    private int codBarra;
    private int costo;

    public int getIdArticulo() {
        return idArticulo;
    }
    
    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCategoria() {
        return Categoria;
    }
    
    public void setCategoria(int Categoria) {
    this.Categoria = Categoria;
    }

    public int getNitProveedor() {
    return nitProveedor;
    }
    
    public void setNitProveedor(int nitProveedor) {
    this.nitProveedor = nitProveedor;
    }

    public int getCodBarra() {
    return codBarra;
    }
    
    public void setCodBarra(int codBarra) {
    this.codBarra = codBarra;
    }

    public int getCosto() {
    return costo;
    }

    public void setCosto(int costo) {
    this.costo = costo;
    }
    
    
    
    
}
