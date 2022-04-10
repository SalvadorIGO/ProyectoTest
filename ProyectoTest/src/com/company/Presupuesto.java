package com.company;
public class Presupuesto {
    double operacional;
    double equipamiento;
    double remuneracion;

    public Presupuesto(double operacional, double equipamiento, double remuneracion) {
        this.operacional = operacional;
        this.equipamiento = equipamiento;
        this.remuneracion = remuneracion;
    }

    public double total(){
        return (operacional+equipamiento+remuneracion);
    }

    public double getOperacional() {
        return operacional;
    }

    public void setOperacional(float operacional) {
        this.operacional = operacional;
    }

    public double getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(float equipamiento) {
        this.equipamiento = equipamiento;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(float remuneracion) {
        this.remuneracion = remuneracion;
    }
}
