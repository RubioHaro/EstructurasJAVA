package listas;

import listas.doble.DoublyLinkedList;
import listas.enlazada.Lista;

/**
 * Sistema
 */
public class App {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(5);
        list.add(4);
        System.out.println(list);


        // Lista list = new Lista();
        // list.AgregarPrimero(4);
        // list.AgregarPrimero(6);
        // list.AgregarPrimero(7);
        // System.out.println("Agregamos primero");
        // list.printLista();

        // list.Agregar(5, 2);
        // list.Agregar(5, 2);
        // System.out.println("Agregamos 2 y uno al final");

        // list.AgregarAlFinal(8);
        // list.printLista();
        // System.out.println("Borramos elemento");
        // list.Remover(3);
        // list.printLista();
    }
}