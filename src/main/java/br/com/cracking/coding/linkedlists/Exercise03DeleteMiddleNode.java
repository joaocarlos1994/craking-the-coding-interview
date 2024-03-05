package br.com.cracking.coding.linkedlists;

public class Exercise03DeleteMiddleNode {

    /**
     * Is Unique: implement as algorithm to determine if a string has all unique
     * unique character. What if you cannot use  additional data structure.
     *
     * <a href="https://leetcode.com/problems/contains-duplicate/">Leetcode</a>
     */

    public static void main(String[] args) {
        deleteNode(new ListNode(1));
        deleteNode(new ListNode(2));
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
