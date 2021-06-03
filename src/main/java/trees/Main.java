package trees;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(5, "html");
        // tree.add(4);
        tree.add(1, "row");
        tree.add(0, "div");
        tree.add(2, "h1");
        tree.add(3, "h2");
        tree.add(6, "p");
        tree.add(7, "a");
        tree.add(8, "span");

        // System.out.println("PreOrder");
        // tree.traversePreOrderRec(tree.getRoot());
        System.out.println("\nInOrder");
        tree.traverseInOrderRec(tree.getRoot());
        // System.out.println("\nPostOrder");
        // tree.traversePostOrderRec(tree.getRoot());
        // System.out.println(tree.search(5));
        // System.out.println(tree.search(0));
        // System.out.println(tree.search(1));
        // System.out.println(tree.search(8));

        // tree.remove(0);
        // tree.remove(2);
        tree.remove(5);


        System.out.println("\nInOrder");
        tree.traverseInOrderRec(tree.getRoot());
        
    }
}
