package hw6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        // 1. Write a Java program to append the specified element to the end of a linked list

        LinkedList<String> colour = new LinkedList<String>();
        colour.add("Red");
        colour.add("Orange");
        colour.add("White");
        colour.add("Green");
        colour.add("Yellow");
        System.out.println(colour);

        // 2. Write a Java program to iterate through all elements in a linked list.
        for (String element : colour) {
            System.out.println(element);
        }
        //3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
//        Iterator p = colour.listIterator(2);
//        while (p.hasNext()){
//           System.out.println("task 3: " + p.next());
        // 4. Write a Java program to iterate a linked list in reverse order.
        Iterator it = colour.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // 5. Write a Java program to insert the specified element at the specified position in the linked list
        colour.add(0, "Purple");
        System.out.println(colour);
        // 6. Write a Java program to insert elements into the linked list at the first and last position.
        colour.addFirst("Black");
        colour.addLast("Grey");
        System.out.println(colour);
        // 7. Write a Java program to insert the specified element at the front of a linked list.
        colour.offerFirst("Blue");
        System.out.println(colour);
        //  8. Write a Java program to insert the specified element at the end of a linked list.
        colour.offerLast("Silver");
        System.out.println(colour);
        // 9. Write a Java program to insert some elements at the specified position into a linked list.
        LinkedList<String> colour2 = new LinkedList<>();
        colour2.add("Brown");
        colour.addAll(3, colour2);
        System.out.println(colour);
        //10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        Object first_element = colour.getFirst();
        Object last_element = colour.getLast();
        System.out.println(first_element);
        System.out.println(last_element);
        // 11. Write a Java program to display the elements and their positions in a linked list.
        for (int i = 0; i < colour.size(); i++) {
            System.out.println("Element at index" + i + ": " + colour.get(i));

        }
        //12. Write a Java program to remove a specified element from a linked list
        colour.remove(4);
        System.out.println(colour);
        //13. Write a Java program to remove first and last element from a linked list.
        colour.removeFirst();
        colour.removeLast();
        System.out.println(colour);
        //14. Write a Java program to remove all the elements from a linked list.
//        colour.clear();
//        System.out.println(colour);
        //15. Write a Java program of swap two elements in a linked list.
        Collections.swap(colour, 0, 7);
        System.out.println(colour);
        //16. Write a Java program to shuffle the elements in a linked list.
        Collections.shuffle(colour);
        System.out.println(colour);
        //17. Write a Java program to join two linked lists.
        List<String> numbers = new LinkedList<>();
        numbers.add("5");
        numbers.add("7");
        numbers.add("14");
        numbers.add("22");
        numbers.add("104");
        List<String> join = new LinkedList<>();
        join.addAll(colour);
        join.addAll(numbers);
        System.out.println(join);
        //18. Write a Java program to clone a linked list to another linked list
        LinkedList<String> clone = new LinkedList<>();
        clone = (LinkedList) colour.clone();
        System.out.println(clone);

        //19. Write a Java program to remove and return the first element of a linked list.
        colour.pop();
        System.out.println(colour);
        //20. Write a Java program to retrieve but does not remove, the first element of a linked list.
        String x = colour.peekFirst();
        System.out.println(x);
        System.out.println(colour);
        //21. Write a Java program to retrieve but does not remove, the last element of a linked list.
        String y = colour.peekLast();
        System.out.println(y);
        System.out.println(colour);
        // 22. Write a Java program to check if a particular element exists in a linked list.
        if (colour.contains("Silver")) {
            System.out.println("Colour exists");
        } else {
            System.out.println("Colour doesn`t exist");
        }
        //23. Write a Java program to convert a linked list to array list
        List<String> list = new ArrayList<>(colour);
        for (String str : list) {
            System.out.println(str);
        }
        // 24. Write a Java program to compare two linked lists.
        LinkedList<String> colour_new = new LinkedList<String>();
        colour_new.add("Red");
        colour_new.add("Orange");
        colour_new.add("White");
        colour_new.add("Green");
        colour_new.add("Yellow");
        System.out.println(colour_new);
        LinkedList<String> colour_last_version = new LinkedList<String>();
        colour_last_version.add("Red");
        colour_last_version.add("White");
        colour_last_version.add("Yellow");
        System.out.println(colour_last_version);
        LinkedList<String> compare = new LinkedList<>();
        for (String s : colour_new)
            compare.add(colour_last_version.contains(s) ? "YES" : "NO");
        System.out.println(compare);
        //25. Write a Java program to test a linked list is empty or not.
        colour_last_version.isEmpty();
        System.out.println(colour_last_version.isEmpty());
        colour_last_version.removeAll(colour_last_version);
        System.out.println(colour_last_version.isEmpty());

        //26. Write a Java program to replace an element in a linked list.
        System.out.println(colour_new);
        colour_new.set(0, "Gold");
        System.out.println(colour_new);

    }
}

