package codeChallenge10;

public class Stack<T> {

   public Node<T> top;

   public T push(T value){
      Node<T> newNode = new Node<>(value);
      newNode.next= top;
      top = newNode;
//      System.out.println("elements added: "+ newNode.value);
      return newNode.value;
   }

   public T pop(){
      Node<T> temp = top;
      try {
      top = top.next;
      temp.next=null;
//      System.out.println("element removed: "+ temp.value);
         return temp.value;
      }catch (NullPointerException e){
         System.out.println("error, You are pass an empty stack");
      }
      return null;
   }

   public T peek(){
      try {
         if(top.value != null)
      return top.value;
      }catch (NullPointerException e){
         System.out.println("error, the stack is empty.");
      }
      return null;
   }

    public boolean isEmpty(){

      try {
       if(top.value == null){
           return true;
      }
       }catch (NullPointerException e){
         System.out.println(" error");
         return true;
      }
       return false;
   }
}
