package com.company;
public abstract class ProyectoAbs {
    private String titulo;
    private String resumen;
    private float duracion;
    private Presupuesto presupuesto;
    private boolean estado;

    public ProyectoAbs(String titulo, String resumen, float duracion, Presupuesto presupuesto, boolean estado) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.duracion = duracion;
        this.presupuesto = presupuesto;
        this.estado = estado;
    }

    public void getPresupuesto(){
        System.out.println("El total del presupuesto es "+presupuesto.total());
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

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
