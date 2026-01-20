package org.example;

public class Estudiante {

    private static int contadorestudiantes = 0;
    private String curso;
    private int nia;
    private String gmail;
    private String nombre;

    public Estudiante (String nombre, String curso, String gmail){
        this.nombre = nombre;
        this.curso = curso;
        this.gmail = gmail;
        nia = contadorestudiantes + 1;
    }
    public  Estudiante (String nombre){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "curso='" + curso + '\'' +
                ", nia=" + nia +
                ", gmail='" + gmail + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }


}
