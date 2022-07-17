package com.company;

public class Task_5 {
    public static void main(String[] args) {

        //  5.Знайти найменше число в масиві

        int[] array3 = {750, 7, 2, 33, 140, 890, 40, -1};
        int min = array3[0];
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < min) {
                min = array3[i];
            }
        }
        System.out.println("Minimum value: " + min);
    }

    public static class Main {

        public static void main(String[] args) {

        }
    }
}
