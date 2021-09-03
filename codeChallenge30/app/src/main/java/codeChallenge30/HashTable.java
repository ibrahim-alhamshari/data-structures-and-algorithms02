package codeChallenge30;


import java.util.Objects;

public class HashTable {

    private Node[] table; // The hash table, represented as an array of linked lists.
    private int count;
    private int size=1; // The number of (key,value) pairs in the hash table.

    public HashTable(){
        table= new Node[size];
    }

    public int hashCode(String key){
        return Objects.hashCode(key);
    }

    public int getIndex(String key){
    int hashCode = hashCode(key);
    int index = hashCode % table.length;
    index = index <0 ? (index * -1) : index;
    return index;
    }

    public void add(String key, int value){
    int index = getIndex(key);
    int hashCode= hashCode(key);

    Node head = table[index]; // For traversing the linked list at the appropriate location.
        while (head != null){
            if(head.key.equals(key))
                break;
            head= head.next;
        }

        if(head != null){
            head.value=value;
        }else {
            if(count >= 0.75*table.length){
                resize();
                index = getIndex(key);
            }

            Node newNode = new Node(key , value);
            newNode.next=table[index];
            table[index]= newNode;
            count++;
        }
    }

    public void resize(){
     Node[] newTable = new Node[table.length+1];

     for(int i =0; i< table.length;i++){
         Node list = table[i]; //[0] ==> [1 => 2 => 3]
         while (list != null){
             Node current = list.next;
             int hash = (Math.abs(list.key.hashCode())) % newTable.length;
             list.next=newTable[hash];
             newTable[hash] = list;
             list= current;
         }
     }
     table = newTable;
    }

    public Comparable<Integer> get(String key){
        int index = getIndex(key);
        Node list = table[index];
        while (list!= null){
            if (list.key.equals(key)){
                return (int) list.value;
            }
            list=list.next;
        }
        return null;
    }

    public boolean containsKey(String key) {
        int index = getIndex(key);  // In what location should key be?
        Node list = table[index];  // For traversing the list.

        while (list != null) {
            if (list.key.equals(key)){
                System.out.println(true);
                return true;
            }
            list = list.next; //[0] ==> [1 => 2 => 3]
        }
        // If we get to this point, we know that the key does not exist in the table.
        System.out.println(false);
        return false;
    }

}
