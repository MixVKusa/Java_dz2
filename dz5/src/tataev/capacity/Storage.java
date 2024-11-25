package ru.tataev.capacity;

public class Storage<O> {
    private final O safe;
//    private O alt;

    public Storage(O safe) {
        this.safe = safe;
//        this.alt = alt;
    }

    public O getItem() {
        return safe;
    }
    public O getItem(O alt) {
        return safe != null ? safe : alt;
    }
}
