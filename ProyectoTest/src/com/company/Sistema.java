package com.company;

import javax.print.event.PrintServiceAttributeListener;
import java.util.ArrayList;
import java.util.HashMap;

public class Sistema {
    private ArrayList<Proyecto> ingresados = new ArrayList<>();
    private HashMap<String,Integrante> registrados = new HashMap<>();
    private Input lector = new Input();


    private ArrayList ingresoParticipantes(){
        ArrayList<Integrante> equipo = new ArrayList<>();
        int opcion = 0;
        int salir = 0;
        Academico academicos;
        Estudiante estudiantes;
        String nombre;
        String rut;

        System.out.println("Ingrese los integrantes del Proyecto: ");

        do{
            opcion = 0;
            salir = 0;
            do {
                System.out.println("¿Que desea ingresar? ( Ingrese numeros del 1-5 )");
                System.out.println("1. Academico          2. Academico (Media Jornada)");
                System.out.println("3. Memorista          4. Practicante\n5. Academico");
                opcion = lector.numerosEnteros();
            } while( ! (opcion <= 4 && opcion >= 1) );

            rut = lector.pedirString("Ingrese el Rut del participante");

            if( ! (registrados.containsKey(rut) ) ) {
                nombre = lector.pedirString("Ingrese el Nombre del participante");

                if (opcion == 1 || opcion == 2) {
                    academicos = new Academico(nombre, rut);
                    if (opcion == 2) {
                        academicos.mediaJornada();
                    }
                    registrados.put(rut, academicos);
                    equipo.add(academicos);
                } else if (opcion == 3 || opcion == 4) {
                    estudiantes = new Estudiante(nombre, rut);
                    if (opcion == 4) {
                        estudiantes.setPracticante();
                    }
                    registrados.put(rut, estudiantes);
                    equipo.add(estudiantes);
                }
            }

            do {
                System.out.println("¿Desea seguir ingresando Integrates?\n1.Si\n2.No");
                salir = lector.numerosEnteros();
            }while ( ! (salir >= 1 && salir <= 2) );

        } while (salir != 2);

        return equipo;
    }

    private Integrante elegirDirector(ArrayList<Integrante> equipo){
        System.out.println("¿Que integrante tendra el rol de director?");
        int ciclos = 0;
        int opciones = 0;
        int eleccion = 0;
        for(Integrante s: equipo){
            if(opciones < 3) {
                System.out.print(opciones + 1 + ")" + s.getNombre()+"      ");
            } else {
                ciclos = 0;
                System.out.print(opciones + 1 + ")" + s.getNombre()+"\n");
            }
            opciones++;
        }
        do{
            eleccion = lector.numerosEnteros();
        } while ( ! (eleccion >= 1 && eleccion <= opciones) );

        return equipo.get(eleccion);
    }

    public void ingreso(){
        Proyecto protemp = new Proyecto();
        Presupuesto preTemp = new Presupuesto();
        Double tempDoubles = 0.0;
        Integrante inteTemp;

        int tipoPro = 0;

        do {
            System.out.println("¿Es un proyecto de invetigacion?\n1.Si\n2.No");
            tipoPro = lector.numerosEnteros();
        } while ( ! ( tipoPro >= 1 && tipoPro <= 2 ) );

        protemp.setTitulo(lector.pedirString("Ingrese titulo del proyecto: "));

        do{
           System.out.println("Ingrese la duracion del proyecto en meses: ");
           tempDoubles  = lector.pedirNumero();
        } while ( ! ( tempDoubles > 1 ) );
        protemp.setDuracion(tempDoubles);

        preTemp.setOperacional(lector.pedirNumeroPositivo("Ingrese los gastos operacionales: "));
        preTemp.setRemuneracionT(lector.pedirNumeroPositivo("Ingrese la remuneracion total: "));
        preTemp.setEquipamiento(lector.pedirNumeroPositivo("Ingrese los gastos en equipamientos: "));
        preTemp.setConferencia(lector.pedirNumeroPositivo("Ingrese el gasto de 1 conferencia: "));
        preTemp.setViaje(lector.pedirNumeroPositivo("Ingrese el gato de los viajes: "));
        preTemp.setViaticos(lector.pedirNumeroPositivo("Ingrese los gastos de viaticos: "));

        if (tipoPro == 1){
            protemp.setTipoProyecto(1);
        } else {
            protemp.setTipoProyecto(2);
        }

        protemp.setPresupuesto(preTemp);

        protemp.setResumen(lector.pedirString("Ingrese el resumen del proyecto: "));

        protemp.setEquipo(ingresoParticipantes());

        protemp.setDirector( elegirDirector( protemp.getEquipo() ) );


    }

    public ArrayList<Proyecto> getIngresados() {
        return ingresados;
    }

    public void setIngresados(ArrayList<Proyecto> ingresados) {
        this.ingresados = ingresados;
    }
}
