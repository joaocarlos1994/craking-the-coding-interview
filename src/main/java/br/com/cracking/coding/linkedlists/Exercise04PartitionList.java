package br.com.cracking.coding.linkedlists;

public class Exercise04PartitionList {

    /**
     * Is Unique: implement as algorithm to determine if a string has all unique
     * unique character. What if you cannot use  additional data structure.
     *
     * <a href="https://leetcode.com/problems/contains-duplicate/">Leetcode</a>
     */

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.appendToTail(4);
        listNode.appendToTail(3);
        listNode.appendToTail(2);
        listNode.appendToTail(5);
        listNode.appendToTail(2);
        partition(listNode, 3);
    }

    public static ListNode partition(ListNode node, int x) {
        ListNode higher = new ListNode(0);
        ListNode small = new ListNode(0);
        ListNode smallHead = small;
        ListNode higherHead = higher;

        while (node != null) {
            if (node.val < x) {
                small.next = node;
                small = small.next;
            } else {
                higher.next = node;
                higher = higher.next;
            }
            node = node.next;
        }

        small.next = higherHead.next;
        higher.next = null;
        return smallHead.next;
    }
}
