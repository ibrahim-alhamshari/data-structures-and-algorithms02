package codeChallenge10;

public class Queue<T> {

    public Node<T> front;
    public Node<T> rear;
    public T enqueue(T value){
        Node<T> newValue = new Node<T>(value);
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

    public T dequeue(){

    Node<T> temp = front;

    try {
    front = front.next;
    temp.next = null;
     System.out.println("dequeue: "+ temp.value);
    }catch (NullPointerException e){
        System.out.println("You are pass an empty Queue");
    }
        return temp.value;
    }

    public T peek(){
        try {
            if(front.value != null)
            return front.value;
        }catch (NullPointerException e){
            System.out.println("error, the queue is empty.");
        }
    return null;
    }

    public boolean isEmpty(){
        try {
            if(front.value == null){
                return true;
            }
        }catch (NullPointerException e){
            return true;
        }
        return false;
    }

}
