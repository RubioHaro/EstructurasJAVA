package trees;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(5);
        // tree.add(4);
        tree.add(1);
        tree.add(0);
        tree.add(2);
        tree.add(3);
        tree.add(6);
        tree.add(7);
        tree.add(8);

        // System.out.println("PreOrder");
        // tree.traversePreOrderRec(tree.getRoot());
        System.out.println("\nInOrder");
        tree.traverseInOrderRec(tree.getRoot());
        // System.out.println("\nPostOrder");
        // tree.traversePostOrderRec(tree.getRoot());

    }
}
