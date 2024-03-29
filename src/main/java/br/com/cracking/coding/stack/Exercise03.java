package br.com.cracking.coding.stack;

import org.junit.jupiter.api.Assertions;

public class Exercise03 {

    public static void main(String[] args) {
        DinnerPlates dinnerPlates = new DinnerPlates(2);
        dinnerPlates.push(1);
        dinnerPlates.push(2);
        dinnerPlates.push(3);
        dinnerPlates.push(4);

        Assertions.assertEquals(2, dinnerPlates.popAtStack(0));
        Assertions.assertEquals(4, dinnerPlates.pop());
    }
}
