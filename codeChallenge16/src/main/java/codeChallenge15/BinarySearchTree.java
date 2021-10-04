package codeChallenge15;


import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree extends BinaryTree {

    Node root;

    public int add(int value) {

        return addNodeToTree(root, value);
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


    public boolean contains(int value) {
//        System.out.println(findKey(root, value));
        return findKey(root, value);
    }
    private boolean findKey(Node root, int value) {
        if (root == null) {
            return false;
        } else if (root.value == value) {
            return true;
        }

        return findKey(root.left, value) || findKey(root.right, value);
    }


    public int methodFindMaxValue(Node root) {
        if (root == null) {
            return 0;
        }

        int liftSide = methodFindMaxValue(root.left);//12
        int rightSide = methodFindMaxValue(root.right);//17

        int max = root.value;
        System.out.println(max + " " + liftSide);
        if (liftSide > max && liftSide > rightSide) {
            return liftSide;
        } else if (rightSide > max) {
            return rightSide;
        }

        return max;
    }


    public int second() {
        return methodFindSecondMaxValue(this.root);
    }

    public int methodFindSecondMaxValue(Node root) {// breadth first
        List<Node> list = new ArrayList<Node>();
        List<Integer> integerList=new ArrayList<>();

        list.add(root);
        int max = root.value;
        int secondMax = 0;
        while (list.size() != 0) {
            Node node = list.get(0);
            list.remove(0);
            integerList.add(node.value);

            if (node.value > max) {
                secondMax = max;
                max = node.value;
            } else if (node.value > secondMax) secondMax = node.value;

            if (node.left != null) list.add(node.left);
            if (node.right != null) list.add(node.right);
        }
        System.out.println(integerList);
        return secondMax;
    }

    public boolean leafSimilar(Node root1, Node root2) { //Two binary trees are considered leaf-similar if their leaf value sequence is the same.
        if (root1 == null && root2 == null) return true;

        List list1 = new ArrayList();
        List list2 = new ArrayList();

        list1 = helperLeafSimilar(root1, list1);
        list2 = helperLeafSimilar(root2, list2);
        System.out.println(list1 + " " + list2);
        if (list1.equals(list2)) {
            return true;
        }
        return false;
    }

    private List helperLeafSimilar(Node root, List list) {
        if (root == null) return list;
        if (root.left == null && root.right == null) {
            list.add(root.value);
        }
        helperLeafSimilar(root.left, list);
        helperLeafSimilar(root.right, list);
        return list;
    }


// Find the closest leaf in a Binary Tree


    public boolean ifMirror(Node root1, Node root2) {// semantic

        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }

        boolean first = ifMirror(root1.left, root2.right);
        boolean second = ifMirror(root1.right, root2.left);

        return first && second;
    }

    public int getLevelOfaValue(BinarySearchTree tree, int value) {
        Node node = tree.root;
        return helpergetlevel(root, value, 1);
    }

    private int helpergetlevel(Node root, int value, int level) {
        if (root == null) {
            return 0;
        }
        if (root.value == value) {
            return level;
        }

        int level1 = helpergetlevel(root.left, value, level + 1);
        if (level1 != 0) {
            return level1;
        }

        int level2 = helpergetlevel(root.right, value, level + 1);
        return level2;
    }


    public boolean checkIfLeafLevelOddOrEven(Node root) {
        return helperCheck(root, 1);
    }

    private boolean helperCheck(Node root, int level) {
        if (root == null) return true;
        if (root.left == null && root.right == null) {
            if (level % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
        boolean leftSide = helperCheck(root.left, level + 1);
        boolean rightSide = helperCheck(root.right, level + 1);

        return leftSide && rightSide;
    }


    public Node invert(Node root) {
        if (root == null) return null;
        Node nodeLeft = invert(root.left);
        Node nodeRight = invert(root.right);

        root.left = nodeRight;
        root.right = nodeLeft;

        return root;
    }

    void print_tree(Node node)
    {
        if (node == null)
            return;

        print_tree(node.left);
        System.out.print(node.value + " ");

        print_tree(node.right);
    }

    public boolean isSub_Tree(Node main, Node sub) {
        if (sub == null) return true;
        if (main == null) return false;

        if (identical(main, sub)) {
            return true;
        }
        boolean leftSide= isSub_Tree(main.left , sub);//false
        boolean rightSide= isSub_Tree(main.right, sub);//false

        return leftSide || rightSide;
    }
    private boolean identical (Node main, Node sub){
        if(main==null &&  sub==null) return true;

        if(main!=null && sub!=null){
            boolean data=(main.value == sub.value);//true(50)//true(47)
            boolean leftSide= identical(main.left , sub.left);
            boolean rightSide= identical(main.right , sub.right);
            return (data && leftSide && rightSide);
        }
        return false;
    }


    public int sumLeftNodes(Node root) {
        if(root== null) return 0;
        int sum=0;
        sum=helperSumLeftNodes(root , sum , false);
        return sum;
    }

    private int helperSumLeftNodes(Node root, int sum , boolean b) {
        if(root==null) return 0;

        if (root.left==null && root.right==null && b){
            sum=sum+root.value;
            return sum;
        }
        int leftSum=helperSumLeftNodes(root.left , sum, true);
        int rightSum=helperSumLeftNodes(root.right , sum , false);
        return leftSum +rightSum;
    }


    int levelg=0;
    public boolean checkifLeafInTheSameLevel(Node root){
        if(root==null) return true;

        int count=1;

        boolean help= helperSameLevel(root , count, levelg);

        return help;
    }

    private boolean helperSameLevel(Node root, int count, int level) {
        if(root==null) return true;

        if (root.left == null && root.right == null) {
            if (levelg == 0) {
                 levelg = count;
                System.out.println("level: "+levelg);
                System.out.println("count: "+count);
            }
            if (levelg == count) {
                return true;
            } else {
                return false;
            }
        }

        boolean first=helperSameLevel(root.left, count+1, levelg);
        boolean second= helperSameLevel(root.right, count+1, levelg);
        return first && second;
    }


    public boolean pathSum(Node root , int sum){
        if(root==null)return false;

        if(root.left==null && root.right==null && (sum-root.value==0)){
            return true;
        }

        return pathSum(root.left , sum-root.value) || pathSum(root.right , sum-root.value);
}




        public boolean isValidate(Node root) {

        return validate(root , null , null);
        }

        private boolean validate(Node root, Integer max, Integer min) {
            if(root==null)return true;
//            if(root.value> root.left.value && root.value< root.right.value){
//                return true;
//            }
            if((max!=null && max<=root.value) || (min!=null && min<=root.value)){
                return false;
            }

            return validate(root.left, root.value, min)&& validate(root.right, max, root.value);
        }
//******************************************************************************************************

        public boolean identcale(Node root1 , Node root2){
        if(root1==null && root2==null)return true;
        if(root1!=null &&root2!=null){
            boolean data= (root1.value==root2.value);
            boolean leftSide= identcale(root1.left , root2.left);
            boolean rightSide= identcale(root1.right , root2.right);
            return data && leftSide && rightSide;
        }
        return false;
        }
//******************************************************************************************************
private boolean ifMirror(BinarySearchTree tree1 , BinarySearchTree tree2){
        boolean helperIfMirror= helperIfMirror(tree1.root , tree2.root);
        return helperIfMirror;
}

    private boolean helperIfMirror(Node root1, Node root2) {
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;

        boolean leftSide= helperIfMirror(root1.left , root2.right);
        boolean rightSide = helperIfMirror(root1.right , root2.left);
        return leftSide&&rightSide;
    }
//******************************************************************************************************

    private int sumLeftLeaf(Node root){
        if(root==null)return 0;

        int sum=0;
        sum = helperSum(root , sum , false);
        return sum;
    }

    private int helperSum(Node root, int sum, boolean b) {

        if(root==null)return 0;
        if(root.left==null && root.right==null && b){
            sum=sum+root.value;
        }

        int leftSide= helperSum(root.left , sum , true);
        int rightSide= helperSum(root.right , sum, false);
        return leftSide+ rightSide;
    }

    //find the sum of leaves in the left;
    //ones and zeros trees
}
