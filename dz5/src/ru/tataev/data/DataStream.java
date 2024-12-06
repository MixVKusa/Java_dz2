package ru.tataev.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.*;

public class DataStream<T> {
    private final List<T> dataList;
    private final List<Object> lambdaList = new ArrayList<>();

    public DataStream(List<T> dataList) {
        this.dataList = dataList;
    }

    public static <V> DataStream<V> of (V...lst){
        return new DataStream<V>(List.of(lst));
    }

    @SuppressWarnings("unchecked")
    public <P> DataStream<P> map(Function<T, P> fun) {
        lambdaList.add(fun);
        return (DataStream<P>)this;
    }

    public DataStream<T> filter(Predicate<T> fun) {
        lambdaList.add(fun);
        return this;
    }

    public T reduce(T init, BinaryOperator<T> fun) throws ClassCastException{
        T res = init;

        for (T i: dataList){
            for (Object j: lambdaList){


            }
                res = fun.apply(res, i);
        }

        return res;
    }

    public <P> P collect(BiConsumer<P, T> fun, Supplier<P> sup) {
        P resCollection = sup.get();

        for (T i: dataList){
            fun.accept(resCollection, i);
        }

        return resCollection;
    }
}
