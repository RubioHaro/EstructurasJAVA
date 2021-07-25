package trees.AVL;

import trees.BST.Node;

public class AVLTree implements BST {
    private AVLNode root;

    public AVLNode getRoot() {
        return root;
    }

    // RotarIzq
    public AVLNode rotateLeft(AVLNode node_y) {
        AVLNode node_x = node_y.getRight();
        AVLNode node_z = node_x.getLeft();
        node_x.setLeft(node_y);
        node_y.setRight(node_z);
        updateHeight(node_y);
        updateHeight(node_x);
        return node_x;
    }

    // RotarDer
    public AVLNode rotateRight(AVLNode node_y) {
        AVLNode node_x = node_y.getLeft();
        AVLNode node_z = node_x.getRight();
        node_x.setRight(node_y);
        node_y.setLeft(node_z);
        updateHeight(node_y);
        updateHeight(node_x);
        return node_x;
    }

    private void updateHeight(AVLNode node) {
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
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void add(Object node, int value) {
        // TODO Auto-generated method stub

    }

    public void add(int value, String tag) {
        if (isEmpty()) {
            root = new AVLNode(value, tag);
        } else {
            root = addRec(root, value, tag);
        }
    }

    public AVLNode addRec(AVLNode node, int number, String tag) {
        if (node == null) {
            return new AVLNode(number, tag);
        } else if (number < node.getValue()) {
            node.setLeft(addRec(node.getLeft(), number, tag));
        } else if (number > node.getValue()) {
            node.setRight(addRec(node.getRight(), number, tag));
        } else {
            System.out.println("Number duplicated");
        }
        return balance(node);
    }

    public AVLNode balance(AVLNode node) {
        System.out.println("balancing");
        updateHeight(node);
        int balance = getBalance(node);
        if (balance > 1) { // carga der rot izq
            if (height(node.getRight().getRight()) > height(node.getRight().getLeft())) {
                node = rotateLeft(node);
            } else {
                node.setRight(rotateRight(node.getRight()));
                node = rotateLeft(node);
            }
        } else if (balance < -1) { // carga izq rot der
            if (height(node.getLeft().getLeft()) > height(node.getLeft().getRight())) {
                node = rotateRight(node);
            } else {
                node.setLeft(rotateLeft(node.getLeft()));
                node = rotateRight(node);
            }
        } else {
            System.out.println("not balance required");
        }
        return node;
    }

    @Override
    public AVLNode search(int value) {
        AVLNode node_temp = root;
        while (node_temp != null) {
            if (node_temp.getValue() == value) {
                break;
            }
            node_temp = value < node_temp.getValue() ? node_temp.getLeft() : node_temp.getRight();
        }
        return node_temp;
    }

    @Override
    public void remove(int value) {
        // TODO Auto-generated method stub

    }

    @Override
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.getValue());
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }

    }

    @Override
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.getLeft());// *
            System.out.print(" " + node.getValue());
            traverseInOrder(node.getRight());// *
        }

    }

    @Override
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.getLeft());// *
            traversePostOrder(node.getRight());
            System.out.print(" " + node.getValue());// *
        }
    }
}
