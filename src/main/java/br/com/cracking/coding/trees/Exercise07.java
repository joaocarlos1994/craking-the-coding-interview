package br.com.cracking.coding.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exercise07 {

    public static void main(String[] args) {
        Exercise07 exercise07 = new Exercise07();
        exercise07.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}});
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<Integer>());
        }

        int[] total = new int[numCourses];
        for (int[] values : prerequisites) {
            graph.get(values[1]).add(values[0]);
            total[values[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (total[i] == 0) {
                queue.add(i);
            }
        }

        List<Integer> result = new LinkedList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);
            List<Integer> neighbor = graph.get(node);
            for (int i = 0; i < neighbor.size(); i++) {
                total[neighbor.get(i)]--;
                if (total[neighbor.get(i)] == 0) {
                    queue.add(neighbor.get(i));
                }
            }
        }

        if (result.size() == numCourses) {
            int[] values = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                values[i] = result.get(i);
            }
            return values;
        }
        return new int[]{};
    }
}
