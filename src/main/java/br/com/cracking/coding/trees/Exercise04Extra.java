package br.com.cracking.coding.trees;

import org.junit.jupiter.api.Assertions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exercise04Extra {

    public static void main(String[] args) {

        Exercise04Extra exercise04Extra = new Exercise04Extra();
        exercise04Extra.levelOrder(TreeNode.of(new int[]{1, 2, 3, 4, 5}));
        //Assertions.assertEquals(0, treeNode.val);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> nums = new LinkedList<>();
            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.poll();
                nums.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(nums);

        }
        return result;
    }
}
