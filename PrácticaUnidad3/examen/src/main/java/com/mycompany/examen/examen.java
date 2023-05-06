package com.mycompany.examen;

import com.mycompany.examen.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 *
 */
public class examen {

    private static Persona alumno = new Persona("Ri", "A", "Cue", "21111",
            "11/1/1993", 111111);

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner opcion = new Scanner(System.in);
        int menu1, menu2;
        System.out.println("1. Modificar Alumno");
        System.out.println("2. Mostrar informacion");
        System.out.println("3. Modelo asignado de examen");
        System.out.println("4. Operaciones");
        System.out.println("5. Salir");
        try {
            menu1 = opcion.nextInt();
            switch (menu1) {
                case 1:
                    System.out.println("Que desea modificar:");
                    System.out.println("1. Nombre");
                    System.out.println("2. Primer apellido");
                    System.out.println("3. Segundo apellido");
                    System.out.println("4. DNI");
                    System.out.println("5. Fecha de nacimiento");
                    System.out.println("6. Numero expediente");
                    System.out.println("7. Salir");
                    menu2 = opcion.nextInt();
                    switch (menu2) {
                        case 1:
                            System.out.println("Introduce el nombre: ");
                            String nombreString = teclado.nextLine();
                            alumno.setNombre(nombreString);
                            System.out.println(" pulse una tecla para volver");
                            if (opcion.next() != "") {
                                main(args);
                            }
                            break;
                        case 2:
                            System.out.println("Introduce el primer apellido:");
                            String apellidoString = teclado.nextLine();

                            alumno.setApellido1(apellidoString);
                            System.out.println(" pulse una tecla para volver");
                            if (opcion.next() != "") {
                                main(args);
                            }
                            break;
                        case 3:
                            System.out.println("Introduce el segundo apellido:");
                            String apellidoString1 = teclado.next();
                            alumno.setApellido2(apellidoString1);
                            System.out.println(" pulse una tecla para volver");
                            if (opcion.next() != "") {
                                main(args);
                            }
                            break;
                        case 4:
                            System.out.println("Introduce el dni:");
                            String dniString = teclado.nextLine();
                            alumno.setDni(dniString);
                            System.out.println(" pulse una tecla para volver");
                            if (opcion.next() != "") {
                                main(args);
                            }
                            break;
                        case 5:
                            System.out.println("Introduce la fecha de nacimiento:");
                            String fechaNaString = teclado.nextLine();
                            alumno.setFechaNacimiento(fechaNaString);
                            System.out.println(" pulse una tecla para volver");
                            if (opcion.next() != "") {
                                main(args);
                            }
                            break;
                        case 6:
                            System.out.println("Introduce el numero de expediente:");
                            int numExp = teclado.nextInt();
                            alumno.setNumExpediente(numExp);
                            System.out.println(" pulse una tecla para volver");
                            if (opcion.next() != "") {
                                main(args);
                            }
                            break;
                        case 7:
                            main(args);
                            break;
                    }
                    break;
                case 2:
                    System.out.println(alumno.toString());
                    System.out.println("");
                    System.out.println(" pulse una tecla para volver");
                    if (teclado.next() != "") {

                        main(args);
                    }
                    break;
                case 3:
                    System.out.print("El examen que debe realizar es: ");
                    if (alumno.getNumExpediente() % 2 == 0) {
                        System.out.println("Modelo 0");
                    } else {
                        System.out.println("Modelo 1");
                    }
                    System.out.println("");
                    System.out.println(" pulse una tecla para volver");
                    if (teclado.next() != "") {
                        main(args);
                    }
                    break;
                case 4:
                    String primerNombre[] = alumno.getNombre().split(" ");
                    String nomApe = primerNombre[0].concat(alumno.getApellido1());
                    nomApe = nomApe.strip().toLowerCase().replaceAll(" ", "");
                    int longitud = nomApe.length() - 1;
                    boolean palindromo = true;
                    for (int i = 0; nomApe.length() > i; i++) {
                        if (nomApe.charAt(i) != nomApe.charAt(longitud)) {
                            palindromo = false;
                            break;
                        }
                        longitud--;
                    }
                    System.out.println(palindromo ? "El nombre es palindromo" : "El nombre no espalindromo");
                    System.out.println("");
                    System.out.println(" pulse una tecla para volver");
                    if (teclado.next() != "") {
                        main(args);
                    }
                    break;
                case 5:
                    System.out.println("Hasta la vista!");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error " + e.getLocalizedMessage());
            System.out.println("Introduce un valor valido");
            main(args);
        } catch (Exception e) {
            System.out.println("Error " + e.getLocalizedMessage());
            System.out.println("Error desconocido");
            main(args);

        }
    }
}
