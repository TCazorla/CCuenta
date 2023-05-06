/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class ExamenDiciembre_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntosjugador = 0, puntosmaquina = 0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++) { //durante 3 turnos
            try {
                /*Pedimos por pantalla la jugada del jugador*/
                System.out.println("Introduce la opción de jugador");
                System.out.println("0 - Piedra\n1 - Papel\n2 -Tijera");
                System.out.println("");
                int jugador = teclado.nextInt();
                /*Generamos un número aleatorio entre 0 y 2*/
                int maquina = (int) (Math.random() * 2);
                /*En caso de que el jugador elija piedra*/
                if (jugador == 0) {
                    System.out.println("El jugador ha jugado: Piedra");
                    switch (maquina) {
                        case 0:
                            System.out.println("La máquina ha jugado:Piedra ");
                            System.out.println("Empate");
                            System.out.println("");

                            i--; //si empatan tenemos un turno más
                            break;
                        case 1:
                            System.out.println("La máquina ha jugado:Papel");

                            System.out.println("Gana la máquina");
                            System.out.println("");
                            puntosmaquina++;
                            break;
                        case 2:
                            System.out.println("La máquina ha jugado:Tijera");
                            System.out.println("Gana el jugador");
                            System.out.println("");
                            puntosjugador++;
                            break;
                    }
                    /*En caso de que el jugador elija papel*/
                } else if (jugador == 1) {
                    System.out.println("El jugador ha jugado: Papel");
                    switch (maquina) {
                        case 0:
                            System.out.println("La máquina ha jugado:Piedra");
                            System.out.println("Gana el jugador");
                            System.out.println("");
                            puntosjugador++;
                            break;
                        case 1:
                            System.out.println("La máquina ha jugado:Papel ");
                            System.out.println("Empate");
                            System.out.println("");
                            i--; //Si empatan tenemos un turno más
                            break;
                        case 2:
                            System.out.println("La máquina ha jugado:Tijera");
                            System.out.println("Gana la máquina");
                            System.out.println("");
                            puntosmaquina++;
                            break;
                    }
                    /*En caso de que el juagdor elija tijera*/
                } else if (jugador == 2) {
                    System.out.println("El jugador ha jugado: Tijera");

                    switch (maquina) {
                        case 0:
                            System.out.println("La máquina ha jugado:Piedra");

                            System.out.println("Gana la máquina");
                            System.out.println("");
                            puntosmaquina++;
                            break;
                        case 1:
                            System.out.println(
                                    "La máquina ha jugado:Papel");
                            System.out.println("Gana el jugador");
                            System.out.println("");
                            puntosjugador++;
                            break;
                        case 2:
                            System.out.println("La máquina ha jugado:Tijera");
                            System.out.println("Empate");
                            System.out.println("");
                            i--;//si empatan tenemos un turno más
                            break;
                    }
                }
                /*Si el jugador o la máquina suman 2 victorias sumamos
una iteración
para que acabe el bucle for*/
                if (puntosjugador == 2 || puntosmaquina == 2) {
                    i++;
                }
                /*Mostramos por pantalla el marcador parcial*/
                System.out.println("");
                System.out.println("MarcadorParcial\n-------------- -");
                System.out.println("Jugador: " + puntosjugador + "Máquina: " + puntosmaquina);
                System.out.println("");
            } catch (InputMismatchException e) { //Si no se introduce unbentero 
                System.out.println("ERROR: El valor introducido no es un entero");

                System.out.println("");
                teclado.nextLine();
                i--; //Restamos una iteración para conservar 3 intentos

            }
        }
        /*Mostramos por pantalla el marcador final*/
        if (puntosjugador > puntosmaquina) { //Si gana el jugador
            System.out.println("Ha ganado el jugador");
        } else if (puntosmaquina > puntosjugador) { //Si gana la máquina
            System.out.println("Ha ganado la máquina");
        } else if (puntosjugador == puntosmaquina) { //Si empatan
            System.out.println("Empate");
        }
        System.out.println("Ganadas por el jugador: "
                + puntosjugador);
        System.out.println("Ganadas por la máquina: "
                + puntosmaquina);

    }

}
