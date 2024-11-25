package ru.tataev.calculating;

public class StackIsEmpty extends RuntimeException {
    public StackIsEmpty() {
    }

    public StackIsEmpty(String message) {
        super(message);
    }
}
