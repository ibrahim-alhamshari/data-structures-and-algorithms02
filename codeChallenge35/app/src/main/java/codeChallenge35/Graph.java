package codeChallenge35;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private Map<Vertex, List<Vertex>> adjVertices = new HashMap<>();



    public void setAdjVertices(Map<Vertex, List<Vertex>> adjVertices) {
        this.adjVertices = adjVertices;
    }

   public Vertex addVertex(String label) {
        Vertex vertex= new Vertex(label);
        adjVertices.putIfAbsent(vertex, new ArrayList<>());
        return vertex;
    }

   public List<Vertex> addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
        return adjVertices.get(v1);
    }

    public Map<Vertex, List<Vertex>> getAdjVertices() {
        return adjVertices;
    }

    public List<Vertex> getNeighbors(Vertex vertex){
        return adjVertices.get(vertex);
    }

    public int getSize(){
        System.out.println(adjVertices.size());
        return adjVertices.size();
    }


}
