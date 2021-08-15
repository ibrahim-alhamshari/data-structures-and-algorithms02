package codeChallenge15;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    List<Integer> postArrayList =new  ArrayList<Integer>();
    List<Integer> preArrayList =new  ArrayList<Integer>();
    List<Integer> intArrayList =new  ArrayList<Integer>();

    public boolean pre_Order(Node root) {
        try {
            if (root != null) {
                System.out.println("pre_Order method: " + root.value);
                pre_Order(root.left);
                pre_Order(root.right);
                return true;
        }
        }catch (AssertionError e){
            System.out.println("error, AssertionError!!");
        }
        return false;
    }


    public boolean in_Order(Node node) {
        try {
            if (node != null) {
                in_Order(node.left);
                System.out.println("in_Order method: " + node.value);
                intArrayList.add(node.value);
                in_Order(node.right);
                return true;
            }
        }catch (AssertionError e){
            System.out.println("error, AssertionError!!");
        }
        return false;
    }


    public List<Integer> post_Order(Node node) {
        try {
            if (node != null) {
                post_Order(node.left);
                post_Order(node.right);
                this.postArrayList.add(node.value);
                System.out.println("post_Order method: " + node.value);
                return postArrayList;
            }
        }catch (AssertionError e){
            System.out.println("error, AssertionError!!");
        }
        return null;
    }

    public List<Integer> getPostArrayList() {
        return postArrayList;
    }

    public void setPostArrayList(List<Integer> postArrayList) {
        this.postArrayList = postArrayList;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "postArrayList=" + postArrayList.toArray() +
                '}';
    }
}
