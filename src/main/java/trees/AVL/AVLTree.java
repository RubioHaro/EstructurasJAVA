package trees.AVL;

import trees.BST.Node;

public class AVLTree implements BST {
    private Node root;

    // RotarIzq
    
    // RotarDer

    private void updateHeight(AVLNode node){
        int height = Math.max(height(node.getLeft()), height(node.getRight())) + 1; 
        node.setHeight(height);
    }

    private int height(AVLNode node) {
        return node == null ? -1 : node.getHeight();
    }

    public int getBalance(AVLNode node) {
        return node == null ? 0 : height(node.getRight()) - height(node.getLeft());
    }

    @Override
    public void isEmpty() {
        // TODO Auto-generated method stub

    }

    @Override
    public void add(Object node, int value) {
        // TODO Auto-generated method stub

    }

    @Override
    public void search(int value) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(int value) {
        // TODO Auto-generated method stub

    }

    @Override
    public void traversePreOrder(Object node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void traverseInOrder(Object node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void traversePostOrder(Object node) {
        // TODO Auto-generated method stub

    }
}
