package hash;

public class HashTable {
    private HashNode[] arryTable;
    private int size;

    public HashTable(int size) {
        this.size = size;

        arryTable = new HashNode[size];
        for (int i = 0; i < size; i++) {
            arryTable[i] = new HashNode();
        }
    }

    public int hashFunction(int key) {
        int index = key % this.size;
        return (index >= 0 && index <= this.size - 1) ? index : -1;
    }

    public void add(int key, Object value) {
        int hashIndex = hashFunction(key);
        HashNode node = arryTable[hashIndex];
        HashNode newNode = new HashNode(key, value, node.getNext());
        node.setNext(newNode);
        System.out.println("Node added. key:" + key + ", value:" + value + ", hash index:" + hashIndex);
    }

    public HashNode get(int key) {
        int hashIndex = hashFunction(key);
        HashNode node = arryTable[hashIndex];
        while (node != null) {
            if (node.getKey() == key) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    public void remove(int key) {
        int hashIndex = hashFunction(key);
        HashNode node = arryTable[hashIndex];
        if (node.getKey() == key) {
            node.setNext(node.getNext().getNext());
        } else {
            while (node != null) {
                if (node.getNext().getKey() == key) {
                    node.setNext(node.getNext().getNext());
                }
                node = node.getNext();
            }
        }
    }

    public HashNode[] getArryTable() {
        return arryTable;
    }

    public void setArryTable(HashNode[] arryTable) {
        this.arryTable = arryTable;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
