package listas.doble;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DoublyLinkedList implements List {

    private Node first, last;
    private int size;

    public DoublyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public String toString() {
        String list = "";
        for (int i = 0; i < size; i++)
            list += "\n" + getNode(i);

        return list;
    }

    /**
     * Appends the specified element to the start of this list (optional operation).
     */
    @Override
    public boolean add(Object e) { // Agregar Principio
        Integer number = (Integer) e; // Casteo

        Node nodeNumber = new Node(null, null, number); // Creando un nuevo

        if (isEmpty()) {
            first = nodeNumber;
            last = nodeNumber; // = null

        } else { // No es null. Hay mas nodos
            Node temp = getNode(0); // prev == null
            temp.setPrev(nodeNumber);
            nodeNumber.setNext(temp);
            first = nodeNumber;
        }
        size++;
        return true;
    }

    @Override
    public void add(int index, Object element) {
        Integer number = (Integer) element; // Casteo
        if (index < 0 || index > size) {
            System.out.println("Error de longitud");
        } else if (index == 0) {
            add(element);
        } else {
            Node prevNode = getNode(index - 1); // Nos traremos el nodo anterior de la posicion
            Node node = new Node(prevNode.getNext(), prevNode, number); // Nodo 5

            if (index == size) {
                last = node; // ?
                last.getPrev().setNext(node);
            } else {
                prevNode.getNext().setPrev(node); //
            }
            prevNode.setNext(node);
            size++;
        }

    }

    public Node getNode(int index) {
        if (index == 0) {
            return first;
        }
        Node nodo = first; // Ref
        for (int i = 1; i < size; i++) {
            nodo = nodo.getNext();
            if (i == index) {
                return nodo;
            }
        }
        return null;
    }

    @Override
    public Object remove(int index) {
        if (!isEmpty() && index < size) {
            Node node = getNode(index); // Justo el que removemos
            if (size != index + 1) { // Si no es el ultimo
                node.getNext().setPrev(node.getPrev());
            } else {
                last = node.getPrev();
            }

            if (0 != index) { // Si no es el primero
                node.getPrev().setNext(node.getNext());
            } else {
                first = node.getNext();
            }
            size--;
        }
        return null;
    }

    public boolean remove1(Object o) {
        Integer number = (Integer) o; // Casteo
        for (int i = 0; i < size(); i++) {
            if (getNode(i).getItem() == number) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() { // True .> Esta vacia
        return size == 0 && first == null && last == null;
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object[] toArray(Object[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean containsAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public Object get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

}
