/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallenge35;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    public void addNewVertex(){
        Graph graph = new Graph();
        Vertex vertex = new Vertex("Ali");

        assertEquals(vertex, graph.addVertex("Ali"));
    }

    @Test
    public void addNewEdge(){
        Graph graph = new Graph();
        graph.addVertex("Osama");
        graph.addVertex("Ali");
        graph.addVertex("Ahmad");
        List<Vertex> list= new ArrayList<>();
        Vertex vertex=new Vertex("Ahmad");
        list.add(vertex);

        assertEquals(list , graph.addEdge("Osama" , "Ahmad") );
    }

    @Test
    public void getAdjVertices(){
        Graph graph = new Graph();
        graph.addVertex("Osama");
        graph.addVertex("Omar");

        Vertex v1 = new Vertex("Osama");
        Vertex v2 = new Vertex("Omar");
       Map<Vertex,  List<Vertex>>  adjVertices = new HashMap<>();

        adjVertices.putIfAbsent(v1, new ArrayList<>());
        adjVertices.putIfAbsent(v2, new ArrayList<>());
//       graph.addEdge("Osama" , "Omar");
//       adjVertices.get(v1).add(v2);
//       adjVertices.get(v2).add(v1);

        assertEquals(adjVertices , graph.getAdjVertices());
    }

    @Test
    public void getNeighbors(){
        Graph graph = new Graph();
        graph.addVertex("Osama");
        graph.addVertex("Omar");

        Vertex v1 = new Vertex("Osama");
        Vertex v2 = new Vertex("Omar");
        Map<Vertex,  List<Vertex>>  adjVertices = new HashMap<>();

        adjVertices.putIfAbsent(v1, new ArrayList<>());
        adjVertices.putIfAbsent(v2, new ArrayList<>());
       graph.addEdge("Osama" , "Omar");

       List<Vertex> list = new ArrayList<>();
       list.add(v2);

        assertEquals(list , graph.getNeighbors(v1));
    }

    @Test
    public void getSize(){
        Graph graph = new Graph();
        graph.addVertex("Osama");
        graph.addVertex("Omar");

        assertEquals( 2, graph.getSize());
    }
}
