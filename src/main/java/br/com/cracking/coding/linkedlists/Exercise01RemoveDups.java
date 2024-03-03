package br.com.cracking.coding.linkedlists;

import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise01RemoveDups {

    /**
     * Is Unique: implement as algorithm to determine if a string has all unique
     * unique character. What if you cannot use  additional data structure.
     *
     * <a href="https://leetcode.com/problems/contains-duplicate/">Leetcode</a>
     * */

    public static void main(String[] args) {
        deleteDups(new ListNode(1));
        deleteDups(new ListNode(2));
    }

    public static void deleteDups(ListNode node) {
        Set<Integer> numbers = new HashSet<>();
        ListNode previous = null;
        while (node != null) {
            if (numbers.contains(node.val)) {
                previous.next = node.next;
            } else {
                numbers.add(node.val);
                previous = node;
            }
            node = node.next;
        }
    }
}
