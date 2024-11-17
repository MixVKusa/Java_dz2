package ru.tataev.main;

import ru.tataev.animals.Bird;
import ru.tataev.animals.Meowable;
import ru.tataev.geometry.Broken;
import ru.tataev.geometry.Figure;
import ru.tataev.geometry.Lengthable;
import ru.tataev.geometry.PolyLine;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class PolymorphDZ {
    public static double doubleSum(Number...nums){
        double sum = 0;
        for (int i = 0; i < nums.length; i++){
             sum += nums[i].doubleValue();
        }
        return sum;
    }

    public static void singBird(Bird...birds){
        for (Bird i: birds){
            i.sing();
        }
    }

    public static double sumSquare(Figure...figures){
        double sum = 0;
        for (Figure i: figures){
            sum += i.square();
        }
        return sum;
    }

    public static void meow(Meowable...meows) {
        for (Meowable i: meows){
            i.meow();
        }
    }

    public static double sumLength(Lengthable...lines){
        double sum = 0;
        for (Lengthable i: lines){
            sum += i.len();
        }
        return sum;
    }

    public static Broken createBroken(PolyLine...polyLines) {
        Broken line = new Broken();
        for (PolyLine i: polyLines){
            line.add(i.toBroken().getLine());
        }
        return line;
    }

    public static double power(String x, String y){
        return pow(parseInt(x), parseInt(y));
    }
}
