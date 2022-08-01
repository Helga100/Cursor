package hw5.task2;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> mylist = new MyList<>();
        MyList<String> mylist1 = new MyList<>();

        mylist.add(47).add(50).add(69).add(143);
        mylist1.add("A").add("B").add("C").add("D");

        System.out.printf("%s list contains: %s\n max element: %s, min element %s\n", "Double", mylist, mylist.max(), mylist.min());
        System.out.printf("%s list contains: %s\n max element: %s, min element %s\n", "String", mylist1, mylist1.max(), mylist1.min());
    }
}
