package br.com.cracking.coding.stack;

import java.util.Stack;

public class Exercise05Extra {

    //Example 1               |  Example 2:             |  Example 3:
    //Input: s = "3[a]2[bc]"  |  Input: s = "3[a2[c]]"  |  Input: s = "2[abc]3[cd]ef"
    //Output: "aaabcbc"       |  Output: "accaccacc"    |  Output: "abcabccdcdcdef"
    //------------------------------------------------------------------------------------

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
