package br.com.cracking.coding.stack;

import java.util.Stack;

public class Exercise04Extra {

    //Example 1            |  Example 2:             |  Example 3:
    //Input: s = "()"      |  Input: s = "()[]{}"    |  Input: s = "(]"
    //Output: true         |  Output: true           |  Output: false
    //----------------------------

    public boolean isValid(String s) {
        final Stack<Character> data = new Stack<Character>();
        for (final char bracket : s.toCharArray()) {
            if (bracket != ')' && bracket != '}' && bracket != ']') {
                data.push(bracket);
                continue;
            }

            if ((bracket == ')' || bracket == '}' || bracket == ']') && !data.isEmpty()) {
                char topBrackets = data.peek();

                if (topBrackets == '(' && bracket == ')') {
                    data.pop();
                    continue;
                }

                if (topBrackets == '{' && bracket == '}') {
                    data.pop();
                    continue;
                }

                if (topBrackets == '[' && bracket == ']') {
                    data.pop();
                    continue;
                }
                data.push(bracket);
            } else {
                return false;
            }
        }
        return data.isEmpty();
    }

}
