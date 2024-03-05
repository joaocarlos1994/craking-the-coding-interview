package br.com.cracking.coding.linkedlists;

import java.util.HashSet;
import java.util.Set;

public class Exercise02RemoveNthNodeFromEnd {

    /**
     * Is Unique: implement as algorithm to determine if a string has all unique
     * unique character. What if you cannot use  additional data structure.
     *
     * <a href="https://leetcode.com/problems/contains-duplicate/">Leetcode</a>
     */

    public static void main(String[] args) {
        removeNthFromEnd(new ListNode(1), 1);
        removeNthFromEnd(new ListNode(2), 2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int totalElement = countTotalElement(head, 0) - n;
        int count = 0;

        if (totalElement == 0) {
            return head.next;
        }

        ListNode node = head;
        while (count < totalElement) {
            if (count == totalElement - 1) {
                System.out.println("val: " + node.val);
                node.next = node.next.next;
            }
            node = node.next;
            count += 1;
        }
        return head;
    }

    public static int countTotalElement(ListNode node, int count) {
        if (node == null) {
            return count;
        }
        count += 1;
        return countTotalElement(node.next, count);
    }
}
