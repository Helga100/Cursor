package hw5.task3;

public class Main {
    public static void main(String[] args) {
        ExtremeValuesFinder extremeValuesFinder = new ExtremeValuesFinder(new Integer[]{1, 2, 46, 17});

        System.out.printf("%s list contains: %s\n max element: %s, min element %s", "Integer", extremeValuesFinder, extremeValuesFinder.max(), extremeValuesFinder.min());
    }
}
