package org.example;

public class Frases extends Thread {
    public String  frase;
    public String nombre;
    public Frases(String nombre,String frase) {
        this.nombre = nombre;
        this.frase = frase;
    }

    public void run() {

        try {
            for (int i = 0; i < frase.length(); i++) {
                Thread.sleep(500);
                System.out.println(nombre + " - " + frase.split(" ")[i]);
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Thread Hilo1 = new Frases("Hilo 1", "Crear un problema que lance cuatro hilos ");
        Thread Hilo2 = new Frases("Hilo 2", "Cada uno imprime una frase distinta");
        Thread Hilo3 = new Frases("Hilo 3", "Con una pausa de 500 ms cada palabra.");
        Hilo1.start();
        Hilo2.start();
        Hilo3.start();
    }
}
//la excepcion que tira es porque hay frases mas cortas que otras