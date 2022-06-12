package com.company;

import java.util.ArrayList;

public class Proyecto {
    private Presupuesto presupuesto = new Presupuesto();
    private String titulo; //listo
    private String resumen; //listo
    private double duracion; //listo
    private boolean estado; //listo
    private int tipoProyecto; //listo
    private ArrayList<Integrante> equipo = new ArrayList<>(); //listo
    private Integrante director; // listo
    private String motivo; //listo

    public Proyecto(Presupuesto presupuesto, String titulo, String resumen, double duracion, boolean estado, int tipoProyecto, ArrayList<Integrante> equipo, Integrante director, String motivo) {
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

    public Proyecto(Presupuesto p1, String testAprobado, String s, double v, boolean b, int i, ArrayList<Integrante> equipo) {
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(String presupuesto) {
        String[] temp = presupuesto.split("-");
        if(temp.length < 4){
            try {
                this.presupuesto.setOperacional(Double.parseDouble(temp[0]));
                this.presupuesto.setEquipamiento(Double.parseDouble(temp[1]));
                this.presupuesto.setRemuneracionT(Double.parseDouble(temp[2]));
            } catch (Exception p){
                System.out.println("Mal ingresado");
            }
        } else {
            try {
                this.presupuesto.setOperacional(Double.parseDouble(temp[0]));
                this.presupuesto.setEquipamiento(Double.parseDouble(temp[1]));
                this.presupuesto.setRemuneracionT(Double.parseDouble(temp[2]));
                this.presupuesto.setViaticos(Double.parseDouble(temp[3]));
                this.presupuesto.setViaje(Double.parseDouble(temp[4]));
                this.presupuesto.setConferencia(Double.parseDouble(temp[5]));
            } catch (Exception p){
                System.out.println("Mal ingresado");
            }
        }
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
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
