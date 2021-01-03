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
    List<List<Integer>> list = new ArrayList<>(); 
    public List<List<Integer>> levelOrder(Node root) {
        levelOrder(root, 0);
        return list;
    }
    
    private void levelOrder(Node root, int level) {
        if (root == null)
            return;
        
        if (list.size() == level)
            list.add(new ArrayList<>());
        
        list.get(level).add(root.val);
        
        for (Node node : root.children)
            levelOrder(node, level + 1);
    }
}