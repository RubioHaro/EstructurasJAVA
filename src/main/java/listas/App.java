package listas;

import listas.enlazada.Lista;

/**
 * Sistema
 */
public class App {

    public static void main(String[] args) {
        Lista list = new Lista();
        list.AgregarPrimero(4);
        list.AgregarPrimero(7);
        list.AgregarPrimero(7);
        list.printLista();

        // list.Agregar(5, 3);
        // list.Agregar(5, 3);
        // list.ObtenerNodo(3);

        // list.AgregarAlFinal(8);
        System.out.println(list.ObtenerNodo(0).getElemento() == (list.ObtenerNodo(1).getElemento()));
        // list.Remover(2);
        list.printLista();
    }
}