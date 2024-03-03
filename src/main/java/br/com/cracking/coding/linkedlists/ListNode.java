package br.com.cracking.coding.linkedlists;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    void appendToTail(int val) {
        ListNode end = new ListNode(val);
        ListNode n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }
}
