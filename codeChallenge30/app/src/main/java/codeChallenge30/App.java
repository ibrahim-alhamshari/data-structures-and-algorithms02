/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallenge30;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        HashTable hashTable = new HashTable();
        hashTable.add("Ibrahim", 8);
        hashTable.add("Ali", 87);
        hashTable.add("kkk", 65);
        hashTable.add("llll", 14);
        hashTable.containsKey("kkkl");
        hashTable.containsKey("Ali");
        hashTable.containsKey("Ibrahim");
        hashTable.containsKey("kkk");
        hashTable.get("Ali");
//        System.out.println(hashTable.get("Ali"));

        String sentence1 = "Once upon a time, there was a brave princess who...";
        String sentence2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String sentence3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        hashTable.repeatedWord(sentence1);


        Node root = new Node(23);
        root.left = new Node(11);
        root.left.left = new Node(6);
        root.right = new Node(31);
        root.right.right = new Node(35);
        root.left.right = new Node(10);

        BinaryTree tree1 = new BinaryTree(root);

        Node root2 = new Node(18);
        root2.left = new Node(11);
        root2.left.left = new Node(7);
        root2.right = new Node(31);
        root2.right.right = new Node(35);
        root2.left.right = new Node(10);
        BinaryTree tree2 = new BinaryTree(root2);

        System.out.println(treeToArrayMethod(tree1, tree2));

    }

    public static ArrayList<String> treeToArrayMethod(BinaryTree tree1, BinaryTree tree2) {

        if (tree1.root == null || tree2.root == null) {
            System.out.println("One of the trees is empty!!");
            return null;
        }

        ArrayList<Integer> tree1Array = tree1.pre_Order(tree1.root);
        ArrayList<Integer> tree2Array = tree2.pre_Order(tree2.root);

        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();

        for (Object oneItem : tree1Array) {
            array1.add(oneItem.toString());
        }

        for (Object oneItem : tree2Array) {
            if (array1.contains(oneItem.toString())) {
                array2.add(oneItem.toString());
            }
        }
        return array2;
    }
}
