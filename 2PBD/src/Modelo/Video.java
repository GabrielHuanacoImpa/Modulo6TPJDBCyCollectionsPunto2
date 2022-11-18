/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author GHI
 */
public class Video {
    private int id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private String tipo;
    private String formato;
    private double duracion;
    private double tamaño;
    private int cantLike;
    private int cantDislike;

    public Video() {
    }

    public Video(int id, String codigo, String nombre, String descripcion, String tipo, String formato, double duracion, double tamaño, int cantLike, int cantDislike) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.formato = formato;
        this.duracion = duracion;
        this.tamaño = tamaño;
        this.cantLike = cantLike;
        this.cantDislike = cantDislike;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getCantLike() {
        return cantLike;
    }

    public void setCantLike(int cantLike) {
        this.cantLike = cantLike;
    }

    public int getCantDislike() {
        return cantDislike;
    }

    public void setCantDislike(int cantDislike) {
        this.cantDislike = cantDislike;
    }

    @Override
    public String toString() {
        return "Video{" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tipo=" + tipo + ", formato=" + formato + ", duracion=" + duracion + ", tama\u00f1o=" + tamaño + ", cantLike=" + cantLike + ", cantDislike=" + cantDislike + '}';
    }
    
    
}
