package codeChallenge30;

public class ListOfNodes<K, V> {

    K key;
    V value;
    ListOfNodes next;

   ListOfNodes(K key, V value){
        this.value=value;
        this.key=key;
    }

}
