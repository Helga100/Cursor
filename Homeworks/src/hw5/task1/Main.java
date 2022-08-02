package hw5.task1;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> mylist = new MyList<>();
        mylist.add(47).add(50).add(69).add(143);
        System.out.printf("%s list contains: %s\n max element: %s, min element %s", "Double", mylist, mylist.max(), mylist.min());
    }
}
