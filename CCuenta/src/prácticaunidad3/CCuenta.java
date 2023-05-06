/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticaunidad3;

/**
 *
 * @author Teresa
 * @version : 1.0
 
 */
public class CCuenta {

    // Propiedades de la Clase Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /* Constructor sin argumentos */
    public CCuenta() {
    }

    // Constructor con parámetro para iniciar todas las propiedades de la clase
    /**
     *
     * @author Teresa
     * @param nom el nombre de la cuenta
     * @param cue la cuenta
     * @param sal el saldo 
     * @param tipo el tipo de interes
     * 
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    // Método para asignar el nombre del titular de la cuenta

     /**
     
     * @param nom el nombre de la cuenta
     */
    public void setNombre(String nom) {
        nombre = nom;
    }

    // Método que me devuelve el nombre del titular
         /**
     *
     * @return  nom el nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    // Método que me devuelve el saldo disponible en cada momento
    /**@return saldo*/
    public double getEstado() {
        return getSaldo();
    }

    /**
     * Método para ingresar cantidades en la cuenta.Modifica el saldo.Este método va a ser probado con Junit
     * @param cantidad
     * @throws java.lang.Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar cantidades en la cuenta.Modifica el saldo.Este método va a ser probado con Junit
     * @param cantidad
     * @throws java.lang.Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getEstado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return  número de cuenta
     */
    // Método que me devuelve el número de cuenta
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param tipo
     * @param cantidad
     * @throws java.lang.Exception
     */
    //Creamos el método cobroFactura
    public void cobroFactura(String tipo, double cantidad) throws Exception {
        if (!tipo.equalsIgnoreCase("alquiler")
                && !tipo.equalsIgnoreCase("seguro")
                && !tipo.equalsIgnoreCase("luz")
                && !tipo.equalsIgnoreCase("agua")) {
            throw new Exception("El tipo introducido no es valido");
        }

        if (tipo.equalsIgnoreCase("alquiler") && (cantidad < 0 || cantidad > 400)) {
            throw new Exception("Para el tipo alquiler la cantidad no puede ser menor 0 ni mayor de 400");
        }
        if (tipo.equalsIgnoreCase("seguro") && (cantidad < 0 || cantidad > 125)) {
            throw new Exception("Para el tipo seguro la cantidad no puede ser menor que 0 ni mayor que 125");
        }
        if (tipo.equalsIgnoreCase("agua") && (cantidad < 0 || cantidad > 200)) {
            throw new Exception("Para el tipo agua la cantidad no puede ser menor que 0 ni mayor que 200");
        }
        if (tipo.equalsIgnoreCase("luz") && cantidad > 200) {
            throw new Exception("Para el tipo lux la cantidad no puede ser mayor de 200");
        }
        if (tipo.equals("luz") && cantidad < 0) {
            setSaldo(getSaldo() + (-1 * cantidad));
        } else {
            setSaldo(getSaldo() - cantidad);
        }

    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

}
