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

    public static int carriageTransition = 0;
    public static int[] array = new int[arraySize * arraySize];

    public static int j = array.length - 1;

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

    public static void fillArray() {
        for (; i <= array.length; i++) {
            if (counter < arraySize + 1) {
                array[i] = counter;
                counter++;
            } else if (counter < arraySize * 2) {
                i = i + arraySize - 1;
                array[i] = counter;
                counter++;
            } else if (counter < arraySize * 3 - 1) {
                i = i - 2;
                array[i] = counter;
                counter++;
            } else if (counter < arraySize * 4 - 3) {
                i = i - arraySize - 1;
                array[i] = counter;
                counter++;
            }
//            else if (counter != array.length) {
//                i = carriageTransition + arraySize + 1;
//                carriageTransition = i;
//            }
        }


    }

    public static int a = 0;
    public static int b = 0;
    public static int c = 1;

    public static void fillArray2() {
        for (; i <= array.length; i++) {
            if (counter < arrayLength * (a + 1) - b) {
                array[i] = counter;
                counter++;
                if (counter == (arrayLength * (a + 1) - b)) {
                    b = b + c;
                }
            }
            else if (counter < arrayLength * (a + 2) - b) {
                i = i + arraySize - 1;
                array[i] = counter;
                counter++;
                if (counter == (arrayLength * (a + 2) - b)) {
                    b = b + c;
                }
            }
            else if (counter < arrayLength * (a + 3) - b) {
                i = i - 2;
                array[i] = counter;
                counter++;
                if (counter == (arrayLength * (a + 3) - b)) {
                    b = b + c;
                }
            }
            else if (counter < arrayLength * (a + 4) - (b + c)) {
                i = i - arraySize - 1;
                array[i] = counter;
                counter++;
                if (counter == (arrayLength * (a + 4) - b)) {
                    b = b + c;
                }
            }
            else {
                carriageTransition = carriageTransition + arraySize + 1;
                i = carriageTransition;
                arrayLength = arrayLength - 2;
                a = a + 4;
                c = c + 2;
                fillArray2();
            }
        }
    }

    /**
     * 00 01 02 03 04 05 06 07 08 09    01 02 03 04 05 06 07 08 09 10
     * 10 11 12 13 14 15 16 17 18 19    36 37 38 39 40 41 42 43 44 11
     * 20 21 22 23 24 25 26 27 28 29    35 64 65 66 67 68 69 70 45 12
     * 30 31 32 33 34 35 36 37 38 39    34 63 84 85 86 87 88 71 46 13
     * 40 41 42 43 44 45 46 47 48 49    33 62 83 96 97 98 89 72 47 14
     * 50 51 52 53 54 55 56 57 58 59    32 61 82 95 100 99 90 73 48 15
     * 60 61 62 63 64 65 66 67 68 69    31 60 81 94 93 92 91 74 49 16
     * 70 71 72 73 74 75 76 77 78 79    30 59 80 79 78 77 76 75 50 17
     * 80 81 82 83 84 85 86 87 88 89    29 58 57 56 55 54 53 52 51 18
     * 90 91 92 93 94 95 96 97 98 99    28 27 26 25 24 23 22 21 20 19
     *
     * 00 01 02 03 04
     * 05 06 07 08 09
     * 10 11 12 13 14
     * 15 16 17 18 19
     * 20 21 22 23 24
     */

    public static void index(int arraySize) {
        arrayLength = arraySize * 2;
    }
    /**
     * if (counter < arraySize + 1) {
     *                 i = counter - 1;
     *                 array[i] = counter;
     *                 counter++;
     *             } else if (counter < arraySize * 2) {
     *                 i = i + arraySize - 1;
     *                 array[i] = counter;
     *                 counter++;
     *             } else if (counter < arraySize * 3 - 1){
     *                 i = i - 2;
     *                 array[i] = counter;
     *                 counter++;
     *             } else if (counter < arraySize * 4 - 3) {
     *                 i = i - arraySize - 1;
     *                 array[i] = counter;
     *                 counter++;
     *             }
     */
}
