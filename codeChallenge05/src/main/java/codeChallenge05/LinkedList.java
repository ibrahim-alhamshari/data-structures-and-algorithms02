package codeChallenge05;

public class LinkedList {

    public Node head ;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int value){ // change the value to an integer and uncomment the return for the test
        Node newValue = new Node(value);
        Node current = this.head;

        if(head == null){
            head = newValue;
        }else {
            while (current.next != null){
                current = current.next;
            }
            current.next = newValue;
        }

        //return newValue.value; // uncomment this line for the test.

    }


    public boolean includes(int value){
       Node current= this.head;

        while (current !=null ) {

        if(current.value == value){
            System.out.println("true");
            return true;
        }

        current=current.next;
        }
        System.out.println("false");
        return false;
    }

    public String tostring(){
   Node current= this.head;
   String outPut = "";
   while (current != null){
       outPut = outPut + "{ "+current.value+" } -> ";
       current=current.next;
   }
   outPut=outPut+"NULL";

   return outPut;
    }
}
