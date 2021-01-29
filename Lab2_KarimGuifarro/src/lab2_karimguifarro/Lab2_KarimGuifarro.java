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
    public static Restaurantes r=new Restaurantes();
    public static ArrayList <Restaurantes> restaurant= new ArrayList();
    public static void main(String[] args) {
        ArrayList<String> ubicaciones = new ArrayList();
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
                case 1: {
                    System.out.println("Ingrese el usuario:");
                    usuario = KaOz.next();
                    System.out.println("Ingrese la contraseña:");
                    contraseña = KaOz.next();
                }
                break;
                case 2: {
                    System.out.print("1)Reporte 1\n"
                            + "2)Reporte 2 \n"
                            + "3)Reporte 3\n");
                    int p = KaOz.nextInt();

                }
                break;
                case 3: {
                    System.out.print("1)Crear\n"
                            + "2)Listar\n"
                            + "3)Modificar\n"
                            + "4)Eliminar\n"
                            + "5)Salir\n");
                    int po = KaOz.nextInt();
                    switch (po) {
                        case 1: {
                            String Franquicia, nombre, ubicacion, gerente, especialidad, estado="";
                            boolean area_juegos, parqueo;
                            int cant_empleados, cant_cajeros, cant_mesas;
                            System.out.println("Ingrese la Franquicia:");
                            Franquicia = KaOz.next();
                            System.out.println("Ingrese el nombre:");
                            nombre = KaOz.nextLine();
                            System.out.println("Ingrese la ubicacion:");
                            ubicacion = KaOz.next();
                            System.out.println("Cantidad de empleados:");
                            cant_empleados = KaOz.nextInt();
                            System.out.println("Posee Area de juegos?[Si/No]");
                            String dec = KaOz.next();
                            dec.toLowerCase();
                            if (dec == "si") {
                                area_juegos = true;
                            } else if (dec == "no") {
                                area_juegos = false;
                            }
                            System.out.println("Posee Parqueo?[Si/No]");
                            String de = KaOz.nextLine();
                            de.toLowerCase();
                            if (de == "si") {
                                parqueo = true;
                            } else if (de == "no") {
                                parqueo = false;
                            }
                            System.out.println("Cantidad de mesas:");
                            cant_mesas = KaOz.nextInt();
                            System.out.println("Cantidad de cajeros:");
                            cant_cajeros = KaOz.nextInt();
                            System.out.println("Ingrese su especialidad:");
                            especialidad = KaOz.next();
                            System.out.println("Ingrese el estado del restaurante:");
                            System.out.print("a)Si se encuentra en remodelacion\n"
                                    + "b)Si se demolera\n"
                                    + "c)Si se ecneuntra funcional\n");
                            String est = KaOz.next();
                            if (est == "a") {
                                estado = "Remodelacion";

                            } else if (est == "b") {
                                estado = "Demolicion";
                            } else if (est == "c") {
                                estado = "Funcional";
                            }
                            System.out.println("Ingrese el nombre del gerente");
                            gerente=KaOz.next();
                            if (estado.equals("Demolicion")) {
                                especialidad="[N/A]";
                                gerente="[N/A]";
                            }
                            
                        }
                        break;
                        case 2: {

                        }
                        break;
                        case 3: {

                        }
                        break;
                        case 4: {

                        }
                        break;

                    }
                }
            }
        }
    }

}
