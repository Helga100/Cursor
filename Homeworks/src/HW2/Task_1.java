package HW2;
import java.util.Arrays;
import java.util.Random;


public class Task_1 {
    public static void main(String[] args) {

        // 1. Створити, а потім заповнити масив випадковими парними числами

        System.out.println("Random even numbers:");
        Random random = new Random();
        int[] array = new int[200];
        for (int i = 0; i < array.length; i++) {
            while (true) {
                int randomEvenNumber = random.nextInt(50);
                if (randomEvenNumber % 2 == 0) {
                    array[i] = randomEvenNumber;
                    break;
                }
            }
        }
        System.out.print(Arrays.toString(array));
    }
}