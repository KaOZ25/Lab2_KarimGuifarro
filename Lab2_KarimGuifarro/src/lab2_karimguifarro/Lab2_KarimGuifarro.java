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
                    if (usuario == "" && contraseña == "") {
                        op = 1;
                        break;
                    }
                    System.out.print("1)Reporte 1\n"
                            + "2)Reporte 2 \n"
                            + "3)Reporte 3\n");
                    int p = KaOz.nextInt();
                    switch (p) {
                        case 1: {

                        }
                    }

                }
                break;
                case 3: {
                    if (usuario == "" && contraseña == "") {
                        op = 1;
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
                            String Franquicia, nombre, ubicacion, gerente = "", especialidad, estado = "", tipo = "";
                            String area_juegos="", parqueo="";
                            int cant_empleados = 0, cant_cajeros = 0, cant_mesas = 0, espac = 0;
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
                            area_juegos = KaOz.next();
                            area_juegos.toLowerCase();
                            System.out.println("Posee Parqueo?[Si/No]");
                            parqueo = KaOz.next();
                            parqueo.toLowerCase();
                            if (parqueo.contains("si")) {
                                System.out.println("Ingrese la cantidad del parqueo");
                                espac = KaOz.nextInt();
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
                            if (estado == "Demolicion" || estado == "Remodelacion") {
                                especialidad = "[N/A]";
                                gerente = "[N/A]";
                                cant_mesas = 0;
                            } else if (estado.contains("Funcional")) {
                                System.out.println("Ingrese el nombre del gerente");
                                KaOz.nextLine();
                                gerente = KaOz.next();
                            }
                            if (area_juegos == "si" && parqueo == "si" && espac > 30) {
                                tipo = "premium";
                            } else {
                                tipo = "estandar";
                            }
                            restaurant.add(new Restaurantes(Franquicia, nombre, ubicacion, cant_empleados, area_juegos, parqueo, cant_mesas, cant_cajeros, gerente, especialidad, estado, tipo));
                        }
                        break;
                        case 2: {
                            Print(restaurant);
                        }
                        break;
                        case 3: {
                            Print(restaurant);
                            System.out.println("Que desea modificar:");
                            int mod = KaOz.nextInt();
                            while (mod < 0 || mod > restaurant.size()) {
                                System.out.println("No existe este detective");
                                Print(restaurant);
                                System.out.println("Igrese de nuevo el valor:");
                            }
                            String Franquicia, nombre, ubicacion, gerente = "", especialidad, estado = null, tipo = "";
                            String area_juegos = "", parqueo = "";
                            int cant_empleados = 0, cant_cajeros = 0, cant_mesas = 0, espac = 0;
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
                            area_juegos = KaOz.next();
                            area_juegos.toLowerCase();
                            while(!area_juegos.equals("si")|| !area_juegos.equals("no")){
                                 System.out.println("Ha ingesado un respuesta erronea, intente de nuevo:");
                                 area_juegos=KaOz.next();
                                 area_juegos.toLowerCase();
                             }
                            System.out.println("Posee Parqueo?[Si/No]");
                            parqueo = KaOz.next();
                            parqueo.toLowerCase();
                            while(parqueo!="si"|| parqueo!="no"){
                                 System.out.println("Ha ingesado un respuesta erronea, intente de nuevo:");
                                 parqueo=KaOz.next();
                                 parqueo.toLowerCase();
                             }
                            if (parqueo == "si") {
                                System.out.println("Ingrese la cantidad del parqueo");
                                espac = KaOz.nextInt();
                            } else if (parqueo == "no") {
                                System.out.println(parqueo);
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
                            KaOz.nextLine();
                             estado = KaOz.next();
                             estado.toLowerCase();
                            if (estado=="demolicion"|| estado=="remodelacion") {
                                especialidad = "[N/A]";
                                gerente = "[N/A]";
                                cant_mesas = 0;
                            } else if (estado=="funcional") {
                                System.out.println("Ingrese el nombre del gerente");
                                gerente = KaOz.next();
                            }
                            if ("si".equals(area_juegos) && "si".equals(parqueo) && espac > 30) {
                                tipo = "premium";
                            } else {
                                tipo = "estandar";
                            }
                            restaurant.get(mod).setFranquicia(Franquicia);
                            restaurant.get(mod).setNombre(nombre);
                            restaurant.get(mod).setUbicacion(ubicacion);
                            restaurant.get(mod).setCant_empleados(cant_empleados);
                            restaurant.get(mod).setParqueo(parqueo);
                            restaurant.get(mod).setCant_mesas(cant_mesas);
                            restaurant.get(mod).setCant_cajeros(cant_cajeros);
                            restaurant.get(mod).setGerente(gerente);
                            restaurant.get(mod).setEspecialidad(especialidad);
                            restaurant.get(mod).setEstado(estado);
                            restaurant.get(mod).setTipo(tipo);
                        }
                        break;
                        case 4: {
                            Print(restaurant);
                            System.out.println("Que desea modificar:");
                            int mod = KaOz.nextInt();
                            while (mod < 0 || mod > restaurant.size()) {
                                System.out.println("No existe este detective");
                                Print(restaurant);
                                System.out.println("Igrese de nuevo el valor:");
                            }
                            restaurant.remove(mod);
                        }
                        break;
                    }
                }
                break;
                case 4: {
                    k = 'b';
                }
                default:
                    System.out.println("Ingreso un valor erroneo");
            }
        }
    }

    static void Print(ArrayList restaurant) {
        for (int i = 0; i < restaurant.size(); i++) {
            System.out.println("[" + restaurant.get(i) + "]");
        }
    }

    static void Printdemo(ArrayList restaurant) {
        System.out.println("Que estado dese ver?");
        String est = KaOz.next();
        for (int i = 0; i < restaurant.size(); i++) {
            if (restaurant.get(i).equals(est)) {
                System.out.println("[" + restaurant.get(i) + "]");
            } else {
            }
        }
    }

}
