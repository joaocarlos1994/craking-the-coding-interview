package br.com.cracking.coding.trees;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode of(int[] numbers) {
        return helper(numbers, 0, numbers.length - 1);
    }

    private static TreeNode helper(int[] nums, int left, int right) {
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
