package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

public class PuntosServicio {

    Scanner leer = new Scanner(System.in);
    private Puntos p;

    public PuntosServicio() {
        this.p = new Puntos();
    }

    public void crearPuntos() {
        System.out.println("Ingresa los números para las coordenas y así poder calcular su distancia");
        System.out.print("Número x1: ");
        p.setX1(leer.nextInt());
        System.out.print("Número y1: ");
        p.setY1(leer.nextInt());
        System.out.print("Número x2: ");
        p.setX2(leer.nextInt());
        System.out.print("Número y2: ");
        p.setY2(leer.nextInt());
    }

    public void calcularDistancia() {
        int x1, y1, x2, y2;
        double distancia;

        x1 = p.getX1();
        y1 = p.getY1();
        x2 = p.getX2();
        y2 = p.getY2();

        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("La distancia es: " + distancia);
    }

}
