package br.com.cracking.coding.queue;

import org.junit.jupiter.api.Assertions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercise02Extra {

    public static void main(String[] args) {
        Exercise02Extra exercise02Extra = new Exercise02Extra();
        int i = exercise02Extra.countStudents(new int[]{1,1,0,0}, new int[]{0,1,0,1});
        Assertions.assertEquals(0, i);
        int j = exercise02Extra.countStudents(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1});
        Assertions.assertEquals(3, j);
    }

    /**
     * https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/
     * */

    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentsQueue = new LinkedList<Integer>();
        for(int i = 0; i < students.length; i++) {
            studentsQueue.add(students[i]);
        }

        Stack<Integer> sandwichesStack = new Stack<Integer>();
        for (int i = sandwiches.length -1; i >= 0; i--) {
            sandwichesStack.push(sandwiches[i]);
        }

        int count = 0;
        while (!sandwichesStack.isEmpty()) {
            int student = studentsQueue.remove();
            int sandwich = sandwichesStack.peek();

            if (student == sandwich) {
                sandwichesStack.pop();
                count = 0;
            } else {
                studentsQueue.add(student);
                count += 1;
                if (count == studentsQueue.size()) {
                    return count;
                }
            }
        }
        return studentsQueue.size();
    }

}
