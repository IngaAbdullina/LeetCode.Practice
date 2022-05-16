package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 * (i.e., from left to right, level by level).
 */
public class BinaryTreeLevelOrderTraversal {
    TreeNode root;
    List<List<Integer>> list;

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal tree = new BinaryTreeLevelOrderTraversal();
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(7);

        tree.list = levelOrder(tree.root);
        System.out.println(tree.list);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);

        while (!deque.isEmpty()){
            int size = deque.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = deque.poll();
                list.add(curr.val);
                if(curr.left != null) deque.add(curr.left);
                if(curr.right != null) deque.add(curr.right);
            }
            result.add(list);
        }
        return result;
    }
}