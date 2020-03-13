public class MaxHeap implements Heap {
    int size;
    int capacity;
    Integer[] data;

    public MaxHeap(int capacity) {
        data = new Integer[capacity];
        this.capacity = capacity;
        size = 0;
    }

    // build a heap based on data
    // to be implemented in O(nlogn)
    public void MaxHeapLogN(Integer[] data) {
        // homework
        for (int i = 0; i < data.length; i++){
            add(data[i]);
        }
    }

    // build a heap based on data
    // to be implemented in O(n)
    public void MaxHeapN(Integer[] data) {
        // homework
        this.data = data.clone();
        size = data.length;
        int idx = (data.length-1-1)/2;
        for (int i = idx; i >= 0; i--){
            heapifyDown(i);
        }
    }

    // add an item to the heap
    public boolean add(Integer item) {
        // homework
        if (size == capacity){
            return false;
        }
        data[size] = item;
        heapifyUp(size);
        size++;
        return true;
    }

    //helper
    private void heapifyUp(int n){
        if (n != 0 && data[n] > data[(n-1)/2]) {
            swap(n, (n - 1) / 2);
            heapifyUp((n-1)/2);
        }
    }

    //helper
    private void swap(int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    // return the max item in the heap
    public Integer get() {
        // homework
        return data[0];
    }

    // remove the root item
    public Integer pop() {
        // homework
        int result = data[0];
        data[0] = data[size-1];
        size--;
        heapifyDown(0);
        return result;
    }

    //helper
    private void heapifyDown(int n){
        int biggest = n;
        int left = n*2+1; // child of n
        int right = n*2+2; // child of n
        if (left < size && data[left] > data[biggest]) {
            biggest = left;
        }
        if (right < size && data[right] > data[biggest]) {
            biggest = right;
        }
        if (biggest!= n){
            swap(biggest, n);
            heapifyDown(biggest);
        }
    }

    public boolean equal(int[] otherData){
        if (size != otherData.length)
            return false;
        for (int i = 0; i < size; i++){
            if (!data[i].equals(otherData[i]))
                return false;
        }
        return true;
    }

    public boolean equal(Integer[] otherData){
        if (size != otherData.length)
            return false;
        for (int i = 0; i < size; i++){
            if (!data[i].equals(otherData[i]))
                return false;
        }
        return true;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += data[i];

        }
        return str;
    }
}
