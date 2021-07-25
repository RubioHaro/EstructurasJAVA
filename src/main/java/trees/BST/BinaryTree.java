package trees.BST;

public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // add()
    public void add(int number, String tag) {
        if (isEmpty())
            root = new Node(number, tag);
        else
            addRec(number, root, tag);

    }

    public void addRec(int number, Node node, String tag) {
        if (number < node.getValue()) { // izq
            if (node.getLeft() == null) {
                System.out.println("Node added " + number + " to left of " + node.getValue());
                node.setLeft(new Node(number, tag));
            } else
                addRec(number, node.getLeft(), tag);

        } else if (number > node.getValue()) {
            if (node.getRight() == null) {
                System.out.println("Node added " + number + " to right of " + node.getValue());
                node.setRight(new Node(number, tag));
            } else
                addRec(number, node.getRight(), tag);

        }
    }

    // add()
    public void add(int number) {
        if (isEmpty())
            root = new Node(number);
        else
            addRec(number, root);

    }

    public void addRec(int number, Node node) {
        if (number < node.getValue()) { // izq
            if (node.getLeft() == null) {
                System.out.println("Node added " + number + " to left of " + node.getValue());
                node.setLeft(new Node(number));
            } else
                addRec(number, node.getLeft());

        } else if (number > node.getValue()) {
            if (node.getRight() == null) {
                System.out.println("Node added " + number + " to right of " + node.getValue());
                node.setRight(new Node(number));
            } else
                addRec(number, node.getRight());
        }
    }

    public Node search(int number) {
        if (!isEmpty())
            return searchR(number, root);
        else
            return root;

    }

    // get()
    public Node searchR(int number, Node node) {
        if (node.getValue() == number || node == null)
            return node;
        if (number < node.getValue())
            return searchR(number, node.getLeft());

        return searchR(number, node.getRight());
    }

    public void remove(int number) {
        if (!isEmpty())
            removeRec(number, root);
    }

    // remove()
    public Node removeRec(int number, Node node) {

        // Recorrer
        if (number < node.getValue()) // left
            node.setLeft(removeRec(number, node.getLeft()));
        else if (number > node.getValue())
            node.setRight(removeRec(number, node.getRight()));
        else {
            // node contiente solo 1 hijo
            if (node.getLeft() == null)
                return node.getRight();
            else if (node.getRight() == null)
                return node.getLeft();

            Node temp = getMinNode(node.getRight());
            node.setValue(temp.getValue());
            node.setTag(temp.getTag());
            node.setRight(removeRec(node.getValue(), node.getRight()));

        }
        return node;
    }

    public Node getMinNode(Node node) {
        while (node.getLeft() != null)
            node = node.getLeft();

        return node;
    }

    public void traversePreOrderRec(Node node) {
        if (node != null) {
            System.out.print(" " + node.getValue());
            traversePreOrderRec(node.getLeft());
            traversePreOrderRec(node.getRight());
        }
    }

    public void traverseInOrderRec(Node node) {
        if (node != null) {
            traverseInOrderRec(node.getLeft());// *
            System.out.print(" " + node.getValue());
            traverseInOrderRec(node.getRight());// *
        }
    }

    public void traversePostOrderRec(Node node) {
        if (node != null) {
            traversePostOrderRec(node.getLeft());// *
            traversePostOrderRec(node.getRight());
            System.out.print(" " + node.getValue());// *
        }
    }

}
