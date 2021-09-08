package codeChallenge05;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedList {

    public Node head ;
    public Node tail=null;
    public LinkedList() {
        this.head = null;
    }



   public void delete(int node) {
       if (head == null) {
           return;
       }
       Node current = this.head;
       while (current != null) {
           if (current.next.value == node) {
               current.next = current.next.next;
               break;
           }
           current = current.next;
       }
   }


//********************************************** zip_lists ******************************************************

    public static LinkedList zip_lists(LinkedList list1 ,LinkedList list2){
       LinkedList newList = new LinkedList();
        int count=0;
        Node first = list1.head;
        Node second = list2.head;

        while(first!=null ||second != null){
            if(second == null){
                newList.append(first.value);
                first=first.next;
            }else if(first == null){
                newList.append(second.value);
                second= second.next;
            } else {
                newList.append(first.value);
                newList.append(second.value);
                first=first.next;
                second=second.next;
            }
//            System.out.println("new Linked: "+ newList);
        }
        return newList;
    }

//********************************************** Kth From End ******************************************************

    public Comparable<Integer> kthFromEnd(int k){
        if (head == null ){ return 0;}
        Node first = head;
        Node sec = head;

        try {

            for(int i = 0; i < k; i++){ sec = sec.next; }// to make a difference between the two values equal to the k.
            while (sec.next != null) // loop until the sec.next equal to null, then the first will be located on the (how much difference)
            {
                sec = sec.next;
                first = first.next;
            }
            System.out.println("Output of K: "+first.value);


        }catch(RuntimeException e){
            System.out.println("Error, K is greater than the range of the list.");
            return null;
        }
        return first.value;
    }

//********************************************** insert After Value ******************************************************

    public String insertAfterValue(int previusValue , int newValue){
        Node newNode = new Node(newValue);
        Node current = this.head;
//        System.out.println(current);
        if (head ==null){
        return "";
        }else {
    while (current !=null&& current.value !=previusValue) {
        current=current.next;
    }
        newNode.next=current.next;// make the value after the newNode equal the "current.next" ==> a
        current.next= newNode;// add after the current "newNode"
        }

        String finalValue = "current: "+current.value+" then: "+ newNode.value;
        return finalValue;
    }

//********************************************** insert Before ******************************************************

    public String insertBefore( int previusValue, int newValue){ //return a string for the test
    Node newNode = new Node(newValue);
        Node current = this.head;
        if (head ==null){
            return "";
        }else {
            while (current !=null&& current.next.value !=previusValue) {
                current=current.next;
            }
            newNode.next=current.next;
            current.next= newNode;
        }
        String finalValue = "newNode: "+newNode.value+" then: "+ newNode.next.value;
        System.out.println(finalValue);
        return finalValue;
    }
//********************************************** append ******************************************************

   public int append(int value){
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

       return newValue.value;
   }

//********************************************** insert ******************************************************

    public int insert(int value){ // change the value to an integer and uncomment the return for the test
        Node newValue = new Node(value);
        if (head != null ){
            newValue.next=head;
        }
       head = newValue;
        return newValue.value;
    }

//********************************************** includes ******************************************************
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

//********************************************** to string ****************************************************
    public String tostring(){
   Node current= this.head;
   String outPut = "";
   while (current != null){
       outPut = outPut + "{ "+current.value+" } -> ";
       current=current.next;
   }
   outPut=outPut+"X";

   return outPut;
    }
}
