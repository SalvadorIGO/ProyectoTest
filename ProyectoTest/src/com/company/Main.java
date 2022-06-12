package com.company;

import java.util.Arrays;

public class Main {



    public static void main(String[] args){;
        Sistema n1 = new Sistema();

        args = new String[]{"true", "Medios renovables y su impacto","aaaaaaaaaaa","4.5","40000.0-2888.8-4992.0","Academico1,21.091.242.8,Salvador-Estudiante2,32.345.134.6,Vicente","21.091.242.8"};

        n1.ingresoDeProyecto(args);
        n1.crearArchJS();
    }
}
