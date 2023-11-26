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

public class PrimsAdjList {
    
}
