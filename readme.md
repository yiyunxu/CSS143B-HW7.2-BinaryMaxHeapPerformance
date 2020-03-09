## Heap ADT (40pt)

### 1. Implement a  (binary) max heap (20pt)

A binary max is a binary tree with two other constraints:

- A binary heap is a complete binary tree, this means all of the levels of the tree are completely filled except possibly the last level. The nodes are filled from left to right.
- A max heap means the value stored in **each** node is greater than or equal to its children

[This](https://medium.com/basecs/learning-to-love-heaps-cef2b273a238) is a great post about heap with lots of love.

In this homework problem we use "heap" to refer to "binary max heap".

Here is an example of a valid heap:

```bash
         60
        /   \
      30    15
     /  \   / \
    2   7  10  3
```

Here is another valid heap:

         60
        /   \
      30    15
     /  \   
    2    7
Implement the following functions for max heap:

```java
    // build a heap based on data
    // to be implemented in O(nlogn)
    public void MaxHeapLogN(Integer[] data) {
        // homework
    }

    // build a heap based on data
    // to be implemented in O(n)
    public void MaxHeapN(Integer[] data) {
        // homework
    }

    // add an item to the heap
    public boolean add(Integer item) {
        // homework
        return false;
    }

    // return the max item in the heap
    public Integer get() {
        // homework
        return null;
    }

    // remove the root item
    public Integer pop() {
        // homework
        return null;
    }
```
[Here](https://en.wikipedia.org/wiki/Binary_heap#Building_a_heap) is a good discussion on the ways to build a heap from an array with both O(nlogn) and O(n) methods.

Add unit tests for all five functions in MaxHeapTest. Note that when comparing heaps, the content of the heap needs to be compared without changing the heap itself (hint: add a .equals() function in the class).

### 2. Write a performance comparison test for MaxHeapN and  MaxHeapLogN (20pt)

Write a performance test code that compare the performance in time of 

```java
    public void MaxHeapLogN(Integer[] data) {
        // homework
    }

    public void MaxHeapN(Integer[] data) {
        // homework
    }
```

Produce a graph that's similar to what we have seen in class for other performance tests. The x-axis is the size of the input data and the y-axis is the time it takes to run the function. Your graph should demonstrate a performance relationsip similarly to the theoratical complexity of one being O(n) and the other being O(nlogn).

 Add your performance test code, data file and graph image to a separate repo. Acceptable format for graph image includes jpeg, png, pdf, etc. Note that ***Microsoft Excel workbook file .xlsx is NOT acceptable as the graph image format***. 
