package org.example;

public class persona {
    private String nombre;
    private String dni;
    private int edad;

    public persona (String nombre, String dni, int edad){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    public persona(){

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
       this.dni = dni;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void imprimirpersona(){
        System.out.println("nombre: " + nombre);
        System.out.println("din: " + dni);
        System.out.println("edad: " + edad);
    }
}
