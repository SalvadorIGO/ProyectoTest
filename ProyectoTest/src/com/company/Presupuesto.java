package com.company;
public class Presupuesto {
    float operacional;
    float equipamiento;
    float remuneracion;

    public Presupuesto(float operacional, float equipamiento, float remuneracion) {
        this.operacional = operacional;
        this.equipamiento = equipamiento;
        this.remuneracion = remuneracion;
    }

    public double total(){
        return (this.operacional+this.equipamiento+this.remuneracion);
    }

    public float getOperacional() {
        return operacional;
    }

    public void setOperacional(float operacional) {
        this.operacional = operacional;
    }

    public float getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(float equipamiento) {
        this.equipamiento = equipamiento;
    }

    public float getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(float remuneracion) {
        this.remuneracion = remuneracion;
    }
}
