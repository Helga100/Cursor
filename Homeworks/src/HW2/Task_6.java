package HW2;

public class Task_6 {
    public static void main(String[] args) {

        //   6. Знайти середнє значення суми всіх чисел в масиві

        double[] array = {750.0, 7.0, 2.0, 33.0, 140.0, 890.0, 40.0};
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("AVG: " + sum / array.length);
    }
}
