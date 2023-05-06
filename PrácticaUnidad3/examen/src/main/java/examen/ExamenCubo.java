/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class ExamenCubo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = teclado.nextInt();
        int cubo = x * x * x;
        int suma = 1;
     

        for (int i = 3; i <= cubo; i = i + 2) {
            if (suma < cubo) {
                if (i > 1) {
                    System.out.print("+");
                }
                System.out.print(i);
                suma = suma + i;
            }
        }
        System.out.println("=" + cubo);
    }

}
    

