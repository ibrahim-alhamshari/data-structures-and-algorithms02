package codeChallenge30;

public class Node<K, V> {

    K key;
    V value;
    Node next;

   Node(K key, V value){
        this.value=value;
        this.key=key;
    }

}
