package hw6;

import java.util.*;
import java.util.ArrayList;

public class HashSet1 {
    public static void main(String[] args) {
        //1. Write a Java program to append the specified element to the end of a hash set.

        HashSet<String> colours = new HashSet<>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("White");
        System.out.println(colours);

        //2. Write a Java program to iterate through all elements in a hash list.
        Iterator<String> iterator = colours.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // 3. Write a Java program to get the number of elements in a hash set.
        System.out.println(colours.size());
        colours.removeAll(colours);
        System.out.println(colours);
        // 5. Write a Java program to test a hash set is empty or not.
        System.out.println(colours.isEmpty());
        //6. Write a Java program to clone a hash set to another hash set.
        HashSet<String> colours2 = new HashSet<>();
        colours2.add("Red");
        colours2.add("Green");
        colours2.add("Blue");
        colours2.add("White");
        HashSet<String> colours3 = new HashSet<>();
        colours3 = (HashSet) colours2.clone();
        System.out.println(colours3);

        // 7. Write a Java program to convert a hash set to an array.
        String[] new_array = new String[colours3.size()];
        colours3.toArray(new_array);
        System.out.println("Array elements: ");
        for (String element : new_array) {
            System.out.println(element);
        }
        // 8. Write a Java program to convert a hash set to a tree set.
        HashSet<String> color = new HashSet<>();
        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("White");
        TreeSet<String> tree_set = new TreeSet<String>(color);
        System.out.println("TreeSet: ");
        for (String element : tree_set) {
            System.out.println(element);

        }
        // 9. Write a Java program to convert a hash set to a List/ArrayList.
        HashSet<String> color1 = new HashSet<>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Blue");
        color1.add("White");
        System.out.println(color1);

        List<String> array_list = new ArrayList<String>(color1);
        System.out.println(array_list);
        //10. Write a Java program to compare two hash set.
        HashSet<String> color2 = new HashSet<>();
        color2.add("Red");
        color2.add("Green");
        color2.add("Blue");
        color2.add("White");
        System.out.println(color2);
        HashSet<String> color3 = new HashSet<>();
        color3.add("Red");
        color3.add("Green");
        color3.add("Blue");

        for (String element : color2) {
            System.out.println(color3.contains(element) ? "Yes" : "No");

        }
        // 11. Write a Java program to compare two sets and retain elements which are same on both sets.
        color2.retainAll(color3);
        System.out.println(color2);
        //12. Write a Java program to remove all the elements from a hash set.
        color2.clear();
        System.out.println(color2);
    }
}
