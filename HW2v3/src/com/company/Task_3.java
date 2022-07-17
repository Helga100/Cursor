package com.company;

import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {

        //  3. Заповнити масив char випадковими символами

        System.out.println("Random char symbols:");
        Random random = new Random();
        char[] array = new char[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) random.nextInt(200);
            System.out.print(array[i] + " ");
        }
    }
}
