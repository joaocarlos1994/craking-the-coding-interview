package br.com.cracking.coding.linkedlists;

import java.math.BigInteger;

public class Exercise06PalindromeLinkedList {

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
        isPalindrome(l1);
    }

    public static boolean isPalindrome(ListNode head) {
        final StringBuilder a = new StringBuilder();
        isPalindrome(head, a);
        return a.toString().equals(a.reverse().toString());
    }

    public static void isPalindrome(ListNode node, StringBuilder word) {
        if (node == null) {
            return;
        }
        word.append(node.val);
        isPalindrome(node.next, word);
    }
}
