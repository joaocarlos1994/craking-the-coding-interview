package br.com.cracking.coding.trees;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class Exercise05 {

    public static void main(String[] args) {

        Exercise05 exercise05 = new Exercise05();
        TreeNode treeNode = TreeNode.of(new int[]{2, 1, 3});
        boolean isBalanced = exercise05.isValidBST(treeNode);
        Assertions.assertTrue(isBalanced);
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        helper(root, values);

        for (int i = 1; i < values.size(); i++) {
            if (!(values.get(i - 1) < values.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void helper(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }
        helper(node.left, values);
        values.add(node.val);
        helper(node.right, values);
    }
}
