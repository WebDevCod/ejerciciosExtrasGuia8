package Entidad;

public class Nif {

    private long numeroDni;
    private String letraDni;

    public Nif() {
    }

    public Nif(long numeroDni, String letraDni) {
        this.numeroDni = numeroDni;
        this.letraDni = letraDni;
    }

    public long getNumeroDni() {
        return numeroDni;
    }

    public void setNumeroDni(long numeroDni) {
        this.numeroDni = numeroDni;
    }

    public String getLetraDni() {
        return letraDni;
    }

    public void setLetraDni(String letraDni) {
        this.letraDni = letraDni;
    }

}
