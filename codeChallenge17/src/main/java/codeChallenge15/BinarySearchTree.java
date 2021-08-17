package codeChallenge15;


import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree extends BinaryTree {

    Node root;

    public int add(int value) {

        return addNodeToTree(root, value);
    }

    public boolean contains(int value) {
        System.out.println(findKey(root, value));
        pre_Order(root);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        post_Order(root);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        in_Order(root);
        return findKey(root, value);
    }

    public int findMaxValue() {
        return methodFindMaxValue(root);
    }


    private int addNodeToTree(Node root, int value) {

        if (root == null) {
            this.root = new Node(value);
        } else if (value < root.value) {
            if (root.left != null) {
                addNodeToTree(root.left, value);
            } else {
                root.left = new Node(value);
            }

        } else if (value > root.value) {
            if (root.right != null) {
                addNodeToTree(root.right, value);
            } else {
                root.right = new Node(value);
            }
        }
        return value;
    }

    private boolean findKey(Node root, int value) {

        if (root == null) {
            return false;
        } else if (root.value == value) {
            return true;
        } else if (value < root.value) {
            return findKey(root.left, value);
        }
        return findKey(root.right, value);
    }

    public int methodFindMaxValue(Node root) {
        if (root == null) {
            return -1;
        }

        int result = root.value;
        int liftSide = methodFindMaxValue(root.left);
        int rightSide = methodFindMaxValue( root.right);
        if (liftSide > result){
            return liftSide;
        }else if(rightSide > result){
            return rightSide;
        }
        return result;
    }

    public ArrayList<Integer> traverseLevelOrder(Node tree){

        List<Integer> list = new ArrayList<>();
        List<Node> listOfNodes = new ArrayList<Node>();

        listOfNodes.add(tree);
        while (listOfNodes.size()!=0) {
           Node node= listOfNodes.get(0);
            list.add(node.value);
            listOfNodes.remove(0);

            if(node.left != null){
                listOfNodes.add(node.left);
            }
            if(node.right != null){
                listOfNodes.add(node.right);
            }

            System.out.println(list);

        }
        return (ArrayList<Integer>) list;
    }
}
