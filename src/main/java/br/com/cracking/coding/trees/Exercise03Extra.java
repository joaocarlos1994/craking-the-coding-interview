package br.com.cracking.coding.trees;

public class Exercise03Extra {

    public static void main(String[] args) {
        Exercise03Extra exercise03Extra = new Exercise03Extra();
        exercise03Extra.isSymmetric(TreeNode.ofBinaryTree(new int[]{1, 2, 3, 4, 5}));
        //Assertions.assertEquals(0, treeNode.val);
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }

        if (t1 == null || t2 == null) {
            return false;
        }
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
