package com.company;
public class Academico extends Integrante {
    public Academico(String rut, String nombre) {
        super(rut, nombre, 44, 11, 1);
    }

    public void mediaJornada(){
        setTipoIntegrante(2);
        setDedicacionMax(22);
        setDedicacionMin(5.5);
    }

    @Override
    public void reducH(double horas) {
    }
}
