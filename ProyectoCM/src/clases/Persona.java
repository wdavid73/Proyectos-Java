/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Wdavid
 */
public class Persona implements java.io.Serializable {

    
    private String nombre;
    private String apellidos;
    private String Direccion;
    private String Celular;
    private String telefono;
    private String sexo;
    
   

    public Persona(String nombre, String apellido , String Direccion , String Celular , String telefono , String sexo ) {
        
        this.nombre = nombre;
        this.apellidos = apellido;
        this.Direccion = Direccion ;
        this.Celular = Celular;
        this.telefono = telefono;
        this.sexo = sexo;
        
       
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellido) {
        this.apellidos = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);

    }

}

