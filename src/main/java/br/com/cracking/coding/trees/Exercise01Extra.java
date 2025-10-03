package br.com.cracking.coding.trees;

import org.junit.jupiter.api.Assertions;

public class Exercise01Extra {

    public static void main(String[] args) {
        Exercise01Extra exercise01Extra = new Exercise01Extra();
        int depth = exercise01Extra.maxDepth(TreeNode.ofBinaryTree(new int[] {3, 9, 20, 15, 7}));
        Assertions.assertEquals(3, depth);
    }

    public int maxDepth(TreeNode root) {
        int total = maxDepth(root, 0);
        return total;
    }

    public int maxDepth(TreeNode node, int count) {
        if (node == null) {
            return count;
        }

        count += 1;

        if (node.left != null && node.right == null) {
            return maxDepth(node.left, count);
        } else if (node.left == null && node.right != null) {
            return maxDepth(node.right, count);
        }
        return Math.max(maxDepth(node.left, count), maxDepth(node.right, count));
    }
}
