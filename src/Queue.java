public interface Queue {
    void enqueue(int val);
    Item dequeue();
    int size();
}
