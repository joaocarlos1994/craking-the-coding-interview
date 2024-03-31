package br.com.cracking.coding.stack;

import org.junit.jupiter.api.Assertions;

public class Exercise04 {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);

        Assertions.assertEquals(1, myQueue.pop());
        Assertions.assertEquals(2, myQueue.pop());
    }
}
