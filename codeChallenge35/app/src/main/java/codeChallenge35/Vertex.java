package codeChallenge35;

import java.util.Objects;

public class Vertex {
    String label;
    public int weight;

    Vertex(String label){
        this.label = label;
    }

    Vertex(String label, int weight){
        this.label = label;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(label, vertex.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "label='" + label + '\'' +
                '}';
    }
}
