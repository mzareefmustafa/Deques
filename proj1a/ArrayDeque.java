public class ArrayDeque<T> {
    private T[] items;
    private int beginning;
    private int ending;
    private int size;

    public ArrayDeque() {
        items = (T[]) new Object[8];
        beginning = 4;
        ending = 5;
        size = 0;
    }
    private void resize(int capacity) {
        T[] a = (T[]) new Object[capacity];
        int i = 0;
        int value = sumOne(beginning);
        while (i < size) {
            a[i] = items[value];
            value = sumOne(value);
            i++;
        }
        items = a;
        beginning = capacity - 1;
        ending = size;
    }
    private int sumOne(int index) {
        return ((index + 1) % items.length);
    }
    private int subtractOne(int index) {
        return ((index + items.length - 1) % items.length);
    }

    private boolean fixSize() {
        return items.length >= 16 && size < (items.length / 4);
    }
    public void addFirst(T item) {
        if (size == items.length) {
            resize(items.length * 2);
        }
        size++;
        items[beginning] = item;
        beginning = subtractOne(beginning);
    }
    public void addLast(T item) {
        if (size == items.length) {
            resize(items.length * 2);
        }
        size++;
        items[ending] = item;
        ending = sumOne(ending);
    }
    // returns if AList is empty or not by stating true or false
    public boolean isEmpty() {
        return (size == 0);
    }
    //returns the current amount of nodes in the AList
    public int size() {
        return size;
    }
    public void printDeque() {
        for (int i = 0; i < size; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }
    public T removeFirst() {
        if (size == 0) {
            return null;
        }
        size--;
        int x = sumOne(beginning);
        beginning = x;
        T value = items[x];
        items[x] = null;
        if (fixSize()) {
            resize(items.length / 2);
        }
        return value;
    }
    public T removeLast() {
        if (size == 0) {
            return null;
        }
        size--;
        int x = subtractOne(ending);
        ending = x;
        T value = items[x];
        items[x] = null;
        if (fixSize()) {
            resize(items.length / 2);
        }
        return value;
    }
    public T get(int index) {
        if (index >= size) {
            return null;
        }
        int newBeginning = sumOne(beginning) + index;
        return items[newBeginning % items.length];
    }
}
