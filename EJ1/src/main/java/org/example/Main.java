package org.example;

public class Main {
    public static void main(String[] args) {
        SThread multiplos = new MultiplosYCuadrados("multiplos", 3);
        Thread Cuadrados = new MultiplosYCuadrados("Cuadrados", 1);
        multiplos.start();
        Cuadrados.start();
    }
}