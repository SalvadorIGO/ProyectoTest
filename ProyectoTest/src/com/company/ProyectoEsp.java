package com.company;

import java.util.ArrayList;

public class ProyectoEsp extends Proyecto {
    private boolean autorizacionR;

    public ProyectoEsp(Presupuesto presupuesto, String titulo, String resumen, double duracion, int estado, int tipoProyecto, ArrayList<Integrante> equipo, Integrante director, String motivo) {
        super(presupuesto, titulo, resumen, duracion, estado, tipoProyecto, equipo, director, motivo);
    }

    public boolean isAutorizacionR() {
        return autorizacionR;
    }

    public void setAutorizacionR(boolean autorizacionR) {
        this.autorizacionR = autorizacionR;
    }
}
