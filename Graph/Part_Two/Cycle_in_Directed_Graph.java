package Graph.Part_Two;

import java.util.*;

public class Cycle_in_Directed_Graph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));
    }

    public static boolean isCycle(ArrayList<Edge>[] graph) { // T.C = O(V+E)
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (isCycleUtil(graph, i, vis, stack)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest]) {
                return true;
            }
            if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(isCycle(graph));

    }
}
