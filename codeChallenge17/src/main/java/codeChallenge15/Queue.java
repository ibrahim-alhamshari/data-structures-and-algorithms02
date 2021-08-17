package codeChallenge15;

public class Queue<T> {

    public Node front;
    public Node rear;
    public int enqueue(T value){
        Node newValue = new Node((Integer) value);
        if(rear == null){
            rear = newValue;
            front=newValue;
        }else {
            rear.next= newValue;
            rear = newValue;
        }
        System.out.println("values added to enqueue: "+ rear.value);
        return rear.value;
    }

    public Node dequeue(){

        Node temp = front;

        try {
            front = front.next;
            temp.next = null;
//     System.out.println("dequeue: "+ temp.value);
        }catch (NullPointerException e){
            System.out.println("You are pass an empty Queue");
        }
        return temp;
    }

    public Comparable<Integer> peek(){
        try {
            if(Integer.toString(front.value) != null)
                return front.value;
        }catch (NullPointerException e){
            System.out.println("error, the queue is empty.");
        }
        return null;
    }

    public boolean isEmpty(){
        try {
            if(Integer.toString(front.value) == null){
                return true;
            }
        }catch (NullPointerException e){
            return true;
        }
        return false;
    }

}

