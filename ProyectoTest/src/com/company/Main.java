package com.company;

public class Main {



    public static void main(String[] args) {
        Sistema n1 = new Sistema();
        String[] ingreso = {"true", "Medios renovables y su impacto","aaaaaaaaaaa","4.5","40000.0-2888.8-4992.0","Academico1,21.091.242.8,Salvador-Estudiante2,32.345.134.6,Vicente","21.091.242.8"};

        n1.ingresoDeProyecto(ingreso);

        ingreso = new String[]{"false", "Medios renovables y la teoria", "eeeeeeeeee", "6.5", "50000.0-2388.8-1992.0", "Academico1,21.091.242.8,Salvador-Estudiante2,32.345.134.6,Brandom", "21.091.242.8", "inviable"};

        n1.ingresoDeProyecto(ingreso);

        System.out.println(n1.getIngresados().get(0).getEquipo().get(0).getClass());

        n1.crearArchJS();

    }
}
