package testgeneric;

public class MyStack<E> {
    public static final int INITIAL_SIZE = 16;
    private E[] element;
    private int count = 0;

    public MyStack() {
        element = (E[]) new Object[INITIAL_SIZE];
    }

    //Cài đặt phương thức isFull()
    public boolean isFull() {
        if (count == INITIAL_SIZE) {
            return true;
        }
        return false;
    }
    //    Cài đặt phương thức isEmpty()
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    private void ensureCapacity() {
        if (count >= element.length) {
            E[] newElements = (E[]) new Object[element.length *2 + 1];
            System.arraycopy(element, 0, newElements, 0, count);
            element = newElements;
        }
    }
    public void push(E e) {
        ensureCapacity();

        element[count++] = e;
    }
    public E pop() {
        if (count == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        E e = element[count - 1];
        element[count - 1] = null;
        count--;
        return e;
    }
}
