/*
Structure of Node:
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

public class Tree {
    // return true if the given tree is a BST, else return false
    boolean isBST(Node root) {
        return isBST(root, null, null);
    }

    boolean isBST(Node root, Integer min, Integer max) {
        if (root == null)
            return true;
        if (min != null && root.data <= Integer.valueOf(min))
            return false;
        if (max != null && root.data >= Integer.valueOf(max))
            return false;

        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }
}