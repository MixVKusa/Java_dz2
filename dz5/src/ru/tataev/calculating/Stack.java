package ru.tataev.calculating;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {
    private List<E> stack = new ArrayList<>();

    public void push(E item) {
        stack.add(item);
    }

    public E pop() {
        if (stack.isEmpty()) {
            throw new StackIsEmpty();
        }
        return stack.removeLast();
    }

    public E peek() {
        if (stack.isEmpty()) {
            throw new StackIsEmpty();
        }
        return stack.getLast();
    }
}
