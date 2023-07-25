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


    public static void printArray(int[][] array) {
        for (int[] a : array) {
            System.out.print(Arrays.toString(a) + "\n");
        }
        System.out.println();
    }

    public static void searchAvailableSeats(int[][] array, int seats) {
        int counter = 0;
        int maximumAvailableSeats = 0;
        int indexJ = -1;
        if (seats < lengthRows) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < lengthRows; j++) {
                    if (array[i][j] == 0) {
                        counter++;
                        if (indexJ == -1) {
                            indexJ = j;
                            System.out.println(indexJ);
                        }
                    } else {
                        counter = 0;
                        indexJ = -1;
                    }
                    if (counter > maximumAvailableSeats) {
                        maximumAvailableSeats = counter;
                    }
                    if (j == lengthRows - 1) {
                        System.out.println("Подходящие свободные места: " + (i + 1) + " ряд" + " = " + maximumAvailableSeats);
                        counter = 0;
                        maximumAvailableSeats = 0;
                        indexJ = -1;
                    }
                }
            }
        } else {
            System.out.println("В ряду нет данного колличества мест");
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
