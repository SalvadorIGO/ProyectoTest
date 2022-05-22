package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
    private BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

    public String pedirString(String texto) {
        Input recur = new Input();
        String frase;
            try {
                System.out.println(texto);
                frase = buff.readLine();
            } catch (Exception e){
                frase = pedirString(texto);
            }
        return frase;
    }





    /**
     *Deja entrar solo numeros, ya sean decimales o enteros
     * @version: 1.0
     * @autor: Salvador Gallardo
     * @return: entrada de numeros, en caso de que sean ingresadas letras lo pedira de nuevo
     * */
    public double pedirNumero() {
        Input recur = new Input();
        double numero;
        try {
            numero = Double.parseDouble(buff.readLine());
        } catch (Exception e) {
            System.out.print("El dato ingresado no es un numero ");
            numero = recur.pedirNumero();
        }
        return numero;
    }

    /**
     *Solo permite la entrada de numeros positivos
     * @version: 1.0
     * @autor: Salvador Gallardo
     * @return: solo numeros positivos
     * */
    public double pedirNumeroPositivo(String texto){
        Input recur = new Input();
        double numero = 0;
        do {
            System.out.println(texto);
            numero = recur.pedirNumero();
        } while (!(numero >= 0));
        return numero;
    }

    /**
     *Entrada de numeros enteros
     * @version: 1.0
     * @autor: Salvador Gallardo
     * @return: numero solo numeros, en caso de que sea un string lo pedira de nuevo
     * */

    public int numerosEnteros(){
        String[] temp;
        String numero;
        double n_De_e = 0;
        Input entrada = new Input();


        do {
            n_De_e = pedirNumero();
            numero = "" + n_De_e;
            temp = numero.split("\\.");
        } while (!(Integer.parseInt(temp[1]) == 0 ));

        return (int) n_De_e;
    }

}
