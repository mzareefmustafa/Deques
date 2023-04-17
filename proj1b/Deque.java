public interface Deque<T> {
    void addFirst(T item);
    void addLast(T item);
    int size();
    void printDeque();
    T removeFirst();
    T removeLast();
    T get(int index);

    // returns if AList is empty or not by stating true or false
    default boolean isEmpty() {
        return (size() == 0);
    }
}
