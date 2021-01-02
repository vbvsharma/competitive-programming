/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> list = new LinkedList<>();
    public List<Integer> postorder(Node root) {
        postorderUtil(root);
        return list;
    }
    
    private void postorderUtil(Node root) {
        if (root == null)
            return;
        
        for (Node node : root.children)
            postorderUtil(node);
        
        list.add(root.val);
    }
}