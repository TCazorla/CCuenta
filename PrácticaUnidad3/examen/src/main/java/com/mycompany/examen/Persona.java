
package com.mycompany.examen;

public class Persona {

  public String nombre;
  public String primerApellido;
  public String segundoApellido;
  public String dni;
  public String fechaNacimiento;
  public int numeroExpediente;

  public Persona(){}

  public Persona(String nombre, String primerApellido, String segundoApellido, String dni,
      String fechaNacimiento, int numeroExpediente) {
    this.nombre = nombre;
    this.primerApellido = primerApellido;
    this.segundoApellido = segundoApellido;
    this.dni = dni;
    this.fechaNacimiento = fechaNacimiento;
    this.numeroExpediente = numeroExpediente;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPrimerApellido() {
    return primerApellido;
  }

  public void setPrimerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
  }

  public String getSegundoApellido() {
    return segundoApellido;
  }

  public void setSegundoApellido(String segundoApellido) {
    this.segundoApellido = segundoApellido;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public int getNumeroExpediente() {
    return numeroExpediente;
  }

  public void setNumeroExpediente(int numeroExpediente) {
    this.numeroExpediente = numeroExpediente;
  }

  @Override
  public String toString() {
    return "Persona{" +
        "nombre='" + nombre + '\'' +
        ", primerApellido='" + primerApellido + '\'' +
        ", segundoApellido='" + segundoApellido + '\'' +
        ", dni='" + dni + '\'' +
        ", fechaNacimiento='" + fechaNacimiento + '\'' +
        ", numeroExpediente='" + numeroExpediente + '\'' +
        '}';
  }

    void setApellido1(String apellidoString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setApellido2(String apellidoString1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setNumExpediente(int numExp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getNumExpediente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getApellido1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
