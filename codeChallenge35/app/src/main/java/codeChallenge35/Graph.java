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

//    public List<Vertex> costOfTrip( Vertex vertex , List cities){
//        List<Vertex> visited  =new ArrayList<>();
//        List<Vertex> listOfVertex = new ArrayList<>();
//        int i=0;
//        int x=cities.size();
//        x=x-1;
//        listOfVertex.add(vertex);
//
//        Vertex c1 = new Vertex((String) cities.get(x));
//
//        while (listOfVertex.size() != 0){
//            visited.add(listOfVertex.get(0));
//            HashMap<Vertex ,Integer> allNeighbors = adjVertices.get(listOfVertex.get(0));
//            listOfVertex.remove(0);
//
//                for (Vertex vertex2 : allNeighbors.keySet()) {
//                    if(c1 == vertex2){
//                        listOfVertex.add(vertex2);
//                        break;
//                    }
//                    if (!visited.contains(vertex2)) {
//
//                        if (vertex2.label == cities.get(x)) {
//                            listOfVertex.add(vertex2);
//                            break;
//                        } else {
//                            listOfVertex.add(vertex2);
//                        }
//                    }
//            }
//
//            if( listOfVertex.contains(c1) ){
//                break;
//            }
//
//        }
//
//        for (int c=0 ; c<listOfVertex.size(); c++){
//            visited.add(listOfVertex.get(c));
//        }
//
//        List list= new ArrayList();
//        int path=0;
//        int o=0;
//        for (int c=0; c<visited.size(); c++){
//        HashMap<Vertex ,Integer> allNeighbors = adjVertices.get(visited.get(c));
//
//
//        if(o!=6){
//            list.add(visited.get(c));
//            for (Vertex vertex1: allNeighbors.keySet()){
//                System.out.println(vertex1);
//                if(vertex1.equals(c1)){
//                    list.add(vertex1);
//                    o=6;
//                    break;
//                }
//            }
//        }
//
//            for (Integer vertex1:allNeighbors.values()){
//                if(o==6){
//                System.out.println(vertex1);
//                path=path+vertex1;
//                break;
//                }else {
//                    path=path+vertex1;
//                    System.out.println("path: "+vertex1);
//                }
//            }
//            if(o==6){
//                break;
//            }
//
//            System.out.println("allN: "+allNeighbors);
//        }
//
//
//
//
//            System.out.println("path f: "+path);
//            System.out.println("list: "+list);
//
//
//        return visited;
//    }





    public void addEdge(String label1, String label2, int weight) {
        Vertex wVertex1 = new Vertex(label1, weight);
        Vertex wVertex2 = new Vertex(label2, weight);

        Vertex vertex1 = new Vertex(label1, weight);
        Vertex vertex2 = new Vertex(label2, weight);

        adjVertices.get(vertex1).add(wVertex2);
        adjVertices.get(vertex2).add(wVertex1);
    }


    private Integer totalCost = 0;
    public Integer businessTrip(Graph graph, List<String> cities){
        totalCost = 0;
        int citiesSize = cities.size();

        for (int i = 0; i < citiesSize; i ++){
            if (i + 1 >= citiesSize){
                break;
            }
            helperTrip(cities.get(i), cities.get(i + 1), graph);
        }

        return totalCost;
    }

    private void helperTrip(String city1, String city2, Graph graph){
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


}
