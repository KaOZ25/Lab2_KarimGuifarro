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
    public static Restaurantes r = new Restaurantes();
    public static ArrayList<Restaurantes> restaurant = new ArrayList();

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
                    while (!usuario.equals("David")) {
                        System.out.println("Ingrese el usuario:");
                        usuario = KaOz.next();
                    }
                    System.out.println("Ingrese la contraseña:");
                    contraseña = KaOz.next();
                    while (!contraseña.equals("99")) {
                        System.out.println("Ingrese la contraseña:");
                        contraseña = KaOz.next();
                    }
                }
                break;
                case 2: {
                    if (usuario=="" && contraseña=="") {
                        op=1;
                        break;
                    }
                    System.out.print("1)Reporte 1\n"
                            + "2)Reporte 2 \n"
                            + "3)Reporte 3\n");
                    int p = KaOz.nextInt();

                }
                break;
                case 3: {
                     if (usuario=="" && contraseña=="") {
                        op=1;
                        break;
                    }
                    System.out.print("1)Crear\n"
                            + "2)Listar\n"
                            + "3)Modificar\n"
                            + "4)Eliminar\n"
                            + "5)Salir\n");
                    int po = KaOz.nextInt();
                    switch (po) {
                        case 1: {
                            String Franquicia, nombre, ubicacion, gerente, especialidad, estado = "", tipo="";
                            boolean area_juegos = false, parqueo = false;
                            int cant_empleados=0, cant_cajeros=0, cant_mesas=0,espac=0;
                            System.out.println("Ingrese la Franquicia:");
                            Franquicia = KaOz.next();
                            System.out.println("Ingrese el nombre:");
                            nombre = KaOz.next();
                            System.out.println("Ingrese la ubicacion:");
                             KaOz.nextLine();
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
                            String de = KaOz.next();
                            de.toLowerCase();
                            if (de == "si") {
                                parqueo = true;
                                System.out.println("Ingrese la cantidad del parqueo");
                                espac=KaOz.nextInt();
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
                             KaOz.nextLine();
                            gerente = KaOz.next();
                            if (estado.equals("Demolicion")) {
                                especialidad = "[N/A]";
                                gerente = "[N/A]";
                                cant_mesas = 0;
                            }
                            if (area_juegos==true && parqueo==true && espac>30) {
                                tipo="premium";
                            }else {
                                tipo="estandar";
                            }
                            restaurant.add(new Restaurantes(Franquicia, nombre, ubicacion, cant_empleados, area_juegos, parqueo, cant_mesas, cant_cajeros, gerente, especialidad, estado,tipo));
                        }
                        break;
                        case 2: {
                            Print(restaurant);
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
                case 4:{
                    k='b';
                }
            }
        }
    }

    static void Print(ArrayList restaurant) {
        for (int i = 0; i < restaurant.size(); i++) {
            System.out.println("[" + restaurant.get(i) + "]");

        }
    }

}
