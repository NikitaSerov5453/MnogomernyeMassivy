import java.util.Arrays;
import java.util.Scanner;

public class Lesson9 {
    /**
     * Задание 9
     * Даны числа n и m. Создайте массив размерностью
     * [n][m] и заполните его числами по диагонали, как показано на примере. Выведите результат на экран с соблюдением
     * ширины столбцов.
     * 1 2 4 7
     * 3 5 8 11
     * 6 9 12 15
     * 10 13 16 18
     * 14 17 19 20
     */
    public static void main(String[] args) {
        fillArray(array);
        fillArray2(array, array2);
        printArray(array2);
    }

    public static int arraySizeI = scanner().nextInt();
    public static int arraySizeJ = scanner().nextInt();
    public static int[][] array = new int[arraySizeI][arraySizeJ];
    public static int[][] array2 = new int[arraySizeI][arraySizeJ];
    public static int counter = 1;
    public static int cnt = 0;

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
        for (int i = 0; i < arraySizeI; i++) {
            for (int j = 0; j < arraySizeJ; j++) {
                array[i][j] = i + j;
            }
        }
    }

    public static void fillArray2(int[][] array, int[][] array2) {
        for (int i = 0; i < arraySizeI; i++) {
            for (int j = 0; j < arraySizeJ; j++) {
                if (array[i][j] == cnt) {
                    array2[i][j] = counter;
                    counter++;
                }
                if (arraySizeI - 1 == i && arraySizeJ - 1 == j) {
                    cnt++;
                }
            }
            if (counter == arraySizeI * arraySizeJ + 1) {
                return;
            }
        }
        fillArray2(array, array2);
    }
}
