import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class left_view_of_binary_tree_array {
    class Node {
        int data;
        Node left, right;
        
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
    
    class BinaryTree {
        Node root;
        
        // Function to return the left view of the binary tree
        ArrayList<Integer> leftView() {
            ArrayList<Integer> leftViewNodes = new ArrayList<>();
            if (root == null)
                return leftViewNodes;
    
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            int maxLevel = -1;
    
            while (!queue.isEmpty()) {
                int size = queue.size();
    
                for (int i = 0; i < size; i++) {
                    Node node = queue.poll();
    
                    if (i == 0) {
                        leftViewNodes.add(node.data);
                    }
    
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                }
            }
    
            return leftViewNodes;
        }
    }
    
    // Main class
    class Main {
        public static void main(String args[]) {
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);
            tree.root.right.left = new Node(6);
            tree.root.right.right = new Node(7);
            tree.root.left.left.right = new Node(8);
    
            ArrayList<Integer> leftView = tree.leftView();
    
            System.out.print("Left view of the tree: ");
            for (int node : leftView) {
                System.out.print(node + " ");
            }
        }
    }
}


