package codeChallenge12;

public class AnimalShelter<Dog, Cat ,T> {

    Queue<Cat> cat = new Queue<Cat>();
    Queue<Dog> dog = new Queue<Dog>();

    public AnimalShelter(){

    }

    public void enqueue(T animal){
        cat.enqueue((Cat) animal);
        System.out.println("cat.front.value: "+ cat.rear.value);
    }


    @Override
    public String toString() {
        return "AnimalShelter{" +
                "cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
