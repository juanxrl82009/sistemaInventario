/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author John Castro
 */
public class Usuario {
    
    private int idUsuario;
    private String nombre;
    private int telefono;
    private Date fechaNacimiento;
    
    public Usuario(int id, String nombre, int tel, Date fechaN){
        idUsuario=id;
        this.nombre=nombre;
        telefono=tel;
        fechaNacimiento=fechaN;
    }
    
    public Usuario(){
        idUsuario=0;
        nombre="";
        telefono=0;
        fechaNacimiento=null;
    }
  
    
    
    public int getIdUsuario() {
        return idUsuario;
    }
 
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
  
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
}
