package Servicio;

import Entidad.Raices;
import java.util.Scanner;

public class RaicesServicio {
    
    Scanner leer = new Scanner(System.in);
    
    private Raices r;
    
    public RaicesServicio() {
        this.r = new Raices();        
    }
        
    public void setObject(int instancia){
        System.out.println("Objeto: " + instancia);
        System.out.print("a: ");
        r.setA(leer.nextDouble());
        System.out.print("b: ");
        r.setB(leer.nextDouble());
        System.out.print("c: ");
        r.setC(leer.nextDouble());        
    }
    
    public double getDiscriminante() {
        double a = r.getA();
        double b = r.getB();
        double c = r.getC();
        double discriminante;
        
        discriminante = Math.pow(b, 2) - (4 * a * c);
        
        System.out.println("El valor del discriminante es: " + discriminante);
        
        return discriminante;
    }
    
    public boolean tieneRaices(double discriminante) {
        return (discriminante > 0);
    }
    
    public boolean tieneRaiz(double discriminante) {
        return (discriminante == 0);
    }
    
    public void obtenerRaices(double discriminante) {
        double a = r.getA();
        double b = r.getB();
        
        if (tieneRaices(discriminante)) {
            double solucionA = (-b + (Math.sqrt(discriminante)) / (2 * a));
            double solucionB = (-b - (Math.sqrt(discriminante)) / (2 * a));
            
            System.out.println("Solución A: " + solucionA);
            System.out.println("Solución B: " + solucionB);
        }
        
    }
    
    public void obtenerRaiz(double discriminante) {
        double a = r.getA();
        double b = r.getB();
        
        if (tieneRaiz(discriminante)) {
            double solucionA = (-b + (Math.sqrt(discriminante)) / (2 * a));
            double solucionB = (-b - (Math.sqrt(discriminante)) / (2 * a));
            
            if (solucionA == solucionB) {
                System.out.println("Solución única: " + solucionA);
            } else {
                System.out.println("Solución A: " + solucionA);
                System.out.println("Solución B: " + solucionB);
            }
        }
    }
    
    public void calcular(double discriminante) {
        System.out.println("-------------------------------");
        if (tieneRaices(discriminante)) {
            obtenerRaices(discriminante);
        } else if (tieneRaiz(discriminante)) {
            obtenerRaiz(discriminante);
        } else {
            System.out.println("No existe solución");
        }
    }
}
