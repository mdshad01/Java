package hw;

import java.util.*;

public class tempCodeRunnerFile {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            src = this.src;
            dest = this.dest;
        }
    }

    public static void topologicalSort1(ArrayList<Edge> graph[]) {
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topSortUtil(graph, i, vis, s);
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
}
