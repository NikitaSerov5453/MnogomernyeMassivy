import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
     *
     */
    public static void main(String[] args) {
        fillArray(array);
        printArray(array);
        setCopyArray(array, copyArray);
        long startTime = System.nanoTime();
        sortArray(copyArray);
        setMinValue();
        setMaxValue();
        System.out.println("Минимальное занчение в массиве: " + minValue);
        System.out.println("Максимальное занчение в массиве: " + maxValue);
        long endTime = System.nanoTime();
        System.out.println("Время выполнения поиска в миллисекундах: " + (double) (endTime - startTime) / 1000000);
        System.out.println();
        System.out.println("Индексы всех минимальных чисел:");
        printAllValue(array, minValue);
        System.out.println();
        System.out.println("Индексы всех максимальных чисел:");
        printAllValue(array, maxValue);

    }

    public static int arraySize = scanner().nextInt();
    public static int[][] array = new int[arraySize][arraySize];
    public static int[][] copyArray = new int[arraySize][arraySize];
    public static int minValue;
    public static int maxValue;

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void setMinValue() {
        Lesson6.minValue = searchMinValueInArray(copyArray);
    }

    public static void setMaxValue() {
        Lesson6.maxValue = searchMaxValueInArray(copyArray);
    }

    public static void setCopyArray(int[][] array, int[][] copyArray) {
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array[i], 0, copyArray[i], 0, array.length);
        }
    }

    public static void printAllValue(int[][] array, int value) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == value) {
                    System.out.println("строка: " + i + " колонка:" + j);
                }
            }
        }
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
            for (int j = 0; j < array.length; j++) {
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
