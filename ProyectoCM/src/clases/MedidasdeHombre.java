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
public class MedidasdeHombre implements java.io.Serializable {

    private String TalleDelantero;
    private String TalleTrasero;
    private String Pecho;
    private String Cintura;
    private String Base;
    private String Espalda;
    private String LargodeManga;
    private String Puño;
    private String LargodePantalon;
    private String AltodeRodilla;
    private String AnchodeRodilla;
    private String Anchodepierna;
    private String ContoronodeCuello;
    private String LargodeCamisa;
    private Persona personas;

    public MedidasdeHombre(String talletra, String talledela, String pecho, String altorodi, String anchopier, String espalda, String anchoderodi, String cintura, String base, String largodepanta, String largodemanga, String puno, String largodecamisa, String contorcuello, Persona personas) {
        
        this.TalleDelantero = talledela;
        this.TalleTrasero = talletra;
        this.Pecho = pecho;
        this.Cintura = cintura;
        this.Base = base;
        this.Espalda = espalda;
        this.LargodeManga = largodemanga;
        this.Puño = puno;
        this.LargodePantalon = largodepanta;
        this.AltodeRodilla = altorodi;
        this.AnchodeRodilla = anchoderodi;
        this.Anchodepierna = anchopier;
        this.ContoronodeCuello = contorcuello;
        this.LargodeCamisa = largodecamisa;
        this.personas = personas;
        //
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

    public String getPecho() {
        return Pecho;
    }

    public void setPecho(String Pecho) {
        this.Pecho = Pecho;
    }

    public String getCintura() {
        return Cintura;
    }

    public void setCintura(String Cintura) {
        this.Cintura = Cintura;
    }

    public String getBase() {
        return Base;
    }

    public void setBase(String Base) {
        this.Base = Base;
    }

    public String getEspalda() {
        return Espalda;
    }

    public void setEspalda(String Espalda) {
        this.Espalda = Espalda;
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

    public String getContoronodeCuello() {
        return ContoronodeCuello;
    }

    public void setContoronodeCuello(String ContoronodeCuello) {
        this.ContoronodeCuello = ContoronodeCuello;
    }

    public String getLargodeCamisa() {
        return LargodeCamisa;
    }

    public void setLargodeCamisa(String LargodeCamisa) {
        this.LargodeCamisa = LargodeCamisa;
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
