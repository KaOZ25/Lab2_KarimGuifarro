/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class Restaurantes {
    private String Franquicia;
    private String nombre;
    private String ubicacion;
    private int cant_empleados;
    private String area_juegos;
    private String parqueo;
    private int cant_mesas;
    private int cant_cajeros;
    private String Gerente;
    private String especialidad;
    private String estado;
    private String tipo;

    public Restaurantes() {
    }

    public Restaurantes(String Franquicia, String nombre, String ubicacion, int cant_empleados, String area_juegos, String parqueo, int cant_mesas, int cant_cajeros, String Gerente, String especialidad, String estado, String tipo) {
        this.Franquicia = Franquicia;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cant_empleados = cant_empleados;
        this.area_juegos = area_juegos;
        this.parqueo = parqueo;
        this.cant_mesas = cant_mesas;
        this.cant_cajeros = cant_cajeros;
        this.Gerente = Gerente;
        this.especialidad = especialidad;
        this.estado = estado;
        this.tipo = tipo;
    }

    public String getFranquicia() {
        return Franquicia;
    }

    public void setFranquicia(String Franquicia) {
        this.Franquicia = Franquicia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCant_empleados() {
        return cant_empleados;
    }

    public void setCant_empleados(int cant_empleados) {
        this.cant_empleados = cant_empleados;
    }

    public String getArea_juegos() {
        return area_juegos;
    }

    public void setArea_juegos(String area_juegos) {
        this.area_juegos = area_juegos;
    }

    public String getParqueo() {
        return parqueo;
    }

    public void setParqueo(String parqueo) {
        this.parqueo = parqueo;
    }

    public int getCant_mesas() {
        return cant_mesas;
    }

    public void setCant_mesas(int cant_mesas) {
        this.cant_mesas = cant_mesas;
    }

    public int getCant_cajeros() {
        return cant_cajeros;
    }

    public void setCant_cajeros(int cant_cajeros) {
        this.cant_cajeros = cant_cajeros;
    }

    public String getGerente() {
        return Gerente;
    }

    public void setGerente(String Gerente) {
        this.Gerente = Gerente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
  

    @Override
    public String toString() {
        return "Restaurantes:" + Franquicia+ " "  + nombre+ " "  + ubicacion+ " " +  cant_empleados+ " " + area_juegos+" " + parqueo+ " " +  cant_mesas+ " " + cant_cajeros+ " " +  Gerente+ " " +  especialidad+ " " +  estado + " " + tipo ;
    }
    
}
