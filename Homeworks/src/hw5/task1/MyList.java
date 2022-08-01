package hw5.task1;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {

    List<T> arraylist = new ArrayList<>();

    public MyList<T> add(T t) {
        arraylist.add(t);
        return this;
    }

    public T max() {
        T max = arraylist.get(0);
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i).doubleValue() > max.doubleValue()) {
                max = arraylist.get(i);
            }
        }
        return max;
    }

    public T min() {
        T min = arraylist.get(0);
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i).doubleValue() < min.doubleValue()) {
                min = arraylist.get(i);
            }
        }
        return min;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "arraylist=" + arraylist +
                '}';
    }
}



