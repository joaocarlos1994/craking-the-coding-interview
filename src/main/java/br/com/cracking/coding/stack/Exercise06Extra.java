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

    public String decodeString(String s) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder aux = new StringBuilder();
        for (final char letter : s.toCharArray()) {
            if (']' == letter) {
                while(!stack.isEmpty() && stack.peek() != '[') {
                    aux.append(stack.pop());
                }

                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                }

                final StringBuilder numbers = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    numbers.append(stack.pop());
                }

                int k = Integer.parseInt(numbers.reverse().toString());
                String reverseString = aux.reverse().toString();
                for (int i = 0; i < k; i++) {
                    for (char c : reverseString.toCharArray()) {
                        stack.push(c);
                    }
                }
                aux = new StringBuilder();
            }
            stack.push(letter);
        }

        final StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            char letter = stack.pop();
            if (Character.isLetter(letter)) {
                result.append(letter);
            }
        }
        return result.reverse().toString();
    }
}
