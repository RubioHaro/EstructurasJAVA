package trees;

public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // add()
    public void add(int number) {
        if (isEmpty()) {
            root = new Node(number);
        } else {
            addRec(number, root);
        }
    }

    public void addRec(int number, Node node) {
        if (number < node.getValue()) { // izq
            if (node.getLeft() == null) {
                System.out.println("Node added " + number + " to left of " + node.getValue());
                node.setLeft(new Node(number));
            } else {
                addRec(number, node.getLeft());
            }
        } else if (number > node.getValue()) {
            if (node.getRight() == null){
                System.out.println("Node added " + number + " to right of " + node.getValue());
                node.setRight(new Node(number));
            } else {
                addRec(number, node.getRight());
            }
        }
    }

    public void traversePreOrderRec(Node node) { 
        if(node != null){
            System.out.print(" "+ node.getValue());
            traversePreOrderRec(node.getLeft());
            traversePreOrderRec(node.getRight());
        }
    }

    public void traverseInOrderRec(Node node) { 
        if(node != null){
            traversePreOrderRec(node.getLeft());// *
            System.out.print(" "+ node.getValue());
            traversePreOrderRec(node.getRight());// *
        }
    }

    public void traversePostOrderRec(Node node) { 
        if(node != null){
            traversePreOrderRec(node.getLeft());// *
            traversePreOrderRec(node.getRight());
            System.out.print(" "+ node.getValue());// *
        }
    }

    // get()
    // remove()

}
