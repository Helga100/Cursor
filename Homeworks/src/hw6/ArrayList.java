package hw6;

import java.util.Collections;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        // 1.Write a Java program to create a new array list, add some colors (string) and print out the collection

        List<String> color_List = new java.util.ArrayList<>();
        color_List.add("Red");
        color_List.add("Yellow");
        color_List.add("Green");
        color_List.add("Black");
        color_List.add("White");
        System.out.println(color_List);

        //2. Write a Java program to iterate through all elements in a array list.
//        for (String iterate: color_List) {
//            System.out.println(iterate);
//

        //3.Write a Java program to insert an element into the array list at the first position.

        color_List.add(0, "Grey");
        System.out.println(color_List);
        //4.Write a Java program to retrieve an element (at a specified index) from a given array list
        color_List.remove(4);
        System.out.println(color_List);
        //5. Write a Java program to update specific array element by given element
        color_List.set(0, "Pink");
        System.out.println(color_List);
        // 6. Write a Java program to remove the third element from a array list.
        color_List.remove(2);
        //7. Write a Java program to search an element in an array list.
        if (color_List.contains("Green")) {
            System.out.println("Colour is found");
        } else {
            System.out.println("Colour is not found");
        }
        //8. Write a Java program to sort a given array list.
        Collections.sort(color_List);
        System.out.println(color_List);
        //9. Write a Java program to copy one array list into another.
//        List<String> colorList2 = new ArrayList<>();
//        colorList2.add("One");
//        colorList2.add("Two");
//        colorList2.add("Three");
//        colorList2.add("Four");
//        Collections.copy(color_List,colorList2);
//        System.out.println(color_List);
//        System.out.println(colorList2);

        //10. Write a Java program to shuffle elements in an array list.
        Collections.shuffle(color_List);
        //  11. Write a Java program to reverse elements in an array list.
        Collections.reverse(color_List);
        // 12. Write a Java program to extract a portion of an array list.
        List<String> animal_List = new java.util.ArrayList<>();
        animal_List.add("Сow");
        animal_List.add("Pig");
        animal_List.add("Dog");
        animal_List.add("Rabbit");
        animal_List.add("Wolf");
        animal_List.add("Fox");
        System.out.println(animal_List);
//          List<String>animal_Sublist = animal_List.subList(0,2);
//        System.out.println(animal_Sublist);
        //13. Write a Java program to compare two array lists.
        List<String> animal_List2 = new java.util.ArrayList<>();
        animal_List2.add("Сow");
        animal_List2.add("Pig");
        animal_List2.add("Dog");
        List<String> animal_List3 = new java.util.ArrayList<>();
        for (String e : animal_List)
            animal_List3.add(animal_List2.contains(e) ? "Yes" : "No");
        System.out.println(animal_List3);
        //14. Write a Java program of swap two elements in an array list.
        Collections.swap(animal_List, 0, 5);
        System.out.println(animal_List);
        //15. Write a Java program to join two array lists.
        List<String> c3 = new java.util.ArrayList<>();
        c3.addAll(color_List);
        c3.addAll(animal_List);
        System.out.println(c3);
        // 16. Write a Java program to clone an array list to another array list.
        //  ArrayList<String> clone = (List<String>)color_List.clone();
        // 17. Write a Java program to empty an array list.
        c3.removeAll(c3);
        System.out.println(c3);
        // 18. Write a Java program to test an array list is empty or not.
        System.out.println(color_List.isEmpty());
        System.out.println(c3.isEmpty());
        // 19. Write a Java program to trim the capacity of an array list the current list size.
        java.util.ArrayList<String> rainbow = new java.util.ArrayList<>();
        rainbow.add("Red");
        rainbow.add("Yellow");
        rainbow.add("Green");
        rainbow.add("Black");
        rainbow.add("White");
        System.out.println(rainbow);
        rainbow.trimToSize();
        System.out.println(rainbow);
        // 20. Write a Java program to increase the size of an array list.
        rainbow.ensureCapacity(7);
        rainbow.add("Orange");
        rainbow.add("Grey");
        System.out.println(rainbow);
        // 21. Write a Java program to replace the second element of a ArrayList with the specified element.
        String new_colour = "Blue";
        rainbow.set(1, new_colour);
        System.out.println(rainbow);
        //22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
        int a1 = rainbow.size();
        for (int index = 0; index < a1; index++) {
            System.out.println(rainbow.get(index));
        }
    }

}


