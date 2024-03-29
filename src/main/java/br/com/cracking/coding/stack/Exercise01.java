package br.com.cracking.coding.stack;

import org.junit.jupiter.api.Assertions;

public class Exercise01 {

    public static void main(String[] args) throws Exception {
        FixedMultiStack fixedMultiStack = new FixedMultiStack(20);
        fixedMultiStack.push(0, 1);
        fixedMultiStack.push(0, 2);
        Assertions.assertEquals(2, fixedMultiStack.pop(0));
        Assertions.assertEquals(1, fixedMultiStack.peek(0));
    }
}
