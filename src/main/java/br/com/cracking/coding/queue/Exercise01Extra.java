package br.com.cracking.coding.queue;

import org.junit.jupiter.api.Assertions;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise01Extra {

    public static void main(String[] args) {
        Exercise01Extra exercise01Extra = new Exercise01Extra();
        int i = exercise01Extra.timeRequiredToBuy(new int[]{2, 3, 2}, 2);
        Assertions.assertEquals(6, i);
    }

    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> aux = new LinkedList<>();
        int result = 0;
        for (int i = 0; i < tickets.length; i++) {
            aux.add(i);
        }

        while (!aux.isEmpty()) {
            int index = aux.remove();
            tickets[index]--;
            result += 1;

            if (tickets[index] == 0 && index == k) {
                return result;
            }

            if (tickets[index] > 0) {
                aux.add(index);
            }
        }
        return result;
    }
}
