package org.example;

import java.util.Scanner;

public class PacienteAPP {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("Introduce tu edad");
        int edad = teclado.nextInt();
        System.out.println("Introduce tu genero");
        char genero = teclado.next().charAt(0);
        System.out.println("Introduce tu peso");
        double peso = teclado.nextInt();
        System.out.println("Introduce tu altura");
        int altura = teclado.nextInt();
        Paciente jacobo = new Paciente(nombre,edad,genero,peso,altura);
        jacobo.mostrar();

    }
}
