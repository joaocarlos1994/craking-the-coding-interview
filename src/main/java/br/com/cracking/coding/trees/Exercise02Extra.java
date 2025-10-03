package br.com.cracking.coding.trees;

import org.junit.jupiter.api.Assertions;

import java.util.LinkedList;
import java.util.List;

public class Exercise02Extra {

    public static void main(String[] args) {
        Exercise02Extra exercise02Extra = new Exercise02Extra();
        boolean isValid = exercise02Extra.isValidBST(TreeNode.ofBinaryTree(new int[] {1,2,3}));
        Assertions.assertTrue(isValid);
    }

    public boolean isValidBST(TreeNode root) {
        final List<Integer> numbers = new LinkedList<>();
        helper(root, numbers);

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) >= numbers.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void helper(TreeNode node, List<Integer> numbers) {
        if (node == null) {
            return;
        }
        helper(node.left, numbers);
        numbers.add(node.val);
        helper(node.right, numbers);
    }
}
