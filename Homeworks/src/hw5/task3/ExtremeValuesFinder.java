package hw5.task3;

import java.util.Arrays;

public class ExtremeValuesFinder<T extends Comparable> {

    private T[] array;

    public ExtremeValuesFinder(T[] array) {
        this.array = array;
    }

    public T max() {
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public T min() {
        T min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);


    }
}



