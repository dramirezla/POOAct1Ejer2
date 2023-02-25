/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerc2;

/**
 *
 * @author David R.L
 */
import java.util.*;
public class Ejerc2 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int suma=entrada.nextInt();
        int x=20;
        suma=suma+x;
        int y=40;
        x=x+(y*y);
        suma=suma+(x/y);
        System.out.println("El valor de la suma es: "+suma);
    }
}
