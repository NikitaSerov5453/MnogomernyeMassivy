import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson3 {
    /**
     * Задание 3
     * Создать массив из 200 случайных чисел в диапазоне от 0 до 200.
     * Определить количество одноразрядных, двухразрядных и трёхразрядных чисел в процентном отношении.
     * Вывести на консоль полученный массив и количество по разрядам.
     * Пример:
     * digit 1 = 4
     * digit 2 = 45
     * digit 3 = 39
     */
    public static void main(String[] args) {
        fillArray(array);
        System.out.println("digit 1 = " + percentages(1, array));
        System.out.println("digit 2 = " + percentages(2, array));
        System.out.println("digit 3 = " + percentages(3, array));
    }

    public static int[] array = new int[200];

    public static void fillArray(int[] array) { //заполнение массива
        int minValue = 0;
        int maxValue = 200;
        for (int i = 0; i < array.length; i++) {
            array[i] = random(minValue, maxValue);
        }
        System.out.println(Arrays.toString(array));
    }

    public static int countingNumbersLength(int numberLength, int[] array) { //подсчет кол-ва одноразрядных чисел в массиве
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (numberLength == countLengthNumber(array[i])) {
                counter++;
            }
        }
        return counter;
    }

    public static int countLengthNumber(int number) { //определение длинны числа
        return String.valueOf(number).length();
    }

    public static double percentages(int numberLength, int[] array) { //подсчет процентного соотношения
        return (double) countingNumbersLength(numberLength, array) / 2;
    }

    public static int random(int minValue, int maxValue) { //рандом в диапазоне минимум/максимум
        return ThreadLocalRandom.current().nextInt(minValue, maxValue);
    }
}
