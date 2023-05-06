/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package prácticaunidad3;




import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Teresa
 */
public class CCuentaTest {
    
  
    
    @Test
    public void testIngresar() throws Exception {
        CCuenta ingresar = new CCuenta();
        ingresar.ingresar(89.9);
        Assert.assertTrue(ingresar.getEstado() == 89.9);       
    }
    
    @Test
    public void testRetirarIngresar()throws Exception{
        CCuenta operacion = new CCuenta();
        operacion.ingresar(100);
        operacion.retirar(20);
        Assert.assertTrue(operacion.getEstado() == 80.0); 
    }
    // Probamos que las excepciones tanto en los casos validos como no validos funcionan correctamente.
    @Test(expected = Exception.class)
    public void testCobroFacturaNoValido() throws Exception{
        CCuenta cuenta = new CCuenta();
        cuenta.cobroFactura("casa", 400);       
   }
    
    @Test(expected = Exception.class)
    public void testCobroFacturaTipoAlquilerCantidadNoValida() throws Exception{
        CCuenta cuenta = new CCuenta();
        cuenta.cobroFactura("alquiler", 500);
    }
    
    @Test(expected = Exception.class)
    public void testCobroFacturaTipoSeguroCantidadNovalida() throws Exception{
        CCuenta cuenta = new CCuenta();
        cuenta.cobroFactura("seguro", 200);
    }
    
    @Test(expected = Exception.class)
    public void testCobroFacturaTipoAguaCantidadNovalida() throws Exception{
        CCuenta cuenta = new CCuenta();
        cuenta.cobroFactura("agua", -200);
    }
    
    @Test(expected = Exception.class)
    public void testCobroFacturaTipoLuzCantidadNovalida() throws Exception{
        CCuenta cuenta = new CCuenta();
        cuenta.cobroFactura("luz", 201);
    }
    // Probamos que para todos los tipos y cantidad de cobroFactura los casos validos sean correctos
    @Test
    public void testCobroFactura() throws Exception{
        CCuenta cuenta = new CCuenta();
        cuenta.ingresar(200);
        cuenta.cobroFactura("luz", -100);
        Assert.assertTrue(cuenta.getEstado() == 300.0); 
        cuenta.cobroFactura("luz", 100);
        Assert.assertTrue(cuenta.getEstado() == 200.0); 
        cuenta.cobroFactura("alquiler",50.0);
        Assert.assertTrue(cuenta.getEstado() ==150);
        cuenta.cobroFactura("seguro", 50.0);
        Assert.assertTrue(cuenta.getEstado()== 100);
        cuenta.cobroFactura("agua",100.0);
        Assert.assertTrue(cuenta.getEstado()== 0);
        
    }
    
    //Probamos los valores límite del método cobroFactura
    @Test
    public void testCobroFacturaValoresLimite() throws Exception{
        CCuenta cuenta = new CCuenta(); 
        cuenta.cobroFactura("luz", 200);
        Assert.assertTrue(cuenta.getEstado() == -200.0); 
        cuenta.cobroFactura("alquiler",400);
        Assert.assertTrue(cuenta.getEstado() ==-600);
        cuenta.cobroFactura("seguro", 125);
        Assert.assertTrue(cuenta.getEstado()== -725);
        cuenta.cobroFactura("agua",200);
        Assert.assertTrue(cuenta.getEstado()== -925);
        
    }
    
}
