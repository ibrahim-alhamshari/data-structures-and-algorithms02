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
//        System.out.println(adjVertices.size());
        return adjVertices.size();
    }

    public List<Vertex> breadthFirst( Vertex vertex){
        List<Vertex> visited  =new ArrayList<>();
        List<Vertex> listOfVertex = new ArrayList<>();

        listOfVertex.add(vertex);

        while (listOfVertex.size() != 0){
            visited.add(listOfVertex.get(0));
            List<Vertex> allNeighbors = adjVertices.get(listOfVertex.get(0));
            listOfVertex.remove(0);
            System.out.println("allNeighbors: "+allNeighbors);
            for(Vertex vertex2: allNeighbors){
                if(!visited.contains(vertex2)){
                listOfVertex.add(vertex2);
                System.out.println(vertex2);
                }
            }
        }
        return visited;
    }


}
