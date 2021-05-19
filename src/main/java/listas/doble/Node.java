package listas.doble;

public class Node {
    private Node next, prev;
    private int item;

    public Node(Node next, Node prev, int item) {
        this.next = next;
        this.prev = prev;
        this.item = item;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    public int getItem() {
        return item;
    }
    public void setItem(int item) {
        this.item = item;
    }

    
    @Override
    public String toString() {
        return "item:" + item;
    }
}
