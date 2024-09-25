public interface ILista {
    void inicializacionoCreacion();

    void insertarElemento(String elementoaInsertar);

    void eliminarElemento(String elementoaEliminar);

    void pop();

    Nodo buscarElemento(String elementoaBuscar);

    boolean seEncuentraElemento(String elementoaEncontrar);

    String recorrerLista();

    boolean estaVacia();
}
