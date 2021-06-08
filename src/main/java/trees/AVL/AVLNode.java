package trees.AVL;

import trees.BST.Node;

public class AVLNode extends Node {
    private int height;
    private AVLNode left, right;

    public AVLNode(int value, int height) {
        super(value);
        this.height = height;
    }

    public AVLNode(int value, String tag, int height) {
        super(value, tag);
        this.height = height;
    }

    public AVLNode(Node left, Node right, int value, int height) {
        super(left, right, value);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    
    public AVLNode getLeft() {
        return left;
    }
    
    public void setLeft(AVLNode left) {
        this.left = left;
    }
    
    public AVLNode getRight() {
        return right;
    }
    
    public void setRight(AVLNode right) {
        this.right = right;
    }
}
