package ru.tataev.capacity;

public class Storage<O> {
    private final O safe;
    private O alt;

    public Storage(O safe, O alt) {
        this.safe = safe;
        this.alt = alt;
    }

    public O getItem() {
        return safe != null ? safe : alt;
    }
}
