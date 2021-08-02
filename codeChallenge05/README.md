# Singly Linked List
**Linked List - A data structure that contains nodes that links/points to the next node in the list.**

## Challenge

**Creating a Linked List class contain the following methods:**
1. insert method:
- Arguments: value
- Returns: nothing
- Adds a new node with that value to the head of the list with an O(1) Time performance.

2. includes method
- Arguments: value
- Returns: Boolean
- Indicates whether that value exists as a Node’s value somewhere within the list.

3. to string method
- Arguments: none
- Returns: a string representing all the values in the Linked List, formatted as:
`"{ a } -> { b } -> { c } -> NULL"`

4. append
- arguments: new value
- adds a new node with the given value to the end of the list.

5. insert before
- arguments: value, new value
- adds a new node with the given new value immediately before the first node that has the value specified.

6. insert after
- arguments: value, new value
- adds a new node with the given new value immediately after the first node that has the value specified.

7. kth from end
- argument: a number, k, as a parameter.
- Return the node’s value that is k places from the tail of the linked list.
- You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

## Approach & Efficiency
**Big O**
- Time: O(n)
- Space: O(1)

## API
- First method to add a new nodes to my chain.
- second one: Insure if my linked list have the entered value or not
- Third one: Read what I have in my linked list.
- Fourth one: Adds a new node with the given value to the end of the list.
- Fifth one: Adds a new node with the given new value immediately before the first node that has the value specified.
- Sixth one: Adds a new node with the given new value immediately after the first node that has the value specified.