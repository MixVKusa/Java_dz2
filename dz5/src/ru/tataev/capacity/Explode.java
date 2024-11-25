package ru.tataev.capacity;

public class Explode extends RuntimeException{
    public Explode() {
    }

    public Explode(String message) {
        super(message);
    }
}
