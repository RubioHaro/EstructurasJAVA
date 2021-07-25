package trees.AVL;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.add(8, "html");
        tree.add(7, "body");
        tree.add(6, "div");
        tree.traverseInOrder(tree.getRoot());
        System.out.println("");

        tree.add(5, "head");
        tree.add(4, "span");
        tree.add(0, "a");
        tree.add(1, "p");
        tree.add(2, "button");
        tree.add(3, "input");

        System.out.print("New root:");
        System.out.println("root:" + tree.getRoot());

        tree.traverseInOrder(tree.getRoot());
        System.out.println("");

        System.out.println(tree.search(0));
        
        // int[] number = new int[50];
    }
}
