package br.com.cracking.coding.linkedlists;

import java.util.HashSet;
import java.util.Set;

public class Exercise07IntersectionTwoLinkedList {

    /**
     * Is Unique: implement as algorithm to determine if a string has all unique
     * unique character. What if you cannot use  additional data structure.
     *
     * <a href="https://leetcode.com/problems/contains-duplicate/">Leetcode</a>
     */

    public static void main(String[] args) {
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        final Set<String> keys = new HashSet<>();

        while (headA != null) {
            keys.add(headA.toString());
            headA = headA.next;
        }

        ListNode node = null;

        while (headB != null) {
            if (keys.contains(headB.toString())) {
                node = headB;
                break;
            }
            headB = headB.next;
        }
        return node;
    }
}
