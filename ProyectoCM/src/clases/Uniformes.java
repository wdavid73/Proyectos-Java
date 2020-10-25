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
public class Uniformes implements java.io.Serializable {

    private String nombredecolegio;
    private String direccion;
    private String cuello;
    private String bordado;
    private String tipo;
    private String telefono;
    private String estanpado;
    private String escudo;
    private String puños;
    private String sexo;

    public Uniformes(String nombredecolegio, String direccion, String cuello, String bordado, String tipo,  String telefono, String estanpado, String escudo, String puños, String sexo) {
        this.nombredecolegio = nombredecolegio;
        this.direccion = direccion;
        this.cuello = cuello;
        this.bordado = bordado;
        this.tipo = tipo;
        this.telefono = telefono;
        this.estanpado = estanpado;
        this.escudo = escudo;
        this.puños = puños;
        this.sexo = sexo;
    }

    public String getNombredecolegio() {
        return nombredecolegio;
    }

    public void setNombredecolegio(String nombredecolegio) {
        this.nombredecolegio = nombredecolegio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public String getBordado() {
        return bordado;
    }

    public void setBordado(String bordado) {
        this.bordado = bordado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstanpado() {
        return estanpado;
    }

    public void setEstanpado(String estanpado) {
        this.estanpado = estanpado;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public String getPuños() {
        return puños;
    }

    public void setPuños(String puños) {
        this.puños = puños;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }

}
