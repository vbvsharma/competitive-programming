/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree {
    void leftView(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        if (root.left != null)
            leftView(root.left);
        else
            leftView(root.right);
    }
}