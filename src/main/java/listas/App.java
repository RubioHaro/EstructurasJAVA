package listas;

import listas.doble.DoublyLinkedList;
import listas.enlazada.Lista;

/**
 * Sistema
 */
public class App {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(4); 
        list.add(6);
        list.add(7);
        System.out.println(list);

        list.add(2, 5);
        list.add(2, 5);
        // System.out.println(list);
        list.add(5, 8);
        // System.out.println(list.size());
        System.out.println(list);

        // System.out.println(list.size());
        // System.out.println(list);

        // list.remove(3);
        list.remove1(5);
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