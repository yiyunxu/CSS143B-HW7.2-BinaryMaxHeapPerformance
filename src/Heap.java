public interface Heap {
    // add an item to the heap
    // return true if added, false if full
    boolean add(Item item);

    // get the max item in the heap
    // return null if not found
    Item get();

    // remove the root item
    // return null if not found
    Item pop();
}
