import java.util.Scanner;

public class Lesson8 {
    /**
     * Задание 8
     * Заполните n-мерный квадратный массив числами, которые увеличиваются на 1 по спирали (число n должно задаваться с клавиатуры).
     * Выведите результат на экран с соблюдением ширины столбцов. Для примера массив 4 на 4 должен
     * выглядеть как указано в примере.
     * Пример:
     * 01 02 03 04
     * 12 13 14 05
     * 11 16 15 06
     * 10 09 08 07
     * <p>
     * <p>
     * Дополнительно: выполнить задачу с использованием
     * только одного цикла + 1 балл.
     */
    public static void main(String[] args) {
        fillArray2();
        printArray(array, arraySize);
    }

    public static int arraySize = scanner().nextInt();
    public static int counter = 0;
    public static int i = 0;
    public static int a = 0;
    public static int b = 0;
    public static int c = 1;
    public static int cnt = 0;

    public static int carriageTransition = 0;
    public static int[] array = new int[arraySize * arraySize];

    public static int arrayLength = arraySize;

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void printArray(int[] array, int length) {
        int counter = 0;
        for (int i = 0; i < Math.pow(length, 2); i++) {
            if (counter != length - 1) {
                System.out.printf("%02d %s", array[i], "");
                counter++;
            } else {
                System.out.printf("%02d %s", array[i], "\n");
                counter = 0;
            }
        }
    }



    public static void fillArray2() {
        for (; i <= array.length; i++) {
            if (counter < arrayLength * (a + 1) - b) {
                array[i] = counter;
                counter++;
                if (counter == (arrayLength * (a + 1) - b)) {
                    b = b + c;
                }
                if (counter == array.length) {
                    break;
                }

            } else if (counter < arrayLength * (a + 2) - b) {
                i = i + arraySize - 1;
                array[i] = counter;
                counter++;
                if (counter == (arrayLength * (a + 2) - b)) {
                    b = b + c;
                }
                if (counter == array.length) {
                    break;
                }

            } else if (counter < arrayLength * (a + 3) - b) {
                i = i - 2;
                array[i] = counter;
                counter++;
                if (counter == (arrayLength * (a + 3) - b)) {
                    b = b + c;
                }
                if (counter == array.length) {
                    break;
                }

            } else if (counter < arrayLength * (a + 4) - b - 1) {
                i = i - arraySize - 1;
                array[i] = counter;
                counter++;
                if (counter == array.length) {
                    break;
                }

            } else {
                a = a + 4;
                c = c + 2;
                b = b + c;
                carriageTransition += arraySize;
                i = carriageTransition + cnt;
                cnt++;
            }
        }
    }
}
