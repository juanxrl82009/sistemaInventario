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
public class Cuenta {

    private int     idCuenta;
    private String  contraseña;
    private int     idCategoria;

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getIdCategoCuenta() {
        return idCategoria;
    }

    public void setIdCategoCuenta(int idCategoria) {
        this.idCategoria = idCategoria;
    }



}