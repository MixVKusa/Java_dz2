package ru.tataev.main;

import ru.tataev.capacity.Box;
import ru.tataev.geometry.Line;
import ru.tataev.geometry.Point;
import ru.tataev.geometry.Point3D;

import java.util.List;

public class ParametrizDZ {
    public static void moveStartPointX(Line<? extends Point> line) {
        int x = line.getP1().getX();
        line.getP1().setX(x + (x >= 0 ? 10 : -10));
    }

    public static Double highestBox(Box<? extends Number>... boxes) {
        Double max = null;
        for (Box<? extends Number> i : boxes) {
            if (max != null) {
                Number cur = i.getObj();
                if (max > cur.doubleValue()) {
                    max = cur.doubleValue();
                }
            } else {
                max = i.getObj().doubleValue();
            }
        }
        return max;
    }

    public static void putPoint3DInBox(Box<? super Point3D> box) {
        box.setObj(new Point3D(34, -50, 7));
    }

    public static void fillList(List<? super Integer> list) {
        for (int i = 1; i < 101; i++){
            list.add(i);
        }
    }
}
