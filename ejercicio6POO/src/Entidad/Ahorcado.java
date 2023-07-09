package Entidad;

public class Ahorcado {

    private char[] palabraAbuscar;
    private int cantidadDeLetrasEncontradas;
    private int cantidadDeJugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabraAbuscar, int cantidadDeLetrasEncontradas, int cantidadDeJugadasMaximas) {
        this.palabraAbuscar = palabraAbuscar;
        this.cantidadDeLetrasEncontradas = cantidadDeLetrasEncontradas;
        this.cantidadDeJugadasMaximas = cantidadDeJugadasMaximas;
    }

    public char[] getPalabraAbuscar() {
        return palabraAbuscar;
    }

    public void setPalabraAbuscar(char[] palabraAbuscar) {
        this.palabraAbuscar = palabraAbuscar;
    }

    public int getCantidadDeLetrasEncontradas() {
        return cantidadDeLetrasEncontradas;
    }

    public void setCantidadDeLetrasEncontradas(int cantidadDeLetrasEncontradas) {
        this.cantidadDeLetrasEncontradas = cantidadDeLetrasEncontradas;
    }

    public int getCantidadDeJugadasMaximas() {
        return cantidadDeJugadasMaximas;
    }

    public void setCantidadDeJugadasMaximas(int cantidadDeJugadasMaximas) {
        this.cantidadDeJugadasMaximas = cantidadDeJugadasMaximas;
    }

}
