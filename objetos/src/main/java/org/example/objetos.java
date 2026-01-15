package org.example;

public class objetos {
    private String nombre;
    private String pan;
    private String ingrediente;
    private String salsa;
    private double precio;

    public objetos (String nombre, String pan, String ingrediente, String salsa, double precio){

        this.nombre = nombre;
        this.pan = pan;
        this.ingrediente = ingrediente;
        this.salsa = salsa;
        this.precio = precio;
    }
    public objetos(){

    }

    public String getNombre (){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getPan (){
        return pan;
    }

    public void setPan(String pan){
        this.pan = pan;
    }
    public String getIngrediente (){
        return ingrediente;
    }

    public void setIngrediente(String ingrediente){
        this.ingrediente = ingrediente;
    }

    public String getSalsa (){
        return ingrediente;
    }
    public void setSalsa (String salsa){
        this.salsa = salsa;
    }
    public double getPrecio (){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }


    public void imprimirinfobocata(){
        System.out.println("nombre: " + nombre);
        System.out.println("tipo pan: " + pan);
        System.out.println("Ingrediente: " + ingrediente);
        System.out.println("salsa: " + salsa);
        System.out.println("precio: " + precio);
    }
}
