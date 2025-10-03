package br.com.cracking.coding.trees;

import org.junit.jupiter.api.Assertions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exercise03 {

    public static void main(String[] args) {

        Exercise03 exercise03 = new Exercise03();
        TreeNode treeNode = TreeNode.of(new int[]{3,9,20,15,17});
        List<List<Integer>> values = exercise03.levelOrder(treeNode);
        Assertions.assertEquals(3, values.size());
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> nums = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
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
