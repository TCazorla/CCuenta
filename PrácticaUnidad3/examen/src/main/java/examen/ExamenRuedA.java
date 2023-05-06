/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import com.mycompany.examen.Rueda;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class ExamenRuedA {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //1. Declaración de variables:
        //Declara tres objetos Rueda r1, r2 y r3
        
        Rueda r1;
        Rueda r2;
        Rueda r3;

        //2. Uso de los constructores:
        //Instancia el objeto r1 usando el constructor por defecto
        r1 = new Rueda(185, 65, 15);

        //Instancia el objeto r2 usando el constructor con parámetros.
        r2 = new Rueda(190, 70, 20);

        //Instancia el objeto r3 que sea una copia de la Rueda r1
        r3 = new Rueda(r1);

        //3. Uso de getters and setters:
        //Solicita por teclado nuevo valor para la anchura de la rueda r1 y actualízalo.
        try {
            int valor = teclado.nextInt();
            r1.setAnchura(valor);

            int diferencia = r1.getAnchura() - r2.getAnchura();
            int valor2 = Math.abs(diferencia);
            //Muestra la diferencia de anchura entre la rueda r1 y r2. Siempre devolviendo como resultado un valor positivo.
            System.out.println("Diferencia entre r1 y r2: " + valor2);
        

        //4. Mostrar toda la información de los objetos:
        //Muestra los valores de r1, r2 y r3.
        System.out.println("R1 " + r1.toString());
        System.out.println("R2 " + r2.toString());
        System.out.println("R3 " + r3.toString());
        } catch (InputMismatchException e) {
            System.out.println("Error, tipo introducido incorrecto");
        }
    
    

}

    
}
