/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallenge35;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Graph graph = new Graph();
        graph.addVertex("Ibrahim");
        graph.addVertex("Ali");
        graph.addVertex("Ahmad");
        graph.addVertex("Osama");
        graph.addVertex("Omar");

        graph.addEdge("Ibrahim" , "Ali");
        graph.addEdge("Ibrahim" , "Omar");
        graph.addEdge("Osama" , "Ali");
        graph.addEdge("Osama" , "Ahmad");

        Vertex vertex = new Vertex("Ibrahim");
//        System.out.println(graph.getNeighbors(vertex));

        graph.getSize();

        System.out.println(graph.breadthFirst(vertex));
    }
}