package org.example;

public class EstudianteAPP {
    static void main(String[] args) {
        Estudiante jorge = new Estudiante("jorge", "1DAM","jorgu@iesmutxamel.com");
        System.out.println(jorge.getNia());
        Estudiante raul = new Estudiante("Raul");

        System.out.println(raul.getNia());
        System.out.println(jorge);
    }
}
