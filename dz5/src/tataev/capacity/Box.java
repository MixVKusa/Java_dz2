package ru.tataev.capacity;

public class Box<O> {
    private O obj;

    public void setObj(O obj){
        if (this.obj != null) throw new Explode("Babah");
        this.obj = obj;
    }

    public O getObj() {
        O tmp = obj;
        obj = null;
        return tmp;
    }

    public boolean isEmpty(){
        return obj == null;
    }
}
