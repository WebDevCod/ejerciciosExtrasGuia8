package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);
    public Ahorcado a;

    private char palabraOculta[];

    public AhorcadoServicio() {
        this.a = new Ahorcado();
    }

    public void crearJuego() {

        System.out.println("Ingresa una palabra para jugar:");
        String palabraIngresada = leer.next().toLowerCase();

        System.out.println("Ahora ingresa la cantidad de jugadas máximas:");
        int cantidadJugadas = leer.nextInt();

        a.setCantidadDeJugadasMaximas(cantidadJugadas);
        a.setCantidadDeLetrasEncontradas(0);

        int longitudPalabra = palabraIngresada.length();

        palabraOculta = new char[longitudPalabra];

        a.setPalabraAbuscar(new char[longitudPalabra]); //char[] palabraAbuscar = new char(longitudPalabra); 
        char[] arreglo = a.getPalabraAbuscar();

        for (int i = 0; i < longitudPalabra; i++) {
            arreglo[i] = palabraIngresada.charAt(i);
            palabraOculta[i] = '*';
        }
    }

    public void longitud() {
        char[] arreglo = a.getPalabraAbuscar();
        System.out.println("Longitud de la palabra que se debe encontrar es: " + arreglo.length);
        System.out.println("=================================================");
    }

    public void buscar(String letra) {
        char[] arreglo = a.getPalabraAbuscar();
        char caracter = letra.charAt(0);
        boolean encontrada = false;

        for (int i = 0; i < arreglo.length; i++) {
            if (caracter == arreglo[i]) {
                encontrada = true;
                break;
            }
        }
        String mensaje = encontrada ? "La letra forma parte de la palabra" : "La letra ingresada no forma parte de la palabra";
        System.out.println(mensaje);
        System.out.println("=================================================");

    }

    public boolean encontrada(String letra) {
        char[] arreglo = a.getPalabraAbuscar();
        char caracter = letra.charAt(0);
        int contador = a.getCantidadDeLetrasEncontradas();
        boolean bandera = false;

        for (int i = 0; i < arreglo.length; i++) {
            if (caracter == arreglo[i]) {
                contador++;
                bandera = true;
                palabraOculta[i] = caracter;
            }
        }

        a.setCantidadDeLetrasEncontradas(contador);

        for (int i = 0; i < palabraOculta.length; i++) {
            System.out.print(palabraOculta[i]);
        }

        int restaEncontrar = arreglo.length - contador;

        System.out.println("\nLetras encontras hasta el momento: " + contador);
        System.out.println("Falta que encuentres: " + restaEncontrar);
        System.out.println("=================================================");

        return bandera;

    }

    public void intentos() {
        int intentosRestantes = a.getCantidadDeJugadasMaximas();
        System.out.println("Tienes " + intentosRestantes + " intentos.");
    }

    public void juego() {
        crearJuego();

        do {
            longitud();

            System.out.println("Ingresa una letra para buscar:");
            String letra = leer.next().toLowerCase();
            buscar(letra);

            boolean retorno = encontrada(letra);
            if (!retorno) {
                int cantidadDeJugadas = a.getCantidadDeJugadasMaximas();
                a.setCantidadDeJugadasMaximas(cantidadDeJugadas - 1);
            }

            char[] arreglo = a.getPalabraAbuscar();

            boolean palabraEncontrada = true;

            for (int i = 0; i < palabraOculta.length; i++) {
                if (palabraOculta[i] != arreglo[i]) {
                    palabraEncontrada = false;
                    break;
                }
            }

            if (palabraEncontrada) {
                System.out.println("Se encontró la palabra");
                return; // Finaliza el proceso
            }

            intentos();
        } while (a.getCantidadDeJugadasMaximas() > 0);

        System.out.println("Lo sentimos, no hay más oportunidades");

    }
}
