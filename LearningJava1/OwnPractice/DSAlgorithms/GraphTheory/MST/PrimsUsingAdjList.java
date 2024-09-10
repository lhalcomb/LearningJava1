package DSAlgorithms.GraphTheory.MST;
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
    private long minDist;

    //Graph Object that creates the adj list and checks if there is something in graph
    public PrimsUsingAdjList(List<List<Edge>> graph){
        if (graph == null || graph.size() <= 0 ){throw new IllegalArgumentException("Graph is Empty!");}

        this.n = graph.size();
        this.graph = graph;
    }

    public Edge[] getMST(){ //Returns the MStEdges if an MSTExists, null if not
        calculate();
        return mstExist ? mstEdges: null;
    }

    public long getMSTSum(){ //Returns the MSTSum, null if no MSTExists
        calculate();
        return mstExist ? totalWeight: null;
    }
    public long getMSTDist(){
        calculate();
        return mstExist ? minDist : null;
    }

    private void addEdge(int nodeI){ 
        /*adds an edge to the queue from the graph and then sets 
        the visited boolean array to true per index of the vertex and its edges dist */

        visited[nodeI] = true;
        List<Edge> edges = graph.get(nodeI);
        for (Edge e: edges){
            if (!visited[e.to]){
                pq.offer(e);
            }
        }
    }

    private void calculate(){
        if(calculated)  return;
         calculated = true;

         int m = n - 1, edgecount = 0;
         pq = new PriorityQueue<>();
         visited = new boolean[n];
         mstEdges = new Edge[m];

         addEdge(0);

         while(!pq.isEmpty() && edgecount < m){
            Edge edge = pq.poll();
            int nodeI = edge.to; 

            if(visited[nodeI]) continue;

            mstEdges[edgecount++] = edge;
            addEdge(nodeI);
            minDist += edge.dist;

         }

         mstExist = (edgecount == m);
    }

    static List<List<Edge>> createEmpGraph(int n){
        List<List<Edge>> g = new ArrayList<>();
        for (int i = 0; i < n; i++){ g.add(new ArrayList<>());}
        return g;
    }

    static void addDirectedEdge(List<List<Edge>> g, int from, int to, int dist){
        g.get(from).add(new Edge(from, to, dist));

    }

    static void addUndirectedEdge(List<List<Edge>> g, int from, int to, int dist){
        addDirectedEdge(g, from, to, dist);
        addDirectedEdge(g, to, from, dist);
    }

    public static void main(String[] args){
        // Create a graph with the following edges:
        // 0 -> 3, 1-> 2, 2->4, 3->2, 4->5, 5->1, 6->3
        Graph1();
    }
    private static void Graph1(){
        int n = 7;
        List<List<Edge>> g = createEmpGraph(n);

        addUndirectedEdge(g, 0, 3, 3);
        addUndirectedEdge(g, 1, 2, 4);
        addUndirectedEdge(g, 2, 4, 3);
        addUndirectedEdge(g, 3, 2, 1);
        addUndirectedEdge(g, 4, 5, 13);
        addUndirectedEdge(g, 5, 1, 10);
        addUndirectedEdge(g, 6, 3, 21);

        PrimsUsingAdjList calculateList = new PrimsUsingAdjList(g);
        long dist = calculateList.getMSTDist();
        if(dist == -1){
            System.out.println("No MST Exists");

        }else{
            System.out.println("Minimum Spanning Tree Distance: " + dist);
            for (Edge e: calculateList.getMST()){
                System.out.println(String.format("fromCity: %d, toCity: %d, dist: %d", e.from, e.to, e.dist));
            }
        }
    }
}
