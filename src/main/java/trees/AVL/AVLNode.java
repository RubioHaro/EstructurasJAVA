package trees.AVL;

import trees.BST.Node;

public class AVLNode extends Node {
    private int height;
    private AVLNode left, right;

    public AVLNode(int value) {
        this(value, null, 0);
    }

    public AVLNode(int value, String tag) {
        super(value, tag);
        this.height = 0;
    }

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

    @Override
    public AVLNode getLeft() {
        return left;
    }
    
    public void setLeft(AVLNode left) {
        this.left = left;
    }
    
    @Override
    public AVLNode getRight() {
        return right;
    }
    
    public void setRight(AVLNode right) {
        this.right = right;
    }
}
