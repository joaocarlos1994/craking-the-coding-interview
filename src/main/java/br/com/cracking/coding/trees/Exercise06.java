package br.com.cracking.coding.trees;

import org.junit.jupiter.api.Assertions;

public class Exercise06 {

    public static void main(String[] args) {

        Exercise06 exercise06 = new Exercise06();
        TreeNode treeNode = TreeNode.ofBinaryTree(new int[]{4, 8, 10, 12, 14, 20, 22});
        TreeNode nodeToFind = treeNode.find(10);
        TreeNode successor = exercise06.inorderSuccessor(nodeToFind);
        Assertions.assertEquals(12, successor.val);
    }

    public TreeNode inorderSuccessor(TreeNode root) {
        if (root == null) return null;
        if (root.right != null) {
            //return leftmost child of right subtree
            return leftMostChild(root.right);
        }

        TreeNode node = root;
        while (node.parent != null && node.parent.right == node) {
            node = node.parent;
        }
        return node.parent;
    }

    private TreeNode leftMostChild(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
