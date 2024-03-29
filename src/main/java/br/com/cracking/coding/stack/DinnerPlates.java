package br.com.cracking.coding.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class DinnerPlates {

    List<Stack<Integer>> stacks;
    TreeSet<Integer> availableStack;
    int capacity;

    public DinnerPlates(final int capacity) {
        this.stacks = new ArrayList<>();
        this.capacity = capacity;
        this.availableStack = new TreeSet<>();
    }

    public void push(final int val) {
        if (availableStack.isEmpty()) {
            stacks.add(new Stack<>());
            availableStack.add(stacks.size() - 1);
        }

        Stack<Integer> firstStackWithSpace = stacks.get(availableStack.first());
        firstStackWithSpace.push(val);

        if (firstStackWithSpace.size() == capacity) {
            availableStack.pollFirst();
        }
    }

    public int pop() {
        if (stacks.isEmpty()) {
            return -1;
        }
        int val = stacks.get(stacks.size() - 1).pop();
        availableStack.add(stacks.size() - 1);
        while (!stacks.isEmpty() && stacks.get(stacks.size() - 1).isEmpty()) {
            stacks.remove(stacks.size() - 1);
            availableStack.pollLast();
        }
        return val;
    }

    public int popAtStack(int index) {
        if (index >= stacks.size()) {
            return -1;
        }
        if (index == stacks.size() - 1) {
            return pop();
        }
        Stack<Integer> requiredStack = stacks.get(index);
        int val = requiredStack.isEmpty() ? -1 : requiredStack.pop();
        availableStack.add(index);
        return val;
    }
}
