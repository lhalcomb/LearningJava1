package LearningJava1.OwnPractice.DSAlgorithms.GraphTheory.MST;
import java.util.*;

/*
 * Reference Guide For Understanding the Document
 * We have some parameters denoted as n, pq, g, and visited
 * n = Number of nodes(vertices) in the graph 
 * pq = Priority Queue Data Structure that stores edge objects consisting of 
 *      {start node, end node, edge cost} tuples. 
 *      PQ sorts edges based on min edge cost.
 * g = Graph that represents an adjacency list of weigthed edges. 
 *      Each undirected edge can be seen as two directed 
 *      edges in g. The graph here is not as dense. Therefore, using an adj. list 
 *      is fine. But for any dense graph, use an adjacency matrix instead to improve the performance.
 * visited = [false, ..., false] Boolean array of size n that keeps track of visited nodes in the graph.
 *                               or in programming terms visited[i] tracks whether node i has been visited for size n
 */

public class PrimsUsingAdjList {
    
        static class Edge implements Comparable<Edge>{
            int from, to, dist;

        public Edge(int from, int to, int dist){
            this.from = from; 
            this.to = to;
            this.dist = dist;
        }

        public int compareTo(Edge other){
            return Integer.compare(this.dist, other.dist);
        }
    }
    
    //Inputs for Prims Algorithm

    private final int n; //Number of vertices in graph
    private final List<List<Edge>> graph; //Graph adjacency list given as a 2D list

    //Booleans and Priority Queue
    private boolean calculated; //used to check if the mst is done 
    private boolean mstExist; //used to determine if a mst exist
    private boolean[] visited; // boolean array to keep track of the visited nodes in graph
    private PriorityQueue<Edge> pq; //priority queue used to store minimum weight edges

    //Outputs or what we're looking for
    private long totalWeight; //total weight of MST
    private Edge[] mstEdges; //list of the MST edges and their corresponding weights or dist

    //Graph Object that creates the adj list and checks if there is something in graph
    public PrimsadjList(List<List<Edge>> graph){
        if (graph == null || graph.size() <= 0 ){throw new IllegalArgumentException("Graph is Empty!");}
        this.n = graph.size();
        this.graph = graph;
    }

    
}