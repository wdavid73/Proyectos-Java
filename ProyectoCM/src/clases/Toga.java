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
public class Toga implements java.io.Serializable {

   private String color;
   private String Bufanda;
   private String Birete;
   private String Camisa;
   private String CantBufanda;
   private String CantBirete;
   private String CantCamisa;

    public Toga(String color, String Bufanda, String Birete, String Camisa, String CantBufanda, String CantBirete, String CantCamisa) {
        this.color = color;
        this.Bufanda = Bufanda;
        this.Birete = Birete;
        this.Camisa = Camisa;
        this.CantBufanda = CantBufanda;
        this.CantBirete = CantBirete;
        this.CantCamisa = CantCamisa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBufanda() {
        return Bufanda;
    }

    public void setBufanda(String Bufanda) {
        this.Bufanda = Bufanda;
    }

    public String getBirete() {
        return Birete;
    }

    public void setBirete(String Birete) {
        this.Birete = Birete;
    }

    public String getCamisa() {
        return Camisa;
    }

    public void setCamisa(String Camisa) {
        this.Camisa = Camisa;
    }

    public String getCantBufanda() {
        return CantBufanda;
    }

    public void setCantBufanda(String CantBufanda) {
        this.CantBufanda = CantBufanda;
    }

    public String getCantBirete() {
        return CantBirete;
    }

    public void setCantBirete(String CantBirete) {
        this.CantBirete = CantBirete;
    }

    public String getCantCamisa() {
        return CantCamisa;
    }

    public void setCantCamisa(String CantCamisa) {
        this.CantCamisa = CantCamisa;
    }

   
    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);

    }
}
