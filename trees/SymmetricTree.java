package trees;

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */
public class SymmetricTree {
    TreeNode root;

    public static void main(String[] args) {
        SymmetricTree firstTree = new SymmetricTree();
        firstTree.root = new TreeNode(1);
        firstTree.root.left = new TreeNode(2);
        firstTree.root.right = new TreeNode(2);
        firstTree.root.left.left = new TreeNode(3);
        firstTree.root.left.right = new TreeNode(4);
        firstTree.root.right.left = new TreeNode(4);
        firstTree.root.right.right = new TreeNode(3);

        SymmetricTree secondTree = new SymmetricTree();
        secondTree.root = new TreeNode(1);
        secondTree.root.left = new TreeNode(2);
        secondTree.root.right = new TreeNode(2);
        secondTree.root.left.right = new TreeNode(3);
        secondTree.root.right.right = new TreeNode(3);

        boolean isFirstSymmetric = isSymmetric(firstTree.root);
        boolean isSecondSymmetric = isSymmetric(secondTree.root);

        System.out.println("The first tree is a symmetric tree: " + isFirstSymmetric
                + "\nThe second tree is a symmetric tree: " + isSecondSymmetric);
    }

    private static boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private static boolean isMirror(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true;

        return (root1.val == root2.val)
                && (isMirror(root1.left, root2.right))
                && (isMirror(root1.right, root2.left));
    }
}
