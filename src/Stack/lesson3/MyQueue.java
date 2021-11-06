package Stack.lesson3;

import java.util.Arrays;

public class MyQueue<T> {   // очередь.
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;  // значение по умолчанию.
    private int begin;  // начало
    private int end;    // конец

    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(); // пытаемся передать методу не подходящий аргумент.
        }
        list = (T[]) new Object[capacity];
    }

    public MyQueue() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    private int nextIndex(int index) {
        //       if (index + 1 == list.length){
        //           return 0;
        //       }else{
        //           return  index + 1;
        //       }
        return (index + 1) % list.length;
    }

    public void insert(T item) {   // метод добавления, вставка.
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        size++;    // увеличиваем.
        list[end] = item; // list в позицию end добавляем
        end = nextIndex(end);  // двигаем
    }

    public T remove() {
        T temp = peekFront();
        list[begin] = null;
        begin = nextIndex(begin);
        size--;
        return temp;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list[begin];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    @Override
    public String toString() {
        if (isEmpty()){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = begin, j = 0; j < size; i = nextIndex(i), j++) {
            sb.append(list[i]).append(", ");
        }
        sb.setLength(sb.length()-2);
        sb.append("]");
        return sb.toString();
    }
}
