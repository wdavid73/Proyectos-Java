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
public class Alquiler implements java.io.Serializable  {

    private String fechadealquiler;
    private String fechadeentrega;
    private int valor;
    private int deposito;
    private Persona personas;
    private Toga togas;

    public Alquiler(String fechadealquiler, String fechadeentrega, int valor, int deposito, Persona personas, Toga togas) {
        this.fechadealquiler = fechadealquiler;
        this.fechadeentrega = fechadeentrega;
        this.valor = valor;
        this.deposito = deposito;
        this.personas = personas;
        this.togas = togas;
    }

    

    public String getFechadealquiler() {
        return fechadealquiler;
    }

    public void setFechadealquiler(String fechadealquiler) {
        this.fechadealquiler = fechadealquiler;
    }

    public String getFechadeentrega() {
        return fechadeentrega;
    }

    public void setFechadeentrega(String fechadeentrega) {
        this.fechadeentrega = fechadeentrega;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public Persona getPersonas() {
        return personas;
    }

    public void setPersonas(Persona personas) {
        this.personas = personas;
    }

    public Toga getTogas() {
        return togas;
    }

    public void setTogas(Toga togas) {
        this.togas = togas;
    }

    
    
    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);

    }

}
