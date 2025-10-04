package br.com.cracking.coding.trees;

import org.junit.jupiter.api.Assertions;

public class Exercise04 {

    public static void main(String[] args) {

        Exercise04 exercise04 = new Exercise04();
        TreeNode treeNode = TreeNode.of(new int[]{20, 8, 4, 12, 10, 14, 22});

        boolean isBalanced = exercise04.isBalanced(treeNode);
        Assertions.assertTrue(isBalanced);
    }

    public boolean isBalanced(TreeNode root) {
        return helper(root);
    }

    public boolean helper(TreeNode node) {
        if (node == null) {
            return  true;
        }

        int heightLeft = height(node.left, 0);
        int heightRight = height(node.right, 0);
        if (Math.abs(heightLeft - heightRight) > 1) return false;

        return helper(node.left) && helper(node.right);
    }

    public int height(TreeNode node, int count) {
        if (node == null) {
            return count;
        }
        return Math.max(height(node.left, count + 1), height(node.right, count + 1));
    }
}
