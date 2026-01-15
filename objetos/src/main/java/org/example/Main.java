package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        objetos peito = new objetos("pepito","normal","bacon","mayonesa",10.00);

        peito.imprimirinfobocata();
        System.out.println(peito.getNombre() + " " + peito.getPrecio() + " €");

        objetos vacio = new objetos();

        vacio.setNombre("chivito");

        peito.imprimirinfobocata();
    }
}
