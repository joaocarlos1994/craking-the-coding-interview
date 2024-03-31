package br.com.cracking.coding.stack;

import org.junit.jupiter.api.Assertions;

import java.util.Stack;

public class Exercise05 {

    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(1);
        integers.push(3);
        integers.push(2);
        integers.push(5);
        integers.push(4);
        Exercise05 exercise05 = new Exercise05();
        exercise05.sortStack(integers);
    }

    public void sortStack(final Stack<Integer> s) {
        Stack<Integer> aux = new Stack<>();
        while (!s.isEmpty()) {
            int tmp = s.pop();
            while (!aux.isEmpty() && aux.peek() > tmp) {
                s.push(aux.pop());
            }
            aux.push(tmp);
        }

        while (!aux.isEmpty()) {
            s.push(aux.pop());
        }
    }
}
