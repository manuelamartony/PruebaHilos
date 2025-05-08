package org.example;

public class MultiplosYCuadrados extends Thread {
    public int numero;

    public MultiplosYCuadrados(String nombre, int numero) {
        super(nombre);
        this.numero = numero;
    }

    public void run() {
        if (numero == 1) {
            for (int i = 1; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i*i);
            }
        }
        if (numero == 3) {
            for (int i = 1; i < 30; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i * 3);
            }
        }
    }
    public static void main(String[] args) {
        Thread multiplos = new MultiplosYCuadrados("multiplos", 3);
        Thread Cuadrados = new MultiplosYCuadrados("Cuadrados", 1);
        multiplos.start();
        Cuadrados.start();
    }
}
