import java.util.*;

class Graph {
 private Map<String, List<String>> vertices; // Map to store vertices and their corresponding edges
 public Graph() {
 vertices = new HashMap<>();
 }
 // Method to add a vertex to the graph
 public void addingVertex(String vertex) {
 vertices.put(vertex, new ArrayList<>());
 }
 // Method to add an edge between two vertices
 public void addEdge(String src, String dest) {
 if (!vertices.containsKey(src) || !vertices.containsKey(dest)) {
 System.out.println("One or both vertices not found.");
 return;
 }
 String edge = src + "-" + dest; 

 vertices.get(src).add(edge);
 vertices.get(dest).add(edge);
 }
 // Method to get all vertices in the graph
 public Set<String> getVertices() {
 return vertices.keySet();
 }
 // Method to get all edges for a given vertices
 public List<String> getEdges(String vertex) {
 return vertices.get(vertex);
 }
 // Method for displaying the graph
 public void display() {
 for (Map.Entry<String, List<String>> entry : vertices.entrySet()) {
 System.out.print(entry.getKey() +" -> "+"\t");
 for (String edge : entry.getValue()) {
 System.out.print(edge + " ");
 }
 System.out.println();
 }

 }
}
public class Main {
 public static void main(String[] args) {
 Graph graph = new Graph();
 // Adds the vertices
 System.out.println("Vertices"+"\t"+"Edges");
 graph.addingVertex("A");
 graph.addingVertex("B");
 graph.addingVertex("C");
 graph.addingVertex("D");
 graph.addingVertex("E");
 // Add edges between the vertices
 graph.addEdge("A", "B");
 graph.addEdge("B", "C");
 graph.addEdge("C", "D");
 graph.addEdge("D", "E");
 graph.addEdge("E", "A");
 // Displays the graph
 graph.display();

 
 }
}
