package codeChallenge30;

import java.util.ArrayList;

public class BinaryTree {

    public Node root;
    public ArrayList<Integer> listOfNodeValues = new ArrayList<>();
    
    public BinaryTree(){}
    public BinaryTree(Node root){
        this.root=root;
    }

    public ArrayList pre_Order(Node root) {
        try {
            if (root != null) {
                listOfNodeValues.add(root.value);
                pre_Order(root.left);
                pre_Order(root.right);
                return listOfNodeValues;
            }
        }catch (AssertionError e){
            System.out.println("error, AssertionError!!");
        }
        return null;
    }
}
