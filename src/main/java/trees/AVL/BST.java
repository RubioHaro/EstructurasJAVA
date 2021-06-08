package trees.AVL;

import trees.BST.Node;

public interface BST {
   public void isEmpty();
   public void add(Object node, int value);
   public void search(int value);
   public void remove(int value);
   public void traversePreOrder(Object node);
   public void traverseInOrder(Object node);
   public void traversePostOrder(Object node);
}
