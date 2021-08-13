package codeChallenge12;

public class AnimalShelter<T> {

    Queue<T> cat = new Queue<T>();
    Queue<T> dog = new Queue<T>();

    public AnimalShelter(){

    }

    public void enqueue(T animal){
        if(animal instanceof CatClass){
        cat.enqueue(animal);
        }else if (animal instanceof DogClass){
            dog.enqueue(animal);
        }
    }

    public Object dequeue(String pref) {
        if (pref.equals("cat")) {
        return cat.dequeue();
        }else if (pref.equals("dog")){
            return dog.dequeue();
        }
        return null;
    }


    @Override
    public String toString() {
        if (cat.isEmpty()&& dog.isEmpty()){
            return null;
        }
        return "{" +
                "cat_rear= " + cat.rear.value +
                ", dog_rear= " + dog.rear.value +
                '}';
    }
}
