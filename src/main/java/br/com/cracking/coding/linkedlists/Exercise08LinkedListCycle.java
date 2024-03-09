package br.com.cracking.coding.linkedlists;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Exercise08LinkedListCycle {

    /**
     * Is Unique: implement as algorithm to determine if a string has all unique
     * unique character. What if you cannot use  additional data structure.
     *
     * <a href="https://leetcode.com/problems/contains-duplicate/">Leetcode</a>
     */

    public static void main(String[] args) {
    }

    public ListNode detectCycle(ListNode head) {
        List<String> nodes = new LinkedList<String>();
        ListNode aux = head;
        ListNode result = null;
        while (aux != null) {
            if (nodes.contains(aux.toString())) {
                result = aux;
                break;
            }
            nodes.add(aux.toString());
            aux = aux.next;
        }
        return result;
    }
}
