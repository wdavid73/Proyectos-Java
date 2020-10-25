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
public class MedidasdeMujer implements java.io.Serializable {


    private String TalleTrasero;
    private String TalleDelantero;
    private String Busto;
    private String Cintura;
    private String Cadera;
    private String LargodePantalon;
    private String AltodeRodilla;
    private String AnchodeRodilla;
    private String Anchodepierna;
    private String Espalda;
    private String AltodePinza;
    private String SeparaciondePinza;
    private String LargodeManga;
    private String Puño;
    private String LargodeFalda;
    private Persona personas;

    public MedidasdeMujer(String TalleDelantero, String TalleTrasero, String Busto, String Cintura, String Cadera, String Espalda, String AltodePinza, String SeparaciondePinza,
            String LargodeManga, String Puño, String LargodePantalon, String AltodeRodilla,
            String AnchodeRodilla, String Anchodepierna, String LargodeFalda, Persona personas) {
        
        this.Espalda = Espalda;
        this.TalleTrasero = TalleTrasero;
        this.TalleDelantero = TalleDelantero;
        this.Busto = Busto;
        this.Cintura = Cintura;
        this.Cadera = Cadera;
        this.LargodePantalon = LargodePantalon;
        this.AltodeRodilla = AltodeRodilla;
        this.AnchodeRodilla = AnchodeRodilla;
        this.Anchodepierna = Anchodepierna; 
        this.AltodePinza = AltodePinza;
        this.SeparaciondePinza = SeparaciondePinza;
        this.LargodeManga = LargodeManga;
        this.Puño = Puño;
        this.LargodeFalda = LargodeFalda;
        this.personas = personas;

    }

    public String getTalleDelantero() {
        return TalleDelantero;
    }

    public void setTalleDelantero(String TalleDelantero) {
        this.TalleDelantero = TalleDelantero;
    }

    public String getTalleTrasero() {
        return TalleTrasero;
    }

    public void setTalleTrasero(String TalleTrasero) {
        this.TalleTrasero = TalleTrasero;
    }

    public String getBusto() {
        return Busto;
    }

    public void setBusto(String Busto) {
        this.Busto = Busto;
    }

    public String getCintura() {
        return Cintura;
    }

    public void setCintura(String Cintura) {
        this.Cintura = Cintura;
    }

    public String getCadera() {
        return Cadera;
    }

    public void setCadera(String Cadera) {
        this.Cadera = Cadera;
    }

    public String getEspalda() {
        return Espalda;
    }

    public void setEspalda(String Espalda) {
        this.Espalda = Espalda;
    }

    public String getAltodePinza() {
        return AltodePinza;
    }

    public void setAltodePinza(String AltodePinza) {
        this.AltodePinza = AltodePinza;
    }

    public String getSeparaciondePinza() {
        return SeparaciondePinza;
    }

    public void setSeparaciondePinza(String SeparaciondePinza) {
        this.SeparaciondePinza = SeparaciondePinza;
    }

    public String getLargodeManga() {
        return LargodeManga;
    }

    public void setLargodeManga(String LargodeManga) {
        this.LargodeManga = LargodeManga;
    }

    public String getPuño() {
        return Puño;
    }

    public void setPuño(String Puño) {
        this.Puño = Puño;
    }

    public String getLargodePantalon() {
        return LargodePantalon;
    }

    public void setLargodePantalon(String LargodePantalon) {
        this.LargodePantalon = LargodePantalon;
    }

    public String getAltodeRodilla() {
        return AltodeRodilla;
    }

    public void setAltodeRodilla(String AltodeRodilla) {
        this.AltodeRodilla = AltodeRodilla;
    }

    public String getAnchodeRodilla() {
        return AnchodeRodilla;
    }

    public void setAnchodeRodilla(String AnchodeRodilla) {
        this.AnchodeRodilla = AnchodeRodilla;
    }

    public String getAnchodepierna() {
        return Anchodepierna;
    }

    public void setAnchodepierna(String Anchodepierna) {
        this.Anchodepierna = Anchodepierna;
    }

    public String getLargodeFalda() {
        return LargodeFalda;
    }

    public void setLargodeFalda(String LargodeFalda) {
        this.LargodeFalda = LargodeFalda;
    }

    public Persona getPersonas() {
        return personas;
    }

    public void setPersonas(Persona personas) {
        this.personas = personas;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);

    }
}
