/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author wpadilla4
 */
public class Test {
    public static void main(String[] args) {
        int[][] m = new int[5][5];
        m[0][0]=3;
        m[0][1]=4;
        m[0][2]=5;
        m[0][3]=6;
        m[0][4]=7;
        m[1][0]=7;
        m[1][1]=8;
        m[1][2]=9;
        m[1][3]=2;
        m[1][4]=9;
        m[2][0]=2;
        m[2][1]=3;
        m[2][2]=1;
        m[2][3]=3;
        m[2][4]=1;
        m[3][0]=0;
        m[3][1]=2;
        m[3][2]=9;
        m[3][3]=1;
        m[3][4]=4;
        m[4][0]=0;
        m[4][1]=2;
        m[4][2]=6;
        m[4][3]=5;
        m[4][4]=0;
        
        System.out.println(Helper.mostrar(m));
        System.out.println("Recorrido");
        //System.out.println(Helper.recorrido3(m));
    
    }
}
