/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallenge15;

import com.sun.source.tree.Tree;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.right = new Node(12);
        root.right.right = new Node(8);
        root.left.right=new Node(10);

        binarySearchTree.traverseLevelOrder( root);
    }
}