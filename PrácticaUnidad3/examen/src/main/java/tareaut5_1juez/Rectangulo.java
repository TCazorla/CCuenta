package tareaut5_1juez;

import java.util.Objects;


public class Rectangulo 
{
    /* ATRIBUTOS */
    
    //base 
    //altura
    //v1: Representa el Punto2D del vértice superior izquierdo
    
    //numRectangulos: se actualiza cada vez que se crea un nuevo rectángulo
    int base;
    int altura;
    Punto2D p1= new Punto2D(0,0);
    static int numRectangulos =0;
    
    /* MÉTODOS */

    //Constructor por defecto
    public Rectangulo() 
    {
        numRectangulos=numRectangulos +1;

    }

    //Constructor con parámetros
    public Rectangulo(int base, int altura, Punto2D p1) 
    {
        numRectangulos=numRectangulos +1;
        this.altura = altura;
        this.base = base;
        this.p1 = p1;

    }
    
    //Constructor de copia
    public Rectangulo(Rectangulo r) 
    {
        numRectangulos=numRectangulos +1;
        base = r.getBase();
        altura = r.getAltura();
      
        p1 = new Punto2D(r.getP1().getX(), r.getP1().getY());
        numRectangulos = r.getNumRectangulos();
    }

    //Getters and Setters
    public int getNumRectangulos()
    {
        return numRectangulos;
    }
    public int getAltura()
    {
        return altura;    
    }
    
    public int getBase()
    {
        return base;
    }
    
    public Punto2D getP1()
    {
        return p1;
    }
    
    public void setAltura(int altura)
    {
        this.altura = altura;
    }
    
    public void setBase(int base)
    {
        this.base = base;
    }
    public void setp1 (Punto2D p1)
    {
        this.p1 = p1;
        
    }
                     
    
    //toString()
    @Override
    public String toString()
    {
        return "Base=" + base + " Altura=" + altura
                + " P1=" + p1;
        
    }


    //hashCode()
    public int hashcode(){
        int hash =2;
        hash = 3 * this.altura + hash;
        hash = 3 * this.base + hash;
        return hash;
        
    }
    
    //equals()
    public boolean equals(Rectangulo rectangulo)
    {
        /*
        *  Rectangulo rec = new Rectangulo();
           Rectangulo rec2 = rec;
           rec.equals(rec2);
        
        */
        if(this == rectangulo){
            return true;
        }
        /*
          Rectangulo rec = new Rectangulo();
           
           rec.equals(null);
        */
        if(this == null){
            return false;
        }
        /* PARA TRUE
         Punto2D punto = new Punto2D(3,5);
         Rectangulo rec = new Rectangulo(1,2, punto);
         Rectangulo rec2 = new Rectangulo(1,2, punto);
         rec.equals(rec3)
        
         PARA FALSE
         Punto2D punto = new Punto2D(3,5);
         Rectangulo rec = new Rectangulo(1,2, punto);
         Rectangulo rec2 = new Rectangulo(5,2, punto);
         rec.equals(rec3)
        
        */
        
        if(this.area() == rectangulo.area() && this.altura == rectangulo.getAltura()
                && this.base == rectangulo.getBase() && this.getP1().equals(rectangulo.getP1())){
            return true;
        } else {
            return false;
        }   
        
    }

    
    /* OTROS MÉTODOS */
    
    //Calcula el área de un rectángulo
    
    public int area()
    {
        
        int area = (base *altura)/2;
        return area;
        
    }        

    /* Desplaza el punto  */
    public void mover(int dx, int dy) 
    {
        p1.setX(dx);
        p1.setY(dy);
        

    }
    
    /* Mover a un punto concreto */
    public void mover(Punto2D p)
    {
        p1 = p;

    }        

}
