/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_karimguifarro;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Karim Ozael
 */
public class Lab2_KarimGuifarro {

    public static Scanner KaOz = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> ubicacion = new ArrayList();
        String usuario = "";
        String contraseña = "";
        char k = 'c';
        while (k == 'c') {
            System.out.print("*****Menu*****\n"
                    + "1) Login\n"
                    + "2) Reporte de Restaurantes\n"
                    + "3) Manejo de Restarantes\n"
                    + "4)Salida\n");
            int op = KaOz.nextInt();
            switch (op) {
                case 1:{
                    System.out.println("Ingrese el usuario:");
                    usuario=KaOz.next();
                    System.out.println("Ingrese la contraseña:");
                    contraseña=KaOz.next();
                }
                case 2:{
                    System.out.print("Reporte 1\n"
                            + "Reporte 2 \n"
                            + "Reporte 3\n");
                    int p=KaOz.nextInt();
                    
                }
            }
        }
    }

}
