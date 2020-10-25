/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WDavid
 */
public class Helper {
    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 0:
                JOptionPane.showMessageDialog(ventana, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
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

    public static int cantidadPares(JTable tabla1) {
        int nf, nc, aux, cont = 0;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (aux % 2 == 0) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static void pares(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (aux % 2 == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void letraC(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == nf - 1 || j == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void diagonalPrincipal(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void letraH(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1 || i == (nf - 1) / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

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
    public static String recorridoHaciaArriba(int[][] m, int j) {
        int nf = m.length;
        String aux = "";
        for (int i = nf - 1; i >= 0; i--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaArriba(int[][] m, int j, int in, int fin) {
        int nf = m.length;
        String aux = "";
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][j] + " ,";
        }
        return aux;
    }

    public static String recorridoHaciaAbajo(int[][] m, int j) {
        int nf = m.length;
        String aux = "";
        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][j] + " ,";
        }
        return aux;
    }
    public static String recorridoHaciaAbajo(int[][] m, int j, int in, int fin) {
      
        String aux = "";
        for (int i = in; i < fin; i++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoUno(JTable tabla1) {
        int[][] m = pasoDeDatos(tabla1);
        int nc = m[0].length;
        String aux = "";
        for (int j = 0; j < nc; j++) {
            if (j % 2 == 0) {
                aux = aux + Helper.recorridoHaciaArriba(m, j);
            } else {
                aux = aux + Helper.recorridoHaciaAbajo(m, j);
            }
        }
        aux = aux.substring(0, aux.length()-2)+".";
        return aux;
    }

    public static String recorridoHaciaDerecha(int[][] m, int i) {
        int nc = m[0].length;
        String aux = "";
        for (int j = 0; j <= nc; j++) {
            aux = aux + m[i][j] + " ,";
        }

        return aux;
    }
    public static String recorridoHaciaDerecha(int[][] m, int i , int in , int fin) {
        int nc = m[0].length;
        String aux = "";
        for (int j = in; j <= fin; j++) {
            aux = aux + m[i][j] + " ,";
        }

        return aux;
    }

    public static String recorridoHaciaIzquierda(int[][] m, int i) {
        int nc = m[0].length;
        String aux = "";
        for (int j = nc - 1; j >= 0; j--) {
            aux = aux + m[i][j] + " ,";
        }

        return aux;
    }
    public static String recorridoHaciaIzquierda(int[][] m, int i , int in , int fin) {
        int nc = m[0].length;
        String aux = "";
        for (int j = in; j >= fin; j--) {
            aux = aux + m[i][j] + " ,";
        }

        return aux;
    }
    public static String recorridoDiagonalPrincipalHaciaAbajo(int[][] m) {
        int nf = m.length;
        String aux = "";
        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][i] + " ,";
        }

        return aux;
    }
    public static String recorridoDiagonalPrincipalHaciaArriba(int[][] m) {
        int nf = m.length;
        String aux = "";
        for (int i = nf -1; i > 0; i--) {
            aux = aux + m[i][i] + " ,";
        }

        return aux;
    }
    public static String recorridoDiagonalSecundariaHaciaAbajo(int[][] m) {
        int nc = m[0].length;
        int nf = m.length;
        String aux = "";
        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][nc-1-i] + ", ";
        }

        return aux;
    }
    public static String recorridoDiagonalSecundariaHaciaArriba(int[][] m) {
        int nc = m[0].length;
        int nf = m.length;
        String aux = "";
        for (int i = nf -1; i >= 0; i--) {
            aux = aux + m[i][nc-1-i] + ", ";
        }

        return aux;
    }
     public static String recorridoDiagonalSecundariaHaciaArriba(int[][] m , int in , int fin) {
        int nc = m[0].length;
        int nf = m.length;
        String aux = "";
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][nc-1-i] + ", ";
        }

        return aux;
    }
    
    public static String recorridoDiagonalSecundariaHaciaAbajo(int[][] m , int in , int fin) {
        int nc = m[0].length;
        int nf = m.length;
        String aux = "";
        for (int i = in; i < fin; i++) {
            aux = aux + m[i][nc-1-i] + ", ";
        }

        return aux;
    }
    public static String recorridoDiagonalPrincipalHaciaArriba(int[][] m , int in , int fin) {
        int nf = m.length;
        String aux = "";
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][i] + " ,";
        }

        return aux;
    }
    public static String recorridoDiagonalPrincipalHaciaAbajo(int[][] m , int in ,int fin) {
        int nf = m.length;
        String aux = "";
        for (int i = in; i < fin; i++) {
            aux = aux + m[i][i] + " ,";
        }

        return aux;
    }

    public static String recorridoDos(JTable tabla1) {
        int[][] m = pasoDeDatos(tabla1);
        int nf = m.length;
        String aux = "";
        for (int i = 0; i < nf; i++) {
            if (i % 2 == 0) {
                aux = aux + Helper.recorridoHaciaIzquierda(m, i);
            } else {
                aux = aux + Helper.recorridoHaciaDerecha(m, i);
            }
        }
        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux;
    }

    public static String mostrar(int[][] m) {
        String aux = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                aux = aux + m[i][j] + "";
            }
            aux = aux + "\n";
        }
        return aux;
    }
    public static String recorrido3 (JTable tabla1){
        int [][]m = pasoDeDatos(tabla1);
        int nf = m.length;
        int nc = m[0].length;
        String aux = "";
        aux = aux + Helper.recorridoDiagonalPrincipalHaciaAbajo(m, 0, nf/2);
        aux = aux + Helper.recorridoDiagonalSecundariaHaciaAbajo(m , (nf/2 +1), nf -1);
        aux = aux + Helper.recorridoHaciaDerecha(m, nf-1, 1, nc-1);
        aux = aux + Helper.recorridoDiagonalPrincipalHaciaArriba(m, nf-2, nf/2);
        aux = aux + Helper.recorridoDiagonalSecundariaHaciaArriba(m, nf/2-1, 0);
        aux = aux + Helper.recorridoHaciaIzquierda(m, 0, nc -2, 0);
    
    
    return aux;
    }
}
