package ru.tataev.data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class DataStream {
    public static <T> List<T> of (T...data){
        return List.of(data);
    }
    public static <T, P> List<P> map(List<T> list, Function<T, P> fun) {
        List<P> resList = new ArrayList<>();

        for (T i: list){
            resList.add(fun.apply(i));
        }

        return resList;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> fun) {
        List<T> resList = new ArrayList<>();

        for (T i: list){
            if (fun.test(i)){
                resList.add(i);
            }
        }

        return resList;
    }

    public static <T> T reduce(List<T> list, T init, BinaryOperator<T> fun) {
        T res = init;

        for (T i: list){
                res = fun.apply(res, i);
        }

        return res;
    }

    public static <T, P> P collect(List<T> list, BiConsumer<P, T> fun, Supplier<P> sup) {
        P resCollection = sup.get();

        for (T i: list){
            fun.accept(resCollection, i);
        }

        return resCollection;
    }
}
