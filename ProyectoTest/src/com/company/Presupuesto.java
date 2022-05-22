package com.company;
public class Presupuesto {
    private double operacional;
    private double equipamiento;
    private double remuneracionT;
    private double conferencia;
    private double viaticos;
    private double viaje;

    public Presupuesto(double operacional, double equipamiento, double remuneracionT, double conferencia, double viaticos, double viaje) {
        this.operacional = operacional;
        this.equipamiento = equipamiento;
        this.remuneracionT = remuneracionT;
        this.conferencia = conferencia;
        this.viaticos = viaticos;
        this.viaje = viaje;
    }

    public Presupuesto() {

    }

    public double getOperacional() {
        return operacional;
    }

    public void setOperacional(double operacional) {
        this.operacional = operacional;
    }

    public double getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(double equipamiento) {
        this.equipamiento = equipamiento;
    }

    public double getRemuneracionT() {
        return remuneracionT;
    }

    public void setRemuneracionT(double remuneracionT) {
        this.remuneracionT = remuneracionT;
    }

    public double getConferencia() {
        return conferencia;
    }

    public void setConferencia(double conferencia) {
        this.conferencia = conferencia;
    }

    public double getViaticos() {
        return viaticos;
    }

    public void setViaticos(double viaticos) {
        this.viaticos = viaticos;
    }

    public double getViaje() {
        return viaje;
    }

    public void setViaje(double viaje) {
        this.viaje = viaje;
    }
}
