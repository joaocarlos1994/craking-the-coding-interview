package br.com.cracking.coding.trees;

public class TreeNode {
    int val;
    TreeNode parent;
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

    public static TreeNode ofBinaryTree(int[] numbers) {
        return helper(numbers, 0, numbers.length - 1);
    }

    private static TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int middlePoint = (left + right) / 2;
        TreeNode treeNode = new TreeNode(nums[middlePoint]);
        treeNode.setLeftChild(helper(nums, left, middlePoint - 1));
        treeNode.setRightChild(helper(nums, middlePoint + 1, right));
        return treeNode;
    }

    public TreeNode find(int d) {
        if (d == val) {
            return this;
        } else if (d <= val) {
            return left != null ? left.find(d) : null;
        } else if (d > val) {
            return right != null ? right.find(d) : null;
        }
        return null;
    }

    private void setLeftChild(TreeNode left) {
        this.left = left;
        if (left != null) {
            left.parent = this;
        }
    }

    private void setRightChild(TreeNode right) {
        this.right = right;
        if (right != null) {
            right.parent = this;
        }
    }

    public static TreeNode of(int[] array) {
        if (array.length > 0) {
            TreeNode root = new TreeNode(array[0]);
            java.util.Queue<TreeNode> queue = new java.util.LinkedList<TreeNode>();
            queue.add(root);
            boolean done = false;
            int i = 1;
            while (!done) {
                TreeNode r = (TreeNode) queue.element();
                if (r.left == null) {
                    TreeNode node = new TreeNode(array[i]);
                    r.left = node;
                    node.setParent(r.left);
                    i++;
                    queue.add(r.left);
                } else if (r.right == null) {
                    TreeNode node = new TreeNode(array[i]);
                    r.right = node;
                    node.setParent(r.right);
                    i++;
                    queue.add(r.right);
                } else {
                    queue.remove();
                }
                if (i == array.length) {
                    done = true;
                }
            }
            return root;
        } else {
            return null;
        }
    }

    private void setParent(TreeNode node) {
        this.parent = node;
    }
}
