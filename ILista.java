public interface ILista {
    void inicializacionoCreacion();

    void insertarElemento(double elementoaInsertar);

    void eliminarElemento(double elementoaEliminar);

    void pop();

    Nodo buscarElemento(double elementoaBuscar);

    boolean seEncuentraElemento(double elementoaEncontrar);

    String recorrerLista();

    boolean estaVacia();
}
