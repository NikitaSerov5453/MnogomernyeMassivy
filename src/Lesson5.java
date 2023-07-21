import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson5 {
    /**
     * Задание 5
     * Создать массив из 20 случайных чисел в диапазоне от -10
     * до 20. Определить максимальное количество подряд идущих положительных элементов, не прерываемых ни нулями,
     * ни отрицательными числами. Вывести на консоль исходный
     * массив и найденный фрагмент.
     */
    public static void main(String[] args) {
        fillArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(maximumNumberRow(array));
    }

    public static int[] array = new int[20];

    public static int maximumNumberRow(int[] array) {
        int counter = 0;
        int finalCounter = 0;
        for (int j : array) {
            if (j > 0) {
                counter++;

            } else if (counter > finalCounter) {
                finalCounter = counter;
                counter = 0;

            } else {
                counter = 0;
            }
        }
        return finalCounter;
    }

    public static void fillArray(int[] array) { //заполнение массива
        int minValue = -10;
        int maxValue = 20;
        for (int i = 0; i < array.length; i++) {
            array[i] = random(minValue, maxValue);
        }
    }

    public static int random(int minValue, int maxValue) { //рандом в диапазоне минимум/максимум
        return ThreadLocalRandom.current().nextInt(minValue, maxValue);
    }
}
