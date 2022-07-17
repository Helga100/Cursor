package com.company;

public class Task_4 {
    public static void main(String[] args) {

        //  4. Знайти найбільше число в масиві

        int[] array = {750, 80, 6, 33, 140, 890, 40};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }
}
