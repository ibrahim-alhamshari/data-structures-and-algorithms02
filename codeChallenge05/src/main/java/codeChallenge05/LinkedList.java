package codeChallenge05;

public class LinkedList {

    public Node head ;
    public Node tail=null;
    public LinkedList() {
        this.head = null;
    }

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


    public String insertBefore( int previusValue, int newValue){ //return a string for the test
    Node newNode = new Node(newValue);
        Node current = this.head;
//        System.out.println(current);
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

   public int append(int value){
        insert(value);
        return value;
   }

    public double insert(int value){ // change the value to an integer and uncomment the return for the test
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

        return 0;
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
