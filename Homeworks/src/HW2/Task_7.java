package HW2;

public class Task_7 {
    public static void main(String[] args) {

        //  7. Знайти найбільше парне число в масиві

        int[] array = {301, 303, 6, 33, 290, 891, 40};
        int evenMax = Integer.MIN_VALUE;
        boolean isEvenPresent = false;
        for (int i = 0; array.length > i; i++) {
            if (array[i] > evenMax && array[i] % 2 == 0) {
                evenMax = array[i];
                isEvenPresent = true;
            }
        }
        if (!isEvenPresent) {
            System.out.println("No even numbers");
        } else {
            System.out.println("Maximum even number is: " + evenMax);
        }
    }
}



