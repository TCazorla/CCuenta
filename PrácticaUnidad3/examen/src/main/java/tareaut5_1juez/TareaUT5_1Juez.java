package tareaut5_1juez;

import java.util.Scanner;

public class TareaUT5_1Juez 
{
    public static void main(String[] args) 
    {
        Punto2D p0,p1,p2;
        Rectangulo r1,r2,r3;
        
        Scanner teclado = new Scanner(System.in);
        
        //Creamos los puntos
        p0 = new Punto2D();
        p1 = new Punto2D(teclado.nextInt(),teclado.nextInt()); 
        p2 = new Punto2D(teclado.nextInt(),teclado.nextInt());
        
        //Creamos los rectángulos
        r1 = new Rectangulo();
        r2 = new Rectangulo(teclado.nextInt(),teclado.nextInt(),p1);
        r3 = new Rectangulo(r2);
        
        //Mostramos la información de r1 usando los getters
        System.out.println("R1:" + "Base=" + r1.getBase() + " Altura=" + r1.getAltura()
                + " P1=" + r1.getP1());
        
        //Actualizamos la base y la altura de r1 a base=2 y altura=4. Asignamos como punto a p2
        r1.setBase(2);
        r1.setAltura(4);
        r1.setp1(p2);
        
        //Volvemos a mostrar la información de r1, pero ahora con toString()
        System.out.println("R1:" + r1);
        
        //Comprobamos si r1 y r2 son iguales
        if (r1.equals(r2))
        {
            System.out.println("R1 y R2 son iguales");
        }   
        else
        {
            System.out.println("R1 y R2 no son iguales");
        }    
        
        //Comprobamos si r2 y r3 son iguales
        if (r2.equals(r3))
        {
            System.out.println("R2 y R3 son iguales");
        }   
        else
        {
            System.out.println("R2 y R3 no son iguales");
        }
        
        //Mostramos el área de r1 y r2
        System.out.println("Area de R1=" + r1.area());
        System.out.println("Area de R2=" + r2.area());
        
        //Movemos P1 de r2, usando mover(dx,dy)
        r2.mover(-1,-1);
        
        //Movemos P1 de r3 al punto (0,0)
        r3.mover(p0);
        
        //Mostramos la información de los 3 rectángulos
        System.out.println("Numero de rectangulos:" + Rectangulo.numRectangulos);
        System.out.println("R1:" + r1);
        System.out.println("R2:" + r2);
        System.out.println("R3:" + r3);
         
    }
}
