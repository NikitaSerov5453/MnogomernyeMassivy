import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson2 {
    /**
     * Задание 2
     * Создать массив из 20 случайных чисел в диапазоне от
     * -10 до 30. Написать программу, определяющую сумму элементов массива, находящихся в массиве после первого отрицательного элемента
     * (первый отрицательный элемент не должен входить в сумму).
     * Вывести на консоль полученный
     * массив и сумму.
     */
    public static void main(String[] args) {
        fillArray(array);
        System.out.println(sumArray(array));
    }

    public static int[] array = new int[20];

    public static void fillArray(int[] array) { //заполнение массива
        int minValue = -10;
        int maxValue = 20;
        for (int i = 0; i < array.length; i++) {
            array[i] = random(minValue, maxValue);
        }
        System.out.println(Arrays.toString(array));
    }

    public static int sumArray(int[] array) { //сумме всех числе массива
        int sumArray = 0;
        for (int i = getIndexFirstNegativeNumber(array) + 1; i < array.length; i++) {
            sumArray += array[i];
        }
        return sumArray;
    }

    public static int getIndexFirstNegativeNumber(int[] array) { //получение индекса первого отрицательного числа
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int random(int minValue, int maxValue) { //рандом в диапазоне минимум/максимум
        return ThreadLocalRandom.current().nextInt(minValue, maxValue);
    }
}
