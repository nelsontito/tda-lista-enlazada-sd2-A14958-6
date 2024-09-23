public interface ILista {
    void inicializacionoCreacion();

    void insertarElemento(int elementoaInsertar);

    void eliminarElemento(int elementoaEliminar);

    void pop();

    Nodo buscarElemento(int elementoaBuscar);

    boolean seEncuentraElemento(int elementoaEncontrar);

    String recorrerLista();

    boolean estaVacia();
}
