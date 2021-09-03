# Hashtables
- **Hash-table:** store data in the form of a (key, value) combination. Interestingly every key is unique in a Hash Table but values can repeat which means values can be the same for different keys present in it. Now as we observe in an array to fetch a value we provide the position/index corresponding to the value in that array. In a Hash Table, instead of an index, we use a key to fetch the value corresponding to that key. Now the entire process is described below

## Challenge
- **Implementing these methods**:
1. add
    - Arguments: key, value
    - Returns: nothing
        - This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
2. get
    - Arguments: key
    - Returns: Value associated with that key in the table
3. contains
    - Arguments: key
    - Returns: Boolean, indicating if the key exists in the table already.
4. hash
    - Arguments: key
    - Returns: Index in the collection for that key

## Approach & Efficiency
1. **Big O for add**
    - Time: O(n)
    - Space: O(n)
2. **Big O for get**
    - Time: O(n)
    - Space: O(1)
3. **Big O for contains**
    - Time: O(n)
    - Space: O(1)
4. **Big O for hash**
    - Time: O(1)
    - Space: O(1)
## API
1. add: adding a new pair to the hash table.
2. get: getting a value for a key in the table, and if the key does not have any values it will return false.
3. contain: it will search in the table to check if it contains the targeted key.
4. hash: It will change the value of the key to be hashed.

- See my code [HashTable Code](app/src/main/java/codeChallenge30/HashTable.java)
- See the test code [Test HashTable](app/src/test/java/codeChallenge30/AppTest.java)