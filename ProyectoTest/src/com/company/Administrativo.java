package com.company;
public class Administrativo extends Integrante {
    public Administrativo(String rut, String nombre) {
        super(rut, nombre,44, 0, 5);
    }

    @Override
    public void reducH(double horas) {

    }
}
