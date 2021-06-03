package trees;

public class Node {
    private Node left, right;
    private int value; //key
    private String tag;

    public Node(int value) {
        this.left = null;
        this.right = null;
        this.value = value;
    }

    public Node(int value, String tag) {
        this.left = null;
        this.right = null;
        this.value = value;
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "tag:" + tag + " value:" + value;
    }

    public Node(Node left, Node right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    } 

    
}
