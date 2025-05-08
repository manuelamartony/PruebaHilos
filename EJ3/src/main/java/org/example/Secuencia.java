package org.example;

public class Secuencia  extends Thread{
    public String nombre;
    public int numero;
    public String vocales = "aeiou";
    public Secuencia(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
    public void run(){
        if (numero == 1){
            for (int i = 1; i <= 10; i++){
                System.out.println(nombre + " " + i*2);
            }
        }else if (numero == 2){
            for (int i = 0; i < 10; i++){
                System.out.println(nombre + " " + ((i*2)+1));
            }
        }else{
            for (int i = 0; i < vocales.length(); i++){
                System.out.println(nombre + " " + vocales.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        Thread secuencia1 = new Thread(new Secuencia("Secuencia 1",  1));
        Thread secuencia2 = new Thread(new Secuencia("Secuencia 2",  2));
        Thread secuencia3 = new Thread(new Secuencia("Secuencia 3",  3));
        secuencia1.start();
        secuencia2.start();
        secuencia3.start();
    }
}
