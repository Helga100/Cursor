package hw6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        // 1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.

        TreeSet<String> color = new TreeSet<>();
        color.add("White");
        color.add("Black");
        color.add("Pink");
        color.add("Yellow");
        color.add("Orange");
        System.out.println(color);
        //2. Write a Java program to iterate through all elements in a tree set.

        for (String element : color) {
            System.out.println(element);

        }
        //3. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> color1 = new TreeSet<>();
        color1.add("Brown");
        color1.add("Blue");
        color1.add("Grey");
        System.out.println(color1);
        color.addAll(color1);
        System.out.println(color);
        //4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        Iterator it = color.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // 5. Write a Java program to get the first and last elements in a tree set.
        Object first_element = color.first();
        Object last_element = color.last();
        System.out.println("Первый элемент: " + first_element);
        System.out.println("Последний элемент: " + last_element);
        // 6. Write a Java program to clone a tree set list to another tree set.
        TreeSet<String> clone = new TreeSet<String>(color);
        System.out.println(clone);
        //7. Write a Java program to get the number of elements in a tree set.
        System.out.println(color.size());
        //8. Write a Java program to compare two tree sets.
        TreeSet<String> color5 = new TreeSet<>();
        color5.add("White");
        color5.add("Black");
        color5.add("Pink");
        color5.add("Brown");
        color5.add("Yellow");
        for (String element : color) {
            System.out.println(color5.contains(element) ? "Yes" : "No");
        }
        // 9. Write a Java program to find the numbers less than 7 in a tree set
        TreeSet<Integer> number = new TreeSet<>();
        TreeSet<Integer> number1 = new TreeSet<>();
        number.add(29);
        number.add(64);
        number.add(38);
        number.add(700);
        number.add(155);
        number1 = (TreeSet) number.headSet(7);
        Iterator iterator = number1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.

        System.out.println("Больше 30: " + number.ceiling(30));
        System.out.println("Больше 500: " + number.ceiling(500));
        //  11. Write a Java program to get the element in a tree set which is less than or equal to the given element.
        System.out.println("Меньше 30: " + number.floor(30));
        System.out.println("Меньше 500: " + number.floor(500));
        //  12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element
        System.out.println("Больше 38: " + number.higher(38));
        System.out.println("Больше 500: " + number.higher(500));
        // 13. Write a Java program to get an element in a tree set which is strictly less than the given element.
        System.out.println("Строго Меньше 38: " + number.lower(38));
        System.out.println("Строго Меньше 500: " + number.lower(500));
        // 14. Write a Java program to retrieve and remove the first element of a tree set
        System.out.println("Numbers: " + number);
        System.out.println("Numbers retrieved first: " + number.pollFirst());
        System.out.println("Numbers after retrieve: " + number);
        // 15. Write a Java program to retrieve and remove the last element of a tree set.
        System.out.println("Numbers: " + number);
        System.out.println("Numbers retrieved: " + number.pollLast());
        System.out.println("Numbers after retrieve last: " + number);
        // 16. Write a Java program to remove a given element from a tree set.
        System.out.println("Numbers: " + number);
        System.out.println("Numbers 64 removed: " + number.remove(64));
        System.out.println("Numbers after retrieve last: " + number);
    }
}

