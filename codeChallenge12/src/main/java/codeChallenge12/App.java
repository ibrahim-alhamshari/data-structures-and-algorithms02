/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallenge12;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(7);
        stack.push(5);
        stack.push(3);
        stack.push(1);

        stack.pop();
        stack.peek();
        stack.isEmpty();
//        System.out.println("peek: "+stack.peek());
//        System.out.println("isEmpty: "+stack.isEmpty());
//********************************************************************************************
        System.out.println("*********************************************************");
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(20);
        queue.enqueue(10);
        queue.enqueue(40);
        queue.enqueue(13);
        queue.dequeue();
        queue.peek();
        queue.isEmpty();
//        System.out.println("peek: "+queue.peek());
//        System.out.println("isEmpty: "+queue.isEmpty());
//********************************************************************************************

        pseudoQueue<Integer> pseudoQueue = new pseudoQueue<Integer>();
        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(7);
//        pseudoQueue.dequeue();

//********************************************************************************************
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(new CatClass("BUIRD"));
 stack-queue-animal-shelter
        animalShelter.enqueue(new CatClass("ali"));
        animalShelter.enqueue(new CatClass("koln"));
        animalShelter.enqueue(new DogClass("Butschy"));
        animalShelter.enqueue(new DogClass("Bell"));



        System.out.println(animalShelter.dequeue("dog").toString());
    }
}
