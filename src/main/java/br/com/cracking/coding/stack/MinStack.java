package br.com.cracking.coding.stack;

import java.util.Stack;

class MinStackValue {

    int value;
    int minValue;

    public MinStackValue(final int value, final int minValue) {
        this.value = value;
        this.minValue = minValue;
    }
}

public class MinStack {

    private Stack<MinStackValue> stack;

    public MinStack() {
        this.stack = new Stack<MinStackValue>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new MinStackValue(val, val));
        } else {
            MinStackValue top = stack.peek();
            stack.push(new MinStackValue(val, Math.min(top.minValue, val)));
        }
    }

    public void pop() {
        this.stack.pop();
    }

    public int top() {
        MinStackValue top = stack.peek();
        return top.value;
    }

    public int getMin() {
        MinStackValue top = stack.peek();
        return top.minValue;
    }
}
