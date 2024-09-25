public class Nodo {
    private double dato;
    private Nodo enlaceSiguiente;
    private Nodo enlaceAnterior;

    public Nodo() {
        dato = 0;
        enlaceSiguiente = null;
    }

    public Nodo(double dato) {
        this.dato = dato;
        enlaceSiguiente = null;
    }

    public Nodo(double dato, Nodo enlaceSiguiente) {
        this.dato = dato;
        this.enlaceSiguiente = enlaceSiguiente;
    }

    public Nodo(double dato, Nodo enlaceSiguiente, Nodo enlaceAnterior) {
        this.dato = dato;
        this.enlaceSiguiente = enlaceSiguiente;
        this.enlaceAnterior = enlaceAnterior;
    }

    public Nodo getEnlace() {
        return enlaceSiguiente;
    }

    public void setEnlace(Nodo enlaceSiguiente) {
        this.enlaceSiguiente = enlaceSiguiente;
    }

    public double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo [dato=" + dato + ", enlaceSiguiente=" + enlaceSiguiente + "]";
    }

    public Nodo getEnlaceSiguiente() {
        return enlaceSiguiente;
    }

    public void setEnlaceSiguiente(Nodo enlaceSiguiente) {
        this.enlaceSiguiente = enlaceSiguiente;
    }

    public Nodo getEnlaceAnterior() {
        return enlaceAnterior;
    }

    public void setEnlaceAnterior(Nodo enlaceAnterior) {
        this.enlaceAnterior = enlaceAnterior;
    }

}
