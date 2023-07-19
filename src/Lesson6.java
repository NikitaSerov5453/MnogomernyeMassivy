import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson6 {
    /**
     * Задание 6
     * Создать квадратный массив размерности n заполненный случайными числами,
     * вывести массив на экран в виде таблицы,
     * найти наименьший и наибольший элемент массива и вывести их на экран
     * (если найдено несколько одинаковых элементов – вывести индексы строки и столбца, где есть повторения).
     * Вывести на экран время выполнения поиска, в миллисекундах.
     * Размерность массива должна задаваться с клавиатуры.
     * @param args
     */
    public static void main(String[] args) {
        fillArray(array);
        printArray(array);
        sortArray(array);
        long startTime = System.nanoTime();
        sortArray(array);
        System.out.println("Минимальное занчение в массиве: " + searchMinValueInArray(array));
        long endTime = System.nanoTime();
        System.out.println((double) (endTime - startTime) / 1000000);
        long startTime1 = System.nanoTime();
        System.out.println("Максимальное занчение в массиве: " + searchMaxValueInArray(array));
        long endTime1 = System.nanoTime();
        System.out.println((double) (endTime1 - startTime) / 1000000);

    }

    public static int arraySize = scanner().nextInt();
    public static int[][] array = new int[arraySize][arraySize];

    public static ArrayList<Integer> arrayListMinValue = new ArrayList<>();
    public static ArrayList<Integer> arrayListMaxValue = new ArrayList<>();

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void printArray(int[][] array) {
        for (int[] a : array) {
            System.out.print(Arrays.toString(a) + "\n");
        }
        System.out.println();
    }

    public static void fillArray(int[][] array) {
        int minValue = -1000;
        int maxValue = 1000;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = random(minValue, maxValue);
            }
        }
    }

    public static int searchMinValueInArray(int[][] array) {
        int minValue = Integer.MAX_VALUE;
        for (int[] ints : array) {
            for (int j = 0; j < 1; j++) {
                if (minValue > ints[j]) {
                    minValue = ints[j];
                }
            }
        }
        return minValue;
    }

    public static int searchMaxValueInArray(int[][] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int[] ints : array) {
            for (int j = array.length - 2; j < array.length; j++) {
                if (maxValue < ints[j]) {
                    maxValue = ints[j];
                }
            }
        }
        return maxValue;
    }

    public static void sortArray(int[][] array) {
        for (int[] ints : array) {
            Arrays.sort(ints);
        }
    }

    public static int random(int minValue, int maxValue) { //рандом в диапазоне минимум/максимум
        return ThreadLocalRandom.current().nextInt(minValue, maxValue);
    }
}
