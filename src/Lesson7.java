import java.util.Arrays;
import java.util.Scanner;

public class Lesson7 {
    /**
     * Задание 7
     * Заполните n-мерный квадратный массив возрастающими
     * числами – змейкой. Выведите результат на экран с соблюдением ширины столбцов
     * Пример:
     * 1 2 3 4
     * 8 7 6 5
     * 9 10 11 12
     * 16 15 14 13
     */
    public static void main(String[] args) {
        fillArray(array);
        printArray(array);
    }

    public static int arraySize = scanner().nextInt();

    public static int[][] array = new int[arraySize][arraySize];

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
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = counter;
                    counter++;
                }
            } else {
                for (int j = array.length - 1; j >= 0; j--) {
                    array[i][j] = counter;
                    counter++;
                }
            }
        }
    }
}
