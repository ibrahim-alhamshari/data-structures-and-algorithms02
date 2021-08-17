package codeChallenge18;


import java.util.ArrayList;
import java.util.List;

public class FizzBuzz<T> {

    Node root;

    public List<String> fizzBuzz(Node root){
        List<Node> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        Node newNode= root;
        list.add(root);
        while (list.size() != 0){
            Node<Integer> node = list.get(0);
            if ( ( node.value%3 ==0) && (node.value%5 ==0 )){
                list1.add("FizzBuzz");
            } else if(node.value%5 == 0){
               list1.add("Buzz");
            } else if ( node.value%3 ==0){
                list1.add("Fizz");
            } else {
                list1.add(String.valueOf(node.value));
            }
            list.remove(0);

            if(node.left != null){
             list.add(node.left);
             newNode.left=node.left;
            }

            if (node.right != null){
                list.add(node.right);
                newNode.right=node.right;
            }
        }

        System.out.println("line 62: "+list1);
        return list1;
    }

}
