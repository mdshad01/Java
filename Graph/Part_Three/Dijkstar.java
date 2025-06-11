package Graph.Part_Three;

import java.util.*;

public class Dijkstar {
    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; // path based sorting of my pairs
        }
    }

    // T.C = O(V + E log V)
    public static void dijkstar(ArrayList<Edge>[] graph, int src) {
        int dest[] = new int[graph.length]; // dest[i] = src -> i
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dest[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
            }
            for (int i = 0; i < graph[curr.n].size(); i++) {
                Edge e = graph[curr.n].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if (dest[u] != Integer.MAX_VALUE && dest[u] + wt < dest[v]) { // update distence from src to v
                    dest[v] = dest[u] + wt;
                    pq.add(new Pair(v, dest[v]));
                }
            }
        }
        // print all source to vertices shortest dist
        for (int i = src; i < dest.length; i++) {
            System.out.print(dest[i] + " ");
        }
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        dijkstar(graph, 0);
    }
}
