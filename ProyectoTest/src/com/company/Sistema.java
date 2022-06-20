package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Sistema {
    private ArrayList<Proyecto> ingresados;
    private HashMap<String,Integrante> registrados ;

    public Sistema() {
        this.ingresados = new ArrayList<>();
        this.registrados = new HashMap<>();
    }

    public void ingresoDeProyecto(String[] args) {
        Proyecto temp = new Proyecto();
        String[] partis = args[5].split("-");
        Presupuesto tempPre = new Presupuesto();
        Integrante pasar;
        temp.setTitulo(args[1]);
        temp.setResumen(args[2]);
        try{
            temp.setDuracion( Double.parseDouble( args[3] ) );
        }catch (Exception e){
            System.out.println("Error al ingresar los datos");
        }
        temp.setPresupuesto(args[4]);


        for (String parti : partis) {
            String[] participante = parti.split(",");

            if (!(this.registrados.containsKey(participante[1]))) {
                switch (participante[0]) {
                    case "Academico1" -> {
                        pasar = new Academico(participante[1], participante[2]);
                        temp.getEquipo().add(pasar);
                        break;
                    }
                    case "Academico2" -> {
                        Academico academiTemp = new Academico(participante[1], participante[2]);
                        academiTemp.mediaJornada();
                        pasar = academiTemp;
                        temp.getEquipo().add(pasar);
                        break;
                    }
                    case "Administrativo" -> {
                        pasar = new Administrativo(participante[1], participante[2]);
                        temp.getEquipo().add(pasar);
                    }
                    case "Estudiante1" -> {
                        pasar = new Estudiante(participante[1], participante[2]);
                        temp.getEquipo().add(pasar);
                        break;
                    }
                    case "Estudiante2" -> {
                        Estudiante estuTempo = new Estudiante(participante[1], participante[2]);
                        estuTempo.setPracticante();
                        pasar = estuTempo;
                        temp.getEquipo().add(pasar);
                        break;
                    }
                }
            } else {
                pasar = this.registrados.get(participante[1]);
            }
        }
        System.out.println("Equipo Ingresado");

        temp.setDirector(args[6]);

        if(!Boolean.parseBoolean(args[0])){
            temp.setResumen(args[7]);
            temp.setEstado(false);
        } else {
            temp.setEstado(true);
        }

        this.ingresados.add(temp);
    }

    public void crearArchJS(){
        try {
            File archivo = new File("Proyectos.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(this.ingresados);
            FileWriter escribir = new FileWriter(archivo,false);
            escribir.write(json);
            escribir.close();
        } catch (Exception e){
            System.out.println("Error al escribir los archivos");
        }
    }

    public ArrayList<Proyecto> getIngresados() {
        return ingresados;
    }

    public void setIngresados(ArrayList<Proyecto> ingresados) {
        this.ingresados = ingresados;
    }

    public HashMap<String, Integrante> getRegistrados() {
        return registrados;
    }

    public void setRegistrados(HashMap<String, Integrante> registrados) {
        this.registrados = registrados;
    }
}
