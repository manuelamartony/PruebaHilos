package org.example;

public class OperacionesSaldo extends Thread {
    public double saldo = 500;
    public int cantidad;
    public int numero;
    public String nombre;
    public int veces;
    public OperacionesSaldo(String str,int numero,int cantidad,int veces) {
        this.nombre = str;
        this.cantidad = cantidad;
        this.numero = numero;
        this.veces = veces;

    }


    public void Deposito(int cantidad){
        saldo = saldo + cantidad;
        System.out.println(nombre + " Sumó -  Saldo actual: " + saldo) ;
    }
    public void Retirar(int cantidad){
        saldo -= cantidad;
        System.out.println(nombre + " Retiró -  Saldo actual: " + saldo) ;
    }
    public void Saldo(){
        System.out.println(nombre + " Consultó -  Saldo actual: " + saldo) ;
    }

    public void run() {
        if (numero == 1){
            for (int i = 0; i < veces; i++){
                Saldo();}

        } else if (numero == 2) {
            for (int i = 0; i < veces; i++){
            Deposito(cantidad);}
        }
        else if (numero == 3){
            for (int i = 0; i < veces; i++){
            Retirar(cantidad);}
        }
    }
    public static void main(String[] args) {
        Thread usuario1 = new Thread(new OperacionesSaldo("Usuario 1",  1,0,5));
        Thread usuario2 = new Thread(new OperacionesSaldo("Usuario 2", 2,35,2));
        Thread usuario3 = new Thread(new OperacionesSaldo("Usuario 3",  3,10,3));
        usuario1.start();
        usuario2.start();
        usuario3.start();

    }

}
