package codeChallenge15;


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

}
