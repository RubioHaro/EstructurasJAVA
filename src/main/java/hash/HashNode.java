package hash;

public class HashNode {
    private int key;
    private Object value;
    private HashNode next;

    public HashNode() {
        this.key = 0;
        this.value = null;
        this.next = null;
    }

    public HashNode(int key, Object value, HashNode next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "key:" + key + ", value:" + value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public HashNode getNext() {
        return next;
    }

    public void setNext(HashNode next) {
        this.next = next;
    }

}
