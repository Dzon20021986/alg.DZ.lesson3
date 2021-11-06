package Stack.lesson3;

import java.util.EmptyStackException;

public class MyStack<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;  // размер стека  по умолчанию.

    public MyStack(int capacity) {  // создает список который имеет начальную емкость.
        if (capacity <= 0) {
            throw new IllegalArgumentException();  // исключение, пытаемся передать не подходящий  аргумент.
        }
        list = (T[]) new Object[DEFAULT_CAPACITY]; // без указания размера.
    }

    public MyStack() {   // без размера.
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void push(T item){     // вставка элемента
        if (isFull()){  // если все полное
            throw new StackOverflowError();   // исключение памяти больше нет.
        }
        list[size]=item;   // если место есть то в место в size мы записываем item.
        size++;  // двигаем.
    }

    public T pop(){   // метод извлекает и удаляет этот элемент
        T temp = peck();
        size--;
        list[size]=null;
        return temp;
    }

    public T peck(){   // метод чтения элемента. peek смотрит на последний элемент при этом не удаляя этом элемент.
        if (isEmpty()){
            throw new EmptyStackException();  // бросаем исключение, если он пустой то смотреть соответственно нечего
        }
        return  list[size -1];
    }

    public int size() {   // сколько элементов  в нашем стеке.
        return size;
    }

    public boolean isEmpty() {   // вспомогательный метод является пустой.
        return size == 0;
    }

    public boolean isFull() {   // вспомогательный метод полный и уже некуда.
        return size == list.length;
    }

    private void reCapacity(int newCapacity){     // метод приватный изменения размера.
        T[] tempArr = (T[])  new Object[newCapacity];  // создали новый массив.
        System.arraycopy(list,0,tempArr,0,size);
        list = tempArr;
    }


}
