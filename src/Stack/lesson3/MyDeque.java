package Stack.lesson3;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    //0 1 2 3 4
    //  b
    //    e
    //  7

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new RuntimeException("Deque is full");
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertRight(T item) {
        if (isFull()) {
            throw new RuntimeException("Deque is full");
        }
        size++;
        begin = prevIndex(begin);
        list[begin] = item;
    }

    public T removeRight() {
        T temp = peekRight();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T removeLeft() {
        T temp = peekLeft();
        size--;
        end = prevIndex(end);
        list[end] = null;
        return temp;
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list[begin];
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list[prevIndex(end)];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int prevIndex(int index) {
        return (list.length + index - 1) % list.length;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = begin; i != end; i = nextIndex(i)) {
            sb.append(list[i]).append(", ");
        }
        if (sb.length() == 0) {
            sb.append("[]");
        } else {
            sb.insert(0, "[");
            sb.setLength(sb.length() - 2);
            sb.append("]");
        }
        return sb.toString();
    }
}
