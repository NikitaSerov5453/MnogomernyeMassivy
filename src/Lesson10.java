import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson10 {
    /**
     * Задание 10
     * В кинотеатре n рядов по m мест в каждом (m и n должно
     * задаваться с клавиатуры). В двумерном массиве размерностью m на n хранится информация о проданных билетах.
     * Число 1 означает, что билет на данное место уже продан,
     * число 0 означает, что место свободно. Поступил запрос на
     * продажу k билетов на соседние места в одном ряду (k должно
     * задаваться с клавиатуры).
     * Определите, можно ли выполнить такой запрос. Если решения есть, вывести номера рядов и номера свободных мест
     * для продажи.
     * Число занятых мест и какие места заняты на момент запроса определите случайным образом.
     * Вывести исходный массив на экран.
     */
    public static void main(String[] args) {
        cinemaHall[0][1] = 1;
        cinemaHall[0][2] = 1;
        cinemaHall[3][2] = 1;
        cinemaHall[0][5] = 1;
        cinemaHall[2][4] = 1;
        printArray(cinemaHall);
        searchAvailableSeats(cinemaHall, buySeats());


    }

    public static int rows = scanner().nextInt();
    public static int lengthRows = scanner().nextInt();
    public static int[][] cinemaHall = new int[rows][lengthRows];
    public static ArrayList<Integer> firstIndexArray = new ArrayList<>();
    public static ArrayList<Integer> lastIndexArray = new ArrayList<>();


    public static void printArray(int[][] array) {
        for (int[] a : array) {
            System.out.print(Arrays.toString(a) + "\n");
        }
        System.out.println();
    }

    public static void getFirstIndex(int[] array) {
        int firstIndex = -1;
        for (int i = 0; i < lengthRows; i++) {
            if (array[i] == 0 && firstIndex == -1) {
                firstIndex = i;
                firstIndexArray.add(firstIndex);
            }
            if (array[i] != 0) {
                firstIndex = -1;
            }
        }
    }

    public static void getLastIndex(int[] array) {
        int lastIndex = -1;
        for (int i = 0; i < lengthRows; i++) {
            if (array[i] == 1 && lastIndex == -1) {
                lastIndex = i - 1;
                lastIndexArray.add(lastIndex);
            } else if (i == lengthRows - 1) {
                lastIndex = i;
                lastIndexArray.add(lastIndex);
            } else {
                lastIndex = -1;
            }
        }
    }

    public static void searchAvailableSeats(int[][] cinemaHall, int seats) {
        if (seats <= lengthRows) {
            for (int i = 0; i < rows; i++) {
                getFirstIndex(cinemaHall[i]);
                getLastIndex(cinemaHall[i]);
                for (int j = 0; j < lastIndexArray.size(); j++) {
                    if ((lastIndexArray.get(j) - firstIndexArray.get(j)) + 1 >= seats) {
                        System.out.println("подходящие места ряд: " + (i + 1) + " места с " +
                                (firstIndexArray.get(j) + 1) + " по " + (lastIndexArray.get(j) + 1));
                    }
                }
                firstIndexArray.clear();
                lastIndexArray.clear();
            }
        } else {
            System.out.println("В ряду нет такого колличества мест");
        }
    }

    public static int buySeats() {
        System.out.println("Сколько мест вы ходите купить?");
        return scanner().nextInt();
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
