package HW2;

public class Task_7 {
    public static void main(String[] args) {

        //  7. Знайти найбільше парне число в масиві

        int[] array5 = {301, 303, 6, 33, 290, 891, 40};
        int evenMax = Integer.MIN_VALUE;
        boolean isEvenPresent = true;
        for (int i = 0; array5.length > i; i++) {
        if (array5[i] > evenMax && array5[i] % 2 == 0) {
                evenMax = array5[i];
            }
        }
        if (!isEvenPresent) {
            System.out.println("No even numbers");
        } else {
            System.out.println("Maximum even number is: " + evenMax);
        }
    }
}

