package br.com.cracking.coding.stack;

import java.util.Stack;

public class Exercise06Extra {

    //Example 1
    //Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
    //Output: true
    //Explanation: We might do the following sequence:
    //push(1), push(2), push(3), push(4),
    //pop() -> 4,
    //push(5),
    //pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
    //------------------------------------------------------------------------------------

    //Example 2
    //Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
    //Output: false
    //Explanation: 1 cannot be popped before 2.

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        for (int pushNumber : pushed) {
            stack.push(pushNumber);
            int popNumber = popped[i];
            if (pushNumber == popNumber) {
                stack.pop();
                i++;
                while (i < popped.length) {
                    if (!stack.isEmpty() && popped[i] == stack.peek()) {
                        stack.pop();
                        i++;
                    } else {
                        break;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
