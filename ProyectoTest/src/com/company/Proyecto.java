package com.company;

import java.util.ArrayList;

public class Proyecto {
    private Presupuesto presupuesto;
    private String titulo; //listo
    private String resumen; //listo
    private double duracion; //listo
    private int estado;
    private int tipoProyecto; //listo
    private ArrayList<Integrante> equipo; //listo
    private Integrante director; // listo
    private String motivo;

    public Proyecto(Presupuesto presupuesto, String titulo, String resumen, double duracion, int estado, int tipoProyecto, ArrayList<Integrante> equipo, Integrante director, String motivo) {
        this.presupuesto = presupuesto;
        this.titulo = titulo;
        this.resumen = resumen;
        this.duracion = duracion;
        this.estado = estado;
        this.tipoProyecto = tipoProyecto;
        this.equipo = equipo;
        this.director = director;
        this.motivo = motivo;
    }


    public Proyecto() {

    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getTipoProyecto() {
        return tipoProyecto;
    }

    public void setTipoProyecto(int tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
    }

    public ArrayList<Integrante> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Integrante> equipo) {
        this.equipo = equipo;
    }

    public Integrante getDirector() {
        return director;
    }

    public void setDirector(Integrante director) {
        this.director = director;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
