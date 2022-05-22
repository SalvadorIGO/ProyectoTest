package com.company;
public class Estudiante extends Integrante {

    public Estudiante(String rut, String nombre) {
        super(rut, nombre, 44,0,3);
    }

    public void setPracticante(){
        this.setTipoIntegrante(4);
        this.setDedicacionMax(44);
        this.setDedicacionMin(22);
    }

    @Override
    public void reducH(double horas) {

    }


}
