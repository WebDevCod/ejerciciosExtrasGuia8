package ejercicio3poo;

import Servicio.RaicesServicio;

public class Ejercicio3POO {

    public static void main(String[] args) {

        int instancia = 1;
        for (int i = 0; i < 4; i++) {
            RaicesServicio rs = new RaicesServicio();

            rs.setObject(instancia);

            double discriminante = rs.getDiscriminante();

            boolean retornoSoluciones = rs.tieneRaices(discriminante);
            String mensaje1 = retornoSoluciones ? "Tiene dos soluciones" : "No tiene dos soluciones";
            System.out.println(mensaje1);

            boolean retornoSolucion = rs.tieneRaiz(discriminante);
            String mensaje2 = retornoSolucion ? "Tiene una unica solución" : "No tiene una única solución";
            System.out.println(mensaje2);

            rs.obtenerRaices(discriminante);

            rs.obtenerRaiz(discriminante);

            rs.calcular(discriminante);
            instancia++;
        }
    }

}
