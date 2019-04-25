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
public class Usuario {
    public Usuario(){
        idUsuario=0;
        nombreUsuario="";
        password="";
        idCategoCuenta=0;
    }
    
    private int idUsuario;
    private String nombreUsuario;
    private String password;
    private int idCategoCuenta;
  
    public int getIdUsuario() {
        return idUsuario;
    }
 
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombre) {
        this.nombreUsuario = nombre;
    }
 
  
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    public int getIdCategoCuenta() {
        return idCategoCuenta;
    }

    public void setIdCategoCuenta(int idCategoCuenta) {
        this.idCategoCuenta = idCategoCuenta;
    }
}