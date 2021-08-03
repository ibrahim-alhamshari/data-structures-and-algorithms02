# Singly Linked List
**Linked List - A data structure that contains nodes that links/points to the next node in the list.**

## Challenge

**Creating a Linked List class contain the following methods:**
1. insert method:
- Arguments: value
- Returns: nothing
- Adds a new node with that value to the head of the list with an O(1) Time performance.

2. Includes method
- Arguments: value
- Returns: Boolean
- Indicates whether that value exists as a Node’s value somewhere within the list.

3. To string method
- Arguments: none
- Returns: a string representing all the values in the Linked List, formatted as:
`"{ a } -> { b } -> { c } -> NULL"`

4. Append
- arguments: new value
- adds a new node with the given value to the end of the list.

5. Insert before
- arguments: value, new value
- adds a new node with the given new value immediately before the first node that has the value specified.

6. Insert after
- arguments: value, new value
- adds a new node with the given new value immediately after the first node that has the value specified.

7. kth from end
- argument: a number, k, as a parameter.
- Return the node’s value that is k places from the tail of the linked list.
- You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

8. zip_Lists
- Arguments: 2 linked lists
- Return: Linked List
- Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list.

## Approach & Efficiency
**1. Big O for the Insert**
- Time: O(1)
- Space: O(1)

**2. Big O for the Includes**
- Time: O(n)
- Space: O(1)

**3. Big O for the To string method**
- Time: O(n)
- Space: O(1)

**4. Big O for the Append**
- Time: O(n)
- Space: O(1)

**5. Big O for the Insert before**
- Time: O(n)
- Space: O(1)

**6. Big O for the Insert after**
- Time: O(n)
- Space: O(1)

**7. Big O for the kth from end**
- Time: O(n)
- Space: O(1)

**8. Big O for the zipLists**
- Time: O(n)
- Space: O(1)

## API
1. First method to add a new nodes to the first of my chain.

2. second one: Insure if my linked list have the entered value or not

3. Third one: Read what I have in my linked list.

4. Fourth one: Adds a new node with the given value to the end of the list.

5. Fifth one: Adds a new node with the given new value immediately before the first node that has the value specified.

6. Sixth one: Adds a new node with the given new value immediately after the first node that has the value specified.

7. Give us the node’s value that is k places from the tail of the linked list

8. Zip a two linked lists together into one.