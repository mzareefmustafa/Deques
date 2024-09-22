public class LinkedListDeque<T> {
    private ThisNode sentinel;
    private int size;
    private class ThisNode {
        private T item;
        private ThisNode prev;
        private ThisNode next;
        private ThisNode(ThisNode prev, T item, ThisNode next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
    /*creates an empty Node*/
    public LinkedListDeque() {
        sentinel = new ThisNode(null, null, null);
        size = 0;
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
    }
    // adds item to the beginning of the LinkedList
    public void addFirst(T item) {
        ThisNode savedNode = new ThisNode(sentinel, item, sentinel.next);
        sentinel.next.prev = savedNode;
        sentinel.next = savedNode;
        size += 1;
    }
    // adds item to the end of the Node
    public void addLast(T item) {
        ThisNode savedNode = new ThisNode(sentinel.prev, item, sentinel);
        sentinel.prev.next = savedNode;
        sentinel.prev = savedNode;
        size += 1;
    }
    // returns if LinkedList is empty or not by stating true or false
    public boolean isEmpty() {
        return (size == 0);
    }
    //returns the current amount of nodes in the LinkedList
    public int size() {
        return size;
    }
    // prints each item in deque with a space between each one.then prints a new line
    public void printDeque() {
        ThisNode activeNode = sentinel.next;
        int num = 0;
        while (num < size) {
            System.out.print(activeNode.item + " ");
            activeNode = activeNode.next;
            num += 1;
        }
        System.out.println(" ");
    }
    public T removeFirst() {
        if (size == 0) {
            return null;
        } else {
            size--;
            T beginning = sentinel.next.item;
            sentinel.next = sentinel.next.next;
            sentinel.next.prev = sentinel;
            return beginning;
        }
    }
    public T removeLast() {
        if (size == 0) {
            return null;
        } else {
            size--;
            T ending = sentinel.prev.item;
            sentinel.prev = sentinel.prev.prev;
            sentinel.prev.next = sentinel;
            return ending;
        }
    }
    public T get(int index) {
        if (index >= size) {
            return null;
        } else {
            int i = 0;
            ThisNode iter = sentinel.next;
            while (i < index) {
                iter = iter.next;
                i++;
            }
            return iter.item;
        }
    }
    private T helper(int num, ThisNode node) {
        if (num == 0) {
            return node.item;
        } else {
            return helper(num - 1, node.next);
        }
    }
    public T getRecursive(int index) {
        if (index > size) {
            return null;
        }
        return helper(index, sentinel.next);
    }
}
