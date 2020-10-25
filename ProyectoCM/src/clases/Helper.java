/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wdavid
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }

    public static void habilitarBotonoes(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotonoes(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }
    }

    public static int[][] pasoDeDatos(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        int m[][] = new int[nf][nc];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                m[i][j] = (int) tabla1.getValueAt(i, j);
            }

        }
        return m;

    }

    public static ArrayList traerDatos(String ruta) {
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList personas = new ArrayList();
        Object p;

        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while ((p = entrada.readObject()) != null) {
                personas.add(p);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return personas;
    }

    public static void volcado(ObjectOutputStream salida, ArrayList personas) {
        for (int i = 0; i < personas.size(); i++) {
            try {
                salida.writeObject(personas.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void llenarTabla(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Persona> personas = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = personas.size();
        tm.setRowCount(nf);

        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(personas.get(i).getNombre(), i, 1);
            tabla.setValueAt(personas.get(i).getApellidos(), i, 2);
            tabla.setValueAt(personas.get(i).getDireccion(), i, 3);
            tabla.setValueAt(personas.get(i).getCelular(), i, 4);
            tabla.setValueAt(personas.get(i).getTelefono(), i, 5);
            tabla.setValueAt(personas.get(i).getSexo(), i, 6);
        }
    }

    public static void llenarTablaAlquiler(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Alquiler> alquiler = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = alquiler.size();
        tm.setRowCount(nf);

        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(alquiler.get(i).getPersonas().getNombre(), i, 1);
            tabla.setValueAt(alquiler.get(i).getTogas().getColor(), i, 2);
            tabla.setValueAt(alquiler.get(i).getValor(), i, 3);
            tabla.setValueAt(alquiler.get(i).getDeposito(), i, 4);
            tabla.setValueAt(alquiler.get(i).getFechadealquiler(), i, 6);
            tabla.setValueAt(alquiler.get(i).getFechadeentrega(), i, 5);
        }
    }

    public static void llenarTablaUniformes(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Uniformes> uniformes = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = uniformes.size();
        tm.setRowCount(nf);

        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(uniformes.get(i).getNombredecolegio(), i, 1);
            tabla.setValueAt(uniformes.get(i).getDireccion(), i, 2);
            tabla.setValueAt(uniformes.get(i).getTelefono(), i, 3);
            tabla.setValueAt(uniformes.get(i).getCuello(), i, 4);
            tabla.setValueAt(uniformes.get(i).getBordado(), i, 5);
            tabla.setValueAt(uniformes.get(i).getTipo(), i, 6);
            tabla.setValueAt(uniformes.get(i).getSexo(), i, 7);
            tabla.setValueAt(uniformes.get(i).getEstanpado(), i, 8);
            tabla.setValueAt(uniformes.get(i).getEscudo(), i, 9);
            tabla.setValueAt(uniformes.get(i).getPuños(), i, 10);
        }
    }

    public static void llenarTablaTogas(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<Toga> togas = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = togas.size();
        tm.setRowCount(nf);

        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(togas.get(i).getColor(), i, 1);
            tabla.setValueAt(togas.get(i).getBufanda(), i, 2);
            tabla.setValueAt(togas.get(i).getCantBufanda(), i, 3);
            tabla.setValueAt(togas.get(i).getBirete(), i, 4);
            tabla.setValueAt(togas.get(i).getCantBirete(), i, 5);
            tabla.setValueAt(togas.get(i).getCamisa(), i, 6);
            tabla.setValueAt(togas.get(i).getCantCamisa(), i, 7);
        }
    }

    public static void llenarTablaMujeres(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<MedidasdeMujer> Medidasdemujer = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = Medidasdemujer.size();
        tm.setRowCount(nf);

        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);

            tabla.setValueAt(Medidasdemujer.get(i).getEspalda(), i, 2);
            tabla.setValueAt(Medidasdemujer.get(i).getTalleTrasero(), i, 3);
            tabla.setValueAt(Medidasdemujer.get(i).getTalleDelantero(), i, 4);
            tabla.setValueAt(Medidasdemujer.get(i).getBusto(), i, 5);
            tabla.setValueAt(Medidasdemujer.get(i).getCintura(), i, 6);
            tabla.setValueAt(Medidasdemujer.get(i).getCadera(), i, 7);
            tabla.setValueAt(Medidasdemujer.get(i).getLargodePantalon(), i, 8);
            tabla.setValueAt(Medidasdemujer.get(i).getAltodeRodilla(), i, 9);
            tabla.setValueAt(Medidasdemujer.get(i).getAnchodeRodilla(), i, 10);
            tabla.setValueAt(Medidasdemujer.get(i).getAnchodepierna(), i, 11);
            tabla.setValueAt(Medidasdemujer.get(i).getAltodePinza(), i, 12);
            tabla.setValueAt(Medidasdemujer.get(i).getSeparaciondePinza(), i, 13);
            tabla.setValueAt(Medidasdemujer.get(i).getLargodeManga(), i, 14);
            tabla.setValueAt(Medidasdemujer.get(i).getPuño(), i, 15);
            tabla.setValueAt(Medidasdemujer.get(i).getLargodeFalda(), i, 16);
            tabla.setValueAt(Medidasdemujer.get(i).getPersonas().getNombre(), i, 1);

        }
    }

    public static void llenarTablaHombre(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        ArrayList<MedidasdeHombre> Medidasdehombre = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = Medidasdehombre.size();
        tm.setRowCount(nf);

        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);

            tabla.setValueAt(Medidasdehombre.get(i).getTalleDelantero(), i, 2);
            tabla.setValueAt(Medidasdehombre.get(i).getTalleTrasero(), i, 3);
            tabla.setValueAt(Medidasdehombre.get(i).getPecho(), i, 4);
            tabla.setValueAt(Medidasdehombre.get(i).getCintura(), i, 5);
            tabla.setValueAt(Medidasdehombre.get(i).getBase(), i, 6);
            tabla.setValueAt(Medidasdehombre.get(i).getEspalda(), i, 7);
            tabla.setValueAt(Medidasdehombre.get(i).getLargodeManga(), i, 8);
            tabla.setValueAt(Medidasdehombre.get(i).getPuño(), i, 9);
            tabla.setValueAt(Medidasdehombre.get(i).getLargodePantalon(), i, 10);
            tabla.setValueAt(Medidasdehombre.get(i).getAltodeRodilla(), i, 11);
            tabla.setValueAt(Medidasdehombre.get(i).getAnchodeRodilla(), i, 12);
            tabla.setValueAt(Medidasdehombre.get(i).getAnchodepierna(), i, 13);
            tabla.setValueAt(Medidasdehombre.get(i).getContoronodeCuello(), i, 14);
            tabla.setValueAt(Medidasdehombre.get(i).getLargodeCamisa(), i, 15);
            tabla.setValueAt(Medidasdehombre.get(i).getPersonas().getNombre(), i, 1);

        }
    }

    public static ArrayList<Persona> modificarPersona(String ruta, String nombre, String telefono, String apellido, String sexo, String direccion, String celular) {
        ArrayList<Persona> personas = traerDatos(ruta);
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getCelular().equals(celular)) {
                personas.get(i).setNombre(nombre);
                personas.get(i).setApellidos(apellido);
                personas.get(i).setSexo(sexo);
                personas.get(i).setDireccion(direccion);
                personas.get(i).setTelefono(telefono);
                return personas;
            }

        }
        return null;
    }

    public static ArrayList<Persona> modificarCliente(String ruta, String nombre, String telefono, String apellido, String sexo, String direccion, String celular) {
        ArrayList<Persona> personas = traerDatos(ruta);
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getCelular().equals(celular)) {
                personas.get(i).setNombre(nombre);
                personas.get(i).setApellidos(apellido);
                personas.get(i).setSexo(sexo);
                personas.get(i).setDireccion(direccion);
                personas.get(i).setTelefono(telefono);
                return personas;
            }

        }
        return null;
    }

    public static boolean buscarPersonaCelular(String celular, String ruta) {
        ArrayList<Persona> personas = traerDatos(ruta);
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getCelular().equals(celular)) {
                return true;
            }
        }
        return false;
    }

    public static Persona traerPersonaCelular(String celular, String ruta) {
        ArrayList<Persona> personas = traerDatos(ruta);
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getCelular().equals(celular)) {
                return personas.get(i);
            }

        }
        return null;
    }

    public static ArrayList<Uniformes> modificarUniforme(String ruta, String nomcole, String telefono, String cuello, String sexo, String direccion, String espa, String borda, String tipo, String escu, String pu) {
        ArrayList<Uniformes> uniforme = traerDatos(ruta);
        for (int i = 0; i < uniforme.size(); i++) {
            if (uniforme.get(i).getNombredecolegio().equals(nomcole)) {
                uniforme.get(i).setBordado(borda);
                uniforme.get(i).setCuello(cuello);
                uniforme.get(i).setSexo(sexo);
                uniforme.get(i).setDireccion(direccion);
                uniforme.get(i).setTelefono(telefono);
                uniforme.get(i).setEscudo(escu);
                uniforme.get(i).setEstanpado(espa);
                uniforme.get(i).setPuños(pu);
                uniforme.get(i).setTipo(tipo);
                return uniforme;
            }

        }
        return null;
    }

    public static boolean buscarUniforme(String nomcole, String ruta) {
        ArrayList<Uniformes> uniforme = traerDatos(ruta);
        for (int i = 0; i < uniforme.size(); i++) {
            if (uniforme.get(i).getNombredecolegio().equals(nomcole)) {
                return true;
            }
        }
        return false;
    }

    public static Uniformes traerUniforme(String nomcole, String ruta) {
        ArrayList<Uniformes> uniforme = traerDatos(ruta);
        for (int i = 0; i < uniforme.size(); i++) {
            if (uniforme.get(i).getNombredecolegio().equals(nomcole)) {
                return uniforme.get(i);
            }

        }
        return null;
    }

    public static ArrayList<Toga> modificarToga(String ruta, String color, String biretes, String bufanda, String camisa, String cantcamisa, String cantbufandas, String cantbiretes) {
        ArrayList<Toga> togas = traerDatos(ruta);
        for (int i = 0; i < togas.size(); i++) {
            if (togas.get(i).getColor().equals(color)) {
                togas.get(i).setBirete(biretes);
                togas.get(i).setBufanda(bufanda);
                togas.get(i).setCamisa(camisa);
                togas.get(i).setCantCamisa(cantcamisa);
                togas.get(i).setCantBufanda(cantbufandas);
                togas.get(i).setCantBirete(cantbiretes);
                return togas;
            }

        }
        return null;
    }

    public static boolean buscarToga(String color, String ruta) {
        ArrayList<Toga> togas = traerDatos(ruta);
        for (int i = 0; i < togas.size(); i++) {
            if (togas.get(i).getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public static Toga traerToga(String color, String ruta) {
        ArrayList<Toga> togas = traerDatos(ruta);
        for (int i = 0; i < togas.size(); i++) {
            if (togas.get(i).getColor().equals(color)) {
                return togas.get(i);
            }

        }
        return null;
    }

    public static ArrayList<MedidasdeHombre> modificarMedidasdeHombre(String ruta, String talletra, String talledela, String pecho, String altorodi, String anchopier, String espalda, String anchoderodi, String cintura, String base, String largodepanta,
            String largodemanga, String puno, String largodecamisa, String contorcuello) {
        ArrayList<MedidasdeHombre> mh = traerDatos(ruta);
        for (int i = 0; i < mh.size(); i++) {
            if (mh.get(i).getEspalda().equals(espalda)) {
                mh.get(i).setTalleDelantero(talledela);
                mh.get(i).setTalleTrasero(talletra);
                mh.get(i).setPecho(pecho);
                mh.get(i).setCintura(altorodi);
                mh.get(i).setBase(anchopier);
                mh.get(i).setLargodeManga(largodemanga);
                mh.get(i).setPuño(puno);
                mh.get(i).setLargodePantalon(largodepanta);
                mh.get(i).setAltodeRodilla(altorodi);
                mh.get(i).setAnchodeRodilla(anchoderodi);
                mh.get(i).setAnchodepierna(anchopier);
                mh.get(i).setContoronodeCuello(contorcuello);
                mh.get(i).setLargodeCamisa(largodecamisa);
                return mh;
            }

        }
        return null;
    }

    public static boolean buscarMedidasdeHombre(String espalda, String ruta) {
        ArrayList<MedidasdeHombre> mh = traerDatos(ruta);
        for (int i = 0; i < mh.size(); i++) {
            if (mh.get(i).getEspalda().equals(espalda)) {
                return true;
            }
        }
        return false;
    }

    public static MedidasdeHombre traerMedidasdeHombre(String espalda, String ruta) {
        ArrayList<MedidasdeHombre> mh = traerDatos(ruta);
        for (int i = 0; i < mh.size(); i++) {
            if (mh.get(i).getEspalda().equals(espalda)) {
                return mh.get(i);
            }

        }
        return null;
    }

    public static ArrayList<MedidasdeMujer> modificarMedidasdeMujer(String ruta, String talletra, String talledela, String busto, String altorodi, String anchopier, String espalda, String altodepinza, String separaciondepin, String anchoderodi, String cintura, String cadera, String largodepanta,
            String largodemanga, String puno, String largodefalda) {
        ArrayList<MedidasdeMujer> mj = traerDatos(ruta);
        for (int i = 0; i < mj.size(); i++) {
            if (mj.get(i).getEspalda().equals(espalda)) {
                mj.get(i).setTalleDelantero(talledela);
                mj.get(i).setTalleTrasero(talletra);
                mj.get(i).setBusto(busto);
                mj.get(i).setCintura(altorodi);
                mj.get(i).setCadera(anchopier);
                mj.get(i).setLargodeManga(largodemanga);
                mj.get(i).setPuño(puno);
                mj.get(i).setLargodePantalon(largodepanta);
                mj.get(i).setAltodeRodilla(altorodi);
                mj.get(i).setAnchodeRodilla(anchoderodi);
                mj.get(i).setAnchodepierna(anchopier);
                mj.get(i).setLargodeFalda(largodefalda);
                mj.get(i).setAltodePinza(altodepinza);
                mj.get(i).setSeparaciondePinza(separaciondepin);
                return mj;
            }

        }
        return null;
    }

    public static boolean buscarMedidasdeMujer(String espalda, String ruta) {
        ArrayList<MedidasdeMujer> mj = traerDatos(ruta);
        for (int i = 0; i < mj.size(); i++) {
            if (mj.get(i).getEspalda().equals(espalda)) {
                return true;
            }
        }
        return false;
    }

    public static MedidasdeMujer traerMedidasdeMujer(String espalda, String ruta) {
        ArrayList<MedidasdeMujer> mj = traerDatos(ruta);
        for (int i = 0; i < mj.size(); i++) {
            if (mj.get(i).getEspalda().equals(espalda)) {
                return mj.get(i);
            }

        }
        return null;
    }

    public static void Precio(int color, String tipo, int metro, String sexo, int talla, int hilo, int boton, int moda, int corredera) {
        int aux = 0, precio = 0;
        color = 500;

    }

    public static void llenarComboPersonas(JComboBox combo, String ruta) {
        ArrayList<Persona> personas = traerDatos(ruta);
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) combo.getModel();
        dcbm.removeAllElements();
        Persona p;
        for (int i = 0; i < personas.size(); i++) {
            p = personas.get(i);
            dcbm.addElement(p.getCelular() + " - " + p.getNombre() + "  " + p.getApellidos() + " - " + p.getDireccion() + " - " + p.getSexo() + " - " + p.getTelefono());
        }
    }

    public static void llenarComboPersonasFemenino(JComboBox combo, String ruta) {
        ArrayList<Persona> personas = traerDatos(ruta);
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) combo.getModel();
        dcbm.removeAllElements();
        Persona p;
        for (int i = 0; i < personas.size(); i++) {
            if ("Femenino".equals(personas.get(i).getSexo())) {
                p = personas.get(i);
                dcbm.addElement(p.getCelular() + " - " + p.getNombre() + "  " + p.getApellidos() + " - " + p.getDireccion() + " - " + p.getSexo() + " - " + p.getTelefono());
            }
        }

    }

    public static void llenarComboPersonasMasculino(JComboBox combo, String ruta) {
        ArrayList<Persona> personas = traerDatos(ruta);
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) combo.getModel();
        dcbm.removeAllElements();
        Persona p;
        for (int i = 0; i < personas.size(); i++) {
            if ("Masculino".equals(personas.get(i).getSexo())) {
                p = personas.get(i);
                dcbm.addElement(p.getCelular() + " - " + p.getNombre() + "  " + p.getApellidos() + " - " + p.getDireccion() + " - " + p.getSexo() + " - " + p.getTelefono());
            }
        }

    }

    public static void llenarcomboFiltralTogas(JComboBox combo, String ruta) {
        ArrayList<Toga> togas = traerDatos(ruta);
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) combo.getModel();
        dcbm.removeAllElements();
        dcbm.removeAllElements();
        Toga t;
        for (int i = 0; i < togas.size(); i++) {
            if (!"nn".equals(togas.get(i).getCantBirete()) && !"nn".equals(togas.get(i).getCantBufanda()) && !"nn".equals(togas.get(i).getCantCamisa())) {
                t = togas.get(i);
                dcbm.addElement(t.getColor() + " - " + " Hay:" + t.getCantBirete() + " Biretes" + " - " + " Hay: " + t.getCantBufanda() + " Bufandas" + " - " + " Hay:" + t.getCantCamisa() + " Camisas");

            }
        }
    }

    public static void llenarComboClientes(JComboBox combo, String ruta) {
        ArrayList<Persona> personas = traerDatos(ruta);
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) combo.getModel();
        dcbm.removeAllElements();
        Persona p;
        for (int i = 0; i < personas.size(); i++) {
            p = personas.get(i);
            dcbm.addElement(p.getCelular() + " - " + p.getNombre() + "  " + p.getApellidos() + " - " + p.getDireccion() + " - " + p.getSexo() + " - " + p.getTelefono());
        }
    }

    public static ArrayList<Alquiler> modificarAlquiler(String ruta, int valor, String fechadentrega, String fechadealquiler, int deposito) {
        ArrayList<Alquiler> alquiler = traerDatos(ruta);
        for (int i = 0; i < alquiler.size(); i++) {
            if (alquiler.get(i).getFechadeentrega().equals(fechadentrega)) {
                alquiler.get(i).setFechadealquiler(fechadealquiler);
                alquiler.get(i).setDeposito(deposito);
                alquiler.get(i).setPersonas(null);
                alquiler.get(i).setValor(valor);
                alquiler.get(i).setTogas(null);
                return alquiler;
            }

        }
        return null;
    }

    public static boolean buscarAlquiler(String x, String ruta) {
        ArrayList<Alquiler> alquiler = traerDatos(ruta);
        for (int i = 0; i < alquiler.size(); i++) {
            if (alquiler.get(i).getFechadeentrega().equals(x)) {
                return true;
            }
        }
        return false;
    }

    public static Alquiler traerAlquiler(String x, String ruta) {
        ArrayList<Alquiler> alquiler = traerDatos(ruta);
        for (int i = 0; i < alquiler.size(); i++) {
            if (alquiler.get(i).getFechadeentrega().equals(x)) {
                return alquiler.get(i);
            }

        }
        return null;
    }

    public static void cantDePersonas(String ruta) {
        ArrayList<Persona> personas = traerDatos(ruta);
        for (int i = 0; i < personas.size(); i++) {

        }
    }

}
