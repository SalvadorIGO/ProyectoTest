package com.company;
public class PresupuestoInves extends Presupuesto{
    double capacitacion;

    public PresupuestoInves(double operacional, double equipamiento, double remuneracion, double capacitacion) {
        super(operacional, equipamiento, remuneracion);
        this.capacitacion = capacitacion;
    }

    public double getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(double capacitacion) {
        this.capacitacion = capacitacion;
    }

    @Override
    public double total(){
        return (operacional+equipamiento+remuneracion+capacitacion);
    }
}
