package br.com.cracking.coding.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyQueue {
    private Stack<Integer> queue;

    public MyQueue() {
        this.queue = new Stack<Integer>();
    }

    public void push(int x) {
        if (queue.isEmpty()) {
            this.queue.push(x);
        } else {
            final List<Integer> aux = new ArrayList<>();
            while (!this.queue.isEmpty()) {
                int value = this.queue.pop();
                aux.add(value);
            }
            this.queue.push(x);
            for (int i = aux.size() - 1; i >= 0; i--) {
                this.queue.push(aux.get(i));
            }
        }
    }

    public int pop() {
        return this.queue.pop();
    }

    public int peek() {
        return this.queue.peek();
    }

    public boolean empty() {
        return this.queue.isEmpty();
    }
}
