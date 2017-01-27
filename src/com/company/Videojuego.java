package com.company;

public class Videojuego {
    private long id;
    private String nombre;
    private int precio;
    private String empresa;
    private int lanzamiento;
    private int ventas;
    private String genero;
    private int pegi;
    private int jugadores;
    private String plataforma;

    public Videojuego(long id, String nombre, int precio, String empresa, int lanzamiento, int ventas, String genero, int pegi, int jugadores, String plataforma) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.empresa = empresa;
        this.lanzamiento = lanzamiento;
        this.ventas = ventas;
        this.genero = genero;
        this.pegi = pegi;
        this.jugadores = jugadores;
        this.plataforma = plataforma;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", empresa='" + empresa + '\'' +
                ", lanzamiento=" + lanzamiento +
                ", ventas=" + ventas +
                ", genero='" + genero + '\'' +
                ", pegi=" + pegi +
                ", jugadores=" + jugadores +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
