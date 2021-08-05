# Stacks and Queues
- Stacks and queues: are special data structures that contain a specific set of rules.

![Stacks and queues](https://4cawmi2va33i3w6dek1d7y1m-wpengine.netdna-ssl.com/wp-content/uploads/2018/07/Computer-science-fundamentals_6.1.png)

- Stacks: is a collection that is based on the **last-in-first-out** (LIFO) policy.
- Queue: It's supports the insert and remove operations using a **first-in first-out** (FIFO) discipline.


## Challenge

1. Creating a Stack class that has a top property. It creates an empty Stack when instantiated. After that applying the following functionality on it:
**push**
- Arguments: value
- adds a new node with that value to the top of the stack with an O(1) Time performance.

**pop**
- Arguments: none
- Returns: the value from node from the top of the stack
- Removes the node from the top of the stack
- Should raise exception when called on empty stack

**peek**
- Arguments: none
- Returns: Value of the node located at the top of the stack
- Should raise exception when called on empty stack

**is empty**
- Arguments: none
- Returns: Boolean indicating whether or not the stack is empty.


2. Create a Queue class that has a front property. It creates an empty Queue when instantiated.  After that applying the following functionality on it:
**enqueue**
- Arguments: value
- adds a new node with that value to the back of the queue with an O(1) Time performance.

**dequeue**
- Arguments: none
- Returns: the value from node from the front of the queue
- Removes the node from the front of the queue
- Should raise exception when called on empty queue

**peek**
- Arguments: none
- Returns: Value of the node located at the front of the queue
- Should raise exception when called on empty stack

**is empty**
- Arguments: none
- Returns: Boolean indicating whether or not the queue is empty


## Approach & Efficiency
1. Big O
- Time: O(n)
- Space: O(1)

2. Big O
- Time: O(n)
- Space: O(1)

## API

1. Stack: This policy allows us to add and remove items at the end without moving any of the other items in the stack. and we can find the last item we added and check if the Stack is impty or not.
2. The Queue used to insert values and to remove it , and you can find the peek and check if the Queue is empty or not.