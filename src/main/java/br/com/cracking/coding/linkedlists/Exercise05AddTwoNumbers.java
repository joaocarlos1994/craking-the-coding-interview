package br.com.cracking.coding.linkedlists;

import java.math.BigInteger;

public class Exercise05AddTwoNumbers {

    /**
     * Is Unique: implement as algorithm to determine if a string has all unique
     * unique character. What if you cannot use  additional data structure.
     *
     * <a href="https://leetcode.com/problems/contains-duplicate/">Leetcode</a>
     */

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.appendToTail(4);
        l1.appendToTail(3);

        ListNode l2 = new ListNode(5);
        l2.appendToTail(6);
        l2.appendToTail(4);

        addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder l1StringBuilder = new StringBuilder();
        reverse(l1, l1StringBuilder);
        final BigInteger reverseL1 = new BigInteger(l1StringBuilder.toString());

        StringBuilder l2StringBuilder = new StringBuilder();
        reverse(l2, l2StringBuilder);
        final BigInteger reverseL2 = new BigInteger(l2StringBuilder.toString());

        StringBuilder aux = new StringBuilder();
        aux.append(reverseL1.add(reverseL2));

        ListNode head = new ListNode();
        for (final char number : aux.reverse().toString().toCharArray()) {
            ListNode newNode = new ListNode(Integer.parseInt(new String(new char[]{number})));
            ListNode node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
        return head.next;

    }

    public static void reverse(ListNode node, StringBuilder aux) {
        if (node == null) {
            return;
        }
        reverse(node.next, aux);
        aux.append(node.val);
    }
}
