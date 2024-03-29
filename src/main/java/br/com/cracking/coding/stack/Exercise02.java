package br.com.cracking.coding.stack;

import org.junit.jupiter.api.Assertions;

public class Exercise02 {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(3);
        minStack.push(1);
        minStack.push(4);
        minStack.push(5);
        Assertions.assertEquals(1, minStack.getMin());
    }
}
