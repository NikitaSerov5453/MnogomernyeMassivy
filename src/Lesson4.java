import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson4 {
    /**
     * Задание 4
     * Создать массив из 100 случайных чисел в диапазоне от
     * - 300 до 555. Написать программу, копирующую один массив
     * в другой следующим образом: сначала копируются последовательно все элементы, большие 0, затем последовательно
     * все элементы, равные 0, а затем последовательно все элементы, меньшие 0. Вывести исходный массив. Вывести результирующий массив.
     */
    public static void main(String[] args) {
        fillArray(array);
        copyArrayPositiveNumbers(array, copyArray);
        copyArrayZeroNumbers(array, copyArray);
        copyArrayNegativeNumbers(array, copyArray);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copyArray));
    }

    public static int[] array = new int[100];
    public static int[] copyArray = new int[100];
    public static int counter = 0;

    public static void copyArrayPositiveNumbers(int[] array, int[] copyArray) {
        for (int j : array) {
            if (j > 0) {
                copyArray[counter] = j;
                counter++;
            }
        }
    }

    public static void copyArrayZeroNumbers(int[] array, int[] copyArray) {
        for (int j : array) {
            if (j == 0) {
                copyArray[counter] = j;
                counter++;
            }
        }
    }

    public static void copyArrayNegativeNumbers(int[] array, int[] copyArray) {
        for (int j : array) {
            if (j < 0) {
                copyArray[counter] = j;
                counter++;
            }
        }
    }

    public static void fillArray(int[] array) { //заполнение массива
        int minValue = -300;
        int maxValue = 555;
        for (int i = 0; i < array.length; i++) {
            array[i] = random(minValue, maxValue);
        }
    }

    public static int random(int minValue, int maxValue) { //рандом в диапазоне минимум/максимум
        return ThreadLocalRandom.current().nextInt(minValue, maxValue);
    }
}
