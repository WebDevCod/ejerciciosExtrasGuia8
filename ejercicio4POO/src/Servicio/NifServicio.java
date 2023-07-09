package Servicio;

import Entidad.Nif;
import java.util.Scanner;

public class NifServicio {

    Scanner leer = new Scanner(System.in);
    private Nif n;

    public NifServicio() {
        this.n = new Nif();
    }

    public void crearNif() {
        System.out.print("Ingresa tu DNI: ");
        int largoNumDni;
        do {
            Long numDni = leer.nextLong();
            largoNumDni = numDni.toString().length();
            if (largoNumDni >= 0 && largoNumDni <= 8) {
                n.setNumeroDni(numDni);
                calcularDigitoVerificador(numDni);
            } else {
                System.out.println("Debes ingresar 8 números");
            }
        } while (largoNumDni < 0 || largoNumDni > 8);
    }

    public void calcularDigitoVerificador(long numDni) {

        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        int resto = (int) numDni % 23;

        if (resto >= 0 && resto <= 22) {
            String letra = letras[resto];
            n.setLetraDni(letra);
        }
        mostrar();
    }

    public void mostrar() {

        int numero = (int) n.getNumeroDni();

        String cadena = String.format("%08d", numero);

        System.out.println("DNI: " + cadena + "-" + n.getLetraDni());
    }

}