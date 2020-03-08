public class MaxHeap implements Heap {
    int capacity;
    int size;

    Item[] data;

    public MaxHeap(int size) {
        this.size = size;
        data = new Item[size];
    }

    // build a heap based on data
    // to be implemented in O(n) instead of O(nlogn)
    public MaxHeap(Item[] data) {
        // homework
    }

    // add an item to the heap
    public boolean add(Item item) {
        // homework
        return false;
    }

    // return the max item in the heap
    public Item get() {
        // homework
        return null;
    }

    // remove the root item
    public Item pop() {
        // homework
        return null;
    }
}
