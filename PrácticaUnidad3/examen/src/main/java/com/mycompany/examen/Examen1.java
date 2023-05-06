/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.examen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class Examen1 {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);
            //declaro un objeto de la clase persona se declara nombre de la clase nombre del objeto;
            Persona teresa;
            //utilizando el constructor que me de el profesor
            // instancia el objeto añadiendo tus datos personales sin solicitarlos por teclado
            teresa = new Persona("teresa", "cazorla", "de la calle", "23063501k", "20/09/1987", 33);
            // utilizando seters
            /*3. Crea un menú de opciones que solicita un valor entero entre 1 y 5. (1 punto)
              3.1.1. Opción 1 - Modificar el alumno (2 puntos)
              • Las opciones de modificación serán las siguientes:
                 1. Nombre
                 2. Primer apellido
                 3. Segundo apellido
                 4. DNI
                 5. Fecha de nacimiento
                 6. Número de expediente*/
            
            int num = 0;
            while(num!=5) {
                System.out.println("introduzca un valor entre el 1 y el 5");
                num = teclado.nextInt();
                switch (num) {
                case 1:
                    System.out.println("1 para introducir el nombre");
                    System.out.println("2 introduzca primer apellido");
                    System.out.println("3 introduzca segundo apellido");
                    System.out.println("4 introduzca el DNI");
                    System.out.println("5 introduzca FNacimiento");
                    System.out.println("6 introduzca expediente");

                    int subMenu = teclado.nextInt();
                    teclado.nextLine();
                    switch (subMenu) {
                        case 1:
                            System.out.println("introduzca el nombre");
                            String nombre = teclado.nextLine();
                            teresa.setNombre(nombre);
                               teclado.nextLine();
                            break;
                        case 2:
                            System.out.println("introduzca primer apellido");
                            String apellido = teclado.nextLine();
                       
                            teresa.setPrimerApellido(apellido);
                                 teclado.nextLine();
                            break;
                        case 3:
                            System.out.println("introduzca segundo apellido");
                            String apellido2 = teclado.nextLine();
                            teresa.setSegundoApellido(apellido2);
                            break;
                        case 4:
                            System.out.println("introduzca el DNI");
                            String dni = teclado.nextLine();
                            teresa.setDni(dni);
                            break;
                        case 5:
                            System.out.println("introduzca FNacimiento");
                            String fecha = teclado.nextLine();
                            teresa.setFechaNacimiento(fecha);

                            break;
                        case 6:
                            System.out.println("introduzca expediente");
                            int numExp = teclado.nextInt();
                            teresa.setNumeroExpediente(numExp);

                            break;

                    }

                //3.1.2. Opción 2 - Mostrar toda la información del alumno
                case 2:
                    System.out.println(teresa.getNombre() + " " + teresa.getPrimerApellido() + ", " + teresa.getSegundoApellido()
                            + " " + teresa.getDni() + " " + teresa.getFechaNacimiento() + " " + teresa.getNumeroExpediente());
                    break;
                /*3.1.3. Opción 3 - Comprobar qué modelo de examen hacer (0,5 puntos)
                            • El modelo de examen podrá ser 0 o 1 en función de si vuestro NRE
                             (Número Regional de Estudiante) es par o impar. De manera que
                             si es par deberá corresponderle el modelo 0 y si es impar el modelo 1.*/

                case 3:

                    if (teresa.getNumeroExpediente() % 2 == 0) {
                        System.out.println("el modelo de examen es:0");
                    } else {
                        System.out.println("el modelo de examen es:1");
                    }
                    break;
                //3.1.4. Opción 4 - Operaciones sobre los datos (3,5 puntos)
                case 4:
                    String palindromo = teresa.getNombre() + teresa.getPrimerApellido();
                    palindromo = palindromo.trim();
                    palindromo = palindromo.replaceAll(" ", "");
                    palindromo = palindromo.toLowerCase();
                    boolean sonDistintos = false;
                    //RADAR
                    for (int i = 0; i < palindromo.length(); i++) {
                        int derecha = palindromo.length() - i - 1;
                        if (palindromo.charAt(i) != palindromo.charAt(derecha) && (i < derecha)) {
                            sonDistintos = true;
                        }

                    }
                    if (sonDistintos == true) {
                        System.out.println("NO PALINDROMO");
                    } else {
                        System.out.println("SI PALINDROMO");
                    }

                    break;
                //3.1.5. Opción 5 – Salir Se mostrará un mensaje de despedida.
                case 5:

                    System.out.println("hasta pronto");
                default:
                    System.out.println("el numero introducido debe ser entre el 1 y el 5");

            }
                
            }
            
            //4. Excepciones (1 punto)
            //4.1.1. Debes capturar las excepciones que consideres necesarias.
        } catch (InputMismatchException e) {
            System.out.println("Debe ser un numero");

        }

    }
}
