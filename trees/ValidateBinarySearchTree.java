package trees;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 *
 * A valid BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree {
    TreeNode root;

    public static void main(String[] args) {
        ValidateBinarySearchTree firstTree = new ValidateBinarySearchTree();
        firstTree.root = new TreeNode(2);
        firstTree.root.left = new TreeNode(1);
        firstTree.root.right = new TreeNode(3);

        ValidateBinarySearchTree secondTree = new ValidateBinarySearchTree();
        secondTree.root = new TreeNode(5);
        secondTree.root.left = new TreeNode(1);
        secondTree.root.right = new TreeNode(4);
        secondTree.root.right.left = new TreeNode(3);
        secondTree.root.right.right = new TreeNode(6);

        boolean isFirstValidBST = isValidBST(firstTree.root);
        boolean isSecondValidBST = isValidBST(secondTree.root);

        System.out.println("The first tree is a valid binary search tree: " + isFirstValidBST
                + "\nThe second tree is a valid binary search tree: " + isSecondValidBST);
    }

    public static boolean isValidBST(TreeNode root) {
        if(root == null) return false;

        Deque<TreeNode> deque = new ArrayDeque<>();
        Integer previous = null;

        while (!deque.isEmpty() || root != null){
            while (root != null){
                deque.push(root);
                root = root.left;
            }
            root = deque.pop();

            if(previous != null && previous >= root.val){
                return false;
            }
            previous = root.val;
            root = root.right;
        }
        return true;
    }
}
