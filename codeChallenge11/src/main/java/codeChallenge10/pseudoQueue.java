package codeChallenge10;

public class pseudoQueue<T> {

    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();

    public T enqueue(T value){

       while (! stack1.isEmpty()){
           stack2.push(stack1.pop());
       }

       stack1.push(value);
       while (!stack2.isEmpty()){
           stack1.push(stack2.pop());
       }

       return stack1.peek();
    }

    public int dequeue(){

        if(stack1.isEmpty()){

        return 0;
        }else {
            stack1.pop();
        }
        return (int) stack1.peek();
    }
}
