# Graphs
- **A Graph is a non-linear data structure consisting of nodes and edges. The nodes are sometimes also referred to as vertices and the edges are lines or arcs that connect any two nodes in the graph.**

## Challenge
- **mplement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:**

  1. add node
     - Arguments: value
     - Returns: The added node
     Add a node to the graph
  2. add edge
     - Arguments: 2 nodes to be connected by the edge, weight (optional)
     - Returns: nothing
     - Adds a new edge between two nodes in the graph, and if specified, assign a weight to the edge
     - Both nodes should already be in the Graph
  3. get nodes
     - Arguments: none
     - Returns all of the nodes in the graph as a collection (set, list, or similar)
  4. get neighbors
     - Arguments: node
     - Returns a collection of edges connected to the given node
     - Include the weight of the connection in the returned collection
  5. size
     - Arguments: none
     - Returns the total number of nodes in the graph

## Approach & Efficiency
1. **Big O of add Node**
    - Time: O(1)
    - Space: O(n)
2. **Big O of add Edge**
    - Time: O(1)
    - Space: O(1)
3. **Big O of get Nodes**
    - Time: O(1)
    - Space: O(1)
4. **Big O of get neighbors**
    - Time: O(1)
    - Space: O(1)
5. **Big O of size**
    - Time: O(1)
    - Space: O(1)

## API
1. add node: Adding a new vertex to the graph
2. add Edge: Adding an edge between two vertex.
3. get Nodes: get all nodes in the adjVertices list.
4. get neighbors: get all vertexs which are beside the targeted vertex.
5. size: get the size of the adjVertices list.

## Solution
Table of contents | link
--------------- | ---------------
Graph code | [Graph code](app/src/main/java/codeChallenge35/Graph.java)
Test code | [Test code](app/src/test/java/codeChallenge35/AppTest.java)