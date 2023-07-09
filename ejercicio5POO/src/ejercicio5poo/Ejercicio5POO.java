package ejercicio5poo;

import java.util.Scanner;

public class Ejercicio5POO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        String mesSecreto = meses[1];

        String mesIngresado;

        System.out.println("Adivina el mes secreto");
        System.out.println("=======================");
        System.out.println("Introduzca el nombre del mes en minúsculas:");
        do {
            mesIngresado = leer.next().toLowerCase();
            if (mesIngresado.equals(mesSecreto)) {
                System.out.println("¡Ha acertado! ");
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }
        } while (!mesIngresado.equals(mesSecreto));

    }

}
