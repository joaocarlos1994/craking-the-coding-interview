package br.com.cracking.coding.trees;

import org.junit.jupiter.api.Assertions;

public class Exercise02 {

    public static void main(String[] args) {

        Exercise02 exercise02 = new Exercise02();
        TreeNode treeNode = exercise02.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        Assertions.assertEquals(0, treeNode.val);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int middlePoint = (left + right) / 2;
        TreeNode treeNode = new TreeNode(nums[middlePoint]);
        treeNode.left = helper(nums, left, middlePoint - 1);
        treeNode.right = helper(nums, middlePoint + 1, right);
        return treeNode;
    }
}
