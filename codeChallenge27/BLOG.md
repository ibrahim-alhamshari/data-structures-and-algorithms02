### *Merge Sort:* It is a Dividing algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves. The merge() function is used for merging two halves. The merge(arr, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one.

<br>

![Blog Image](blogImage.png)
 

 * The array [8, 4, 23, 42, 16, 15] will be divided into two halves.
    * [8, 4 , 23]
        * This half will be into two halfs again.
             - first half [8]
             - second half [4, 23]
                 * This will be split into two halfs again
        [4] & [23]
    * [42, 16, 15]
        - This half will be split again.
             * first half [42]
             * second half [16, 15]
                - This will be split into two halfs again [16] & [15]

* Now, each part will be sorted, and we will merge them together again.
    - [4], [23] ->  [4, 23]
        - [4, 23], [8] ->  [4, 8, 23]

    - [15], [16] ->  [15, 16]
        - [15, 16], [42] ->  [15, 16, 42]

    - **[4, 8, 23],  [15, 16, 42] -> [4, 8, 15, 16, 23, 42]** 
           
### Output: [4, 8, 15, 16, 23, 42]          
