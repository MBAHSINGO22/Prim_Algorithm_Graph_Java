package PERTEMUAN11;

import java.util.ArrayList;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');
        graph.addVertex('J');

        graph.addEdge('A', 'B', 5);
        graph.addEdge('A', 'C', 5);
        graph.addEdge('B', 'D', 4);
        graph.addEdge('B', 'E', 9);
        graph.addEdge('C', 'D', 4);
        graph.addEdge('C', 'F', 7);
        graph.addEdge('D', 'E', 8);
        graph.addEdge('D', 'F', 6);
        graph.addEdge('E', 'F', 10);
        graph.addEdge('E', 'G', 10);
        graph.addEdge('E', 'H', 8);
        graph.addEdge('E', 'I', 9);
        graph.addEdge('F', 'G', 3);
        graph.addEdge('G', 'H', 6);
        graph.addEdge('G', 'J', 7);
        graph.addEdge('H', 'I', 4);
        graph.addEdge('H', 'J', 6);
        graph.addEdge('I', 'J', 7);

        int total = 0;
        ArrayList<Edge> edges = graph.getPrimEdges();
        System.out.println("\nPrim Algorithm");
        for (Edge edge : edges) {
            System.out.println(edge);
            total += edge.getWeight();
        }
        System.out.println("Total weight is " + total);
    }
}
