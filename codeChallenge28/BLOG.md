### *QuickSort:* is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot.

<br>

![BLOG](BLOG.png)

<br>

### **Trace Process**

* **Input: [8,4,23,42,16,15]**
    * **Pass 1**: Make the pivot number is the last one (15) and compaire all the elements with it, the lower numbers will be befor it and the upper numbers will be after it. Then the array will become: [8, 4, **15**, 42, 16, 23]

    * **Pass 2**: The numbers before it(15) will be sorted: 4<8 ==> [4, 8, 15, 42, 16, 23]

    * **Pass 3**: Make a pivot number again which will be the last number(23), and again the lower numbers will be moved befor it, abd the greater numbers will be move after it. Then the array will become: [4, 8, 15, 16, **23**, 42]

    * **Pass 4**: Again, the numbers befor it(23) will be sorted, but the sorting will begin from the last pivot which was(15), so it will not touch the numbers befor (5). Then the sorting will begin with: (16). No numbers to compaire so it will be by default sorted and the array will become: [4, 8, 15, 16 , 23, 42]

    * **Pass 5**: We reached to the sorted array which we were aim.
- **OutPut: [4, 8, 15, 16 , 23, 42]**

