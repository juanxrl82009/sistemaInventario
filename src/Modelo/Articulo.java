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
public class Articulo {

    private int idArticulo;
    private String nomArticulo;
    private int idCategoriaArticulo;
    private int nitProveedor;
    private int codBarra;
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

    public void setNombreArticulo(String nomArticulo) {
        this.nomArticulo = nomArticulo;
    }

    public int getIdCategoriaArticulo() {
        return idCategoriaArticulo;
    }

    public void setIdCategoriaArticulo(int idCategoriaArticulo) {
        this.idCategoriaArticulo = idCategoriaArticulo;
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

    public void setCodBarraArticuo(int codBarra) {
        this.codBarra = codBarra;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }






}