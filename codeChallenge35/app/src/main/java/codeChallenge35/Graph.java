package codeChallenge35;

import java.util.*;

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
        return (List<Vertex>) adjVertices.get(vertex);
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

    public void addEdge(String label1, String label2, int weight) {
        Vertex wVertex1 = new Vertex(label1, weight);
        Vertex wVertex2 = new Vertex(label2, weight);

        Vertex vertex1 = new Vertex(label1, weight);
        Vertex vertex2 = new Vertex(label2, weight);

        adjVertices.get(vertex1).add(wVertex2);
        adjVertices.get(vertex2).add(wVertex1);
    }


    private int totalCost = 0;
    public int citiesTrip(Graph graph, List<String> cities){
        totalCost = 0;
        if (cities.size() <= 1  ){
            return 0;
        }
        if(graph == null){
            return 0;
        }
        for (int i = 0; i < cities.size()-1; i ++){
            calculatePrice(cities.get(i), cities.get(i + 1), graph);
        }

        return totalCost;
    }

    private void calculatePrice(String city1, String city2, Graph graph){
        Vertex vertex= new Vertex(city1);
        if (graph.getNeighbors(vertex) == null){
            return;
        }

        for (Vertex vertex1: graph.getNeighbors(vertex)) {
            if (Objects.equals(city2, vertex1.label)){
                totalCost += vertex1.weight;
                break;
            }
        }
    }

    List list= new ArrayList();
    public List<Vertex> depthFirst(Vertex vertex){
        if(vertex == null){
            return list;
        }
        list.add(vertex.label);
        System.out.println(vertex);
    List<Vertex> neighborsList = getNeighbors(vertex);
    if (neighborsList.size()==0){
        return list;
    }
        for ( Vertex v: neighborsList) {
            if(!list.contains(v.label))
            depthFirst(v);
        }

        return list;
    }
}
