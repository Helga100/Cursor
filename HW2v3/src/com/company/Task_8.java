package com.company;

public class Task_8 {
    public static void main(String[] args) {

        //8. Вивести значення в масиві в яких є парні індекси

        System.out.println("Numbers with even indexes:");
        int[] array = {200, 80, 6, 33, 290, 891, 40};
        for (int i = 0; i < array.length; i = i + 2)
            System.out.print(array[i] + " ");
    }
}
