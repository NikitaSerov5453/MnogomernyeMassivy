import java.util.Scanner;

public class Lesson8 {
    /**
     * Задание 8
     * Заполните n-мерный квадратный массив числами, которые увеличиваются на 1 по спирали (число n должно задаваться с клавиатуры).
     * Выведите результат на экран с соблюдением ширины столбцов. Для примера массив 4 на 4 должен
     * выглядеть как указано в примере.
     * Пример:
     * 1 2 3 4
     * 12 13 14 5
     * 11 16 15 6
     * 10 9 8 7
     * Дополнительно: выполнить задачу с использованием
     * только одного цикла + 1 балл.
     */
    public static void main(String[] args) {
        fillArray2();
        printArray(array, arraySize);
    }

    public static int arraySize = scanner().nextInt();
    public static int counter = 1;
    public static int i = 0;
    public static int carriageTransition = i;
    public static int[] array = new int[arraySize * arraySize];

    public static int arrayLength = arraySize;

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void printArray(int[] array, int length) {
        int counter = 0;
        for (int i = 0; i < Math.pow(length, 2); i++) {
            if (counter != length - 1) {
                System.out.printf("%02d", array[i]);
                counter++;
            } else {
                System.out.printf("%02d %s",array[i],"\n");
                counter = 0;
            }
        }
    }

    public static void fillArray() {
        for (; i <= array.length; i++) {
            if (counter < arraySize + 1) {
                i = counter - 1;
                array[i] = counter;
                counter++;
            } else if (counter < arraySize * 2) {
                i = i + arraySize - 1;
                array[i] = counter;
                counter++;
            } else if (counter < arraySize * 3 - 1){
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

    public static void fillArray2() {
        for (; i <= arrayLength + 1; i++) {
            if (counter <= arrayLength) {
                i = counter - 1;
                array[i] = counter;
                counter++;
            } else if (counter < arrayLength -) {

            }
        }
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
