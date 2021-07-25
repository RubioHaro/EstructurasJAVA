package trees.AVL;

import trees.BST.Node;

public interface BST {
   public boolean isEmpty();
   public void add(Object node, int value);
   public AVLNode search(int value);
   public void remove(int value);
   public void traversePreOrder(Node node);
   public void traverseInOrder(Node node);
   public void traversePostOrder(Node node);
}
