# Trees
- Collection of nodes (starting at a root node), where each node is a data structure consisting of a value, together with a list of references to nodes (the "children"), with the constraints that no reference is duplicated, and none points to the root.

## Challenge

1. **Binary Tree**
> Create a Binary Tree class and define a method for each of the `depth first` traversals:
- pre order
- in order
- post order which returns an array of the values, ordered appropriately.

2. **Binary Search Tree**
> Create a Binary Search Tree class. This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:
- **Add**
- Arguments: value
- Return: nothing
- Adds a new node with that value in the correct location in the binary search tree.

- **Contains**
- Argument: value
- Returns: boolean indicating whether or not the value is in the tree at least once.


## Approach & Efficiency
1. Big O
- Time: O(n)
- Space: O(n)

2. **Big O for Binary Search Tree(Add method)**
- Time: O(n)
- Space: O(n)

3. **Big O for Binary Search Tree(contain method)**
- Time: O(n)
- Space: O(1)

## API

1. Binary Tree: I implemented three methods in this class to traversing a tree to search for a node. I used `Depth First` with it's methods:
- `Pre-order`: root >> left >> right
- `In-order`: left >> root >> right
- `Post-order`: left >> right >> root

2. Binary Search Trees: In this class I emplemented tow methods to add the new nods and to search about a specific value if it in my tree or not: **`Add methd`** , **`Contain method`**

## Here is my code
- [Binary Tree](src/main/java/codeChallenge15/BinaryTree.java)
- [Binary Search Tree](src/main/java/codeChallenge15/BinarySearchTree.java)
