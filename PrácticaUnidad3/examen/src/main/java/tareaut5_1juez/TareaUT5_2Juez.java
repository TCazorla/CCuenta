package tareaut5_1juez;


import java.util.Scanner;

public class TareaUT5_2Juez 
{
    public static void main(String[] args) 
    {
        int num1,num2,denom1,denom2;
        
        Scanner teclado = new Scanner(System.in);
        
        num1 = teclado.nextInt();
        denom1 = teclado.nextInt();
        
        num2 = teclado.nextInt();
        denom2 = teclado.nextInt();
        
        Fraccion.suma(num1, denom1, num2, denom2);
        Fraccion.resta(num1, denom1, num2, denom2);
        Fraccion.multiplicacion(num1, denom1, num2, denom2);
        Fraccion.division(num1, denom1, num2, denom2);
        
    }
    
}
