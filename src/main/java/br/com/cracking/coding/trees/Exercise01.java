package br.com.cracking.coding.trees;

import org.junit.jupiter.api.Assertions;

import java.util.*;

/**
 * Route between Nodes
 * <p>
 * https://leetcode.com/problems/find-if-path-exists-in-graph/description/
 *
 */
public class Exercise01 {

    public static void main(String[] args) {
        Exercise01 exercise01 = new Exercise01();
        int[][] graph = new int[][]{{0, 1}, {1, 2}, {2, 0}};
        boolean result = exercise01.validPath(3, graph, 0, 2);
        Assertions.assertTrue(result);
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);

        Set<Integer> visited = new HashSet<>();
        while (!queue.isEmpty()) {
            Integer node = queue.poll();

            if (node == destination) return true;

            List<Integer> neighbours = graph.get(node);
            for (int i = 0; i < neighbours.size(); i++) {
                Integer neighbour = neighbours.get(i);
                if (!visited.contains(neighbour)) {
                    queue.add(neighbour);
                    visited.add(neighbour);
                }
            }
        }
        return false;
    }
}
