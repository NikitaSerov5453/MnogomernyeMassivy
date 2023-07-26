import java.util.Arrays;
import java.util.Scanner;

public class Lesson12 {
    /**
     * Задание 12
     * Заполните квадратный массив размером n «ходом коня»
     * – (конь в шахматах ходит буквой «Г»). Существует простой
     * алгоритм, который позволяет гарантированно заполнить
     * доску ходом коня размерами от 5 до 70. Т. е. сначала заполните массив числом 0, а потом на первой клетке (элементе
     * массива) ставится число 1, на следующей, на которую прыгает конь – 2 и так до тех пор, пока не останется клеток, на
     * которые конь не ступал. Если остались нулевые значения
     * – значит алгоритм работает не верно. Выведите массив на
     * экран. Размерность массва должна задаваться с клавиатуры
     */
    public static void main(String[] args) {
        knightMove(chessBoard);
        printArray(chessBoard);
    }

    public static final int[] row = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
    public static final int[] col = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
    public static int chessBoardSize = scanner().nextInt();
    public static int counter = 1;
    public static int[][] chessBoard = new int[chessBoardSize][chessBoardSize];
    public static int[][] chessBoardCopy = new int[chessBoardSize][chessBoardSize];

    public static void fieldChessBoard(int[][] array) {
        int counter = 0;
        for (int i = 0; i < chessBoardSize; i++) {
            for (int j = 0; j < chessBoardSize; j++) {
                if (i - 1 >= 0 && j + 2 < chessBoardSize && chessBoard[i - 1][j + 2] == 0) {
                    counter++;
                }
                if (i + 1 < chessBoardSize && j + 2 < chessBoardSize && chessBoard[i + 1][j + 2] == 0) {
                    counter++;
                }
                if (i - 1 >= 0 && j - 2 >= 0 && chessBoard[i - 1][j - 2] == 0) {
                    counter++;
                }
                if (i + 1 < chessBoardSize && j - 2 >= 0 && chessBoard[i + 1][j - 2] == 0) {
                    counter++;
                }
                if (i - 2 >= 0 && j - 1 >= 0 && chessBoard[i - 2][j - 1] == 0) {
                    counter++;
                }
                if (i + 2 < chessBoardSize && j - 1 >= 0 && chessBoard[i + 2][j - 1] == 0) {
                    counter++;
                }
                if (i - 2 >= 0 && j + 1 < chessBoardSize && chessBoard[i - 2][j + 1] == 0) {
                    counter++;
                }
                if (i + 2 < chessBoardSize && j + 1 < chessBoardSize && chessBoard[i + 2][j + 1] == 0) {
                    counter++;
                }
                array[i][j] = counter;
                counter = 0;
            }
        }
    }

    public static boolean isValid(int x, int y) {
        return x >= 0 && y >= 0 && x < chessBoardSize && y < chessBoardSize;
    }

    public static int x = 0;
    public static int y = 0;
    public static void knightMove(int[][] chessBoard) {
        fieldChessBoard(chessBoardCopy);
        int holdX = 0;
        int holdY = 0;
        int minValuePositionCech = 9;
        chessBoard[x][y] = counter;
        for (int i = 0; i < 8; i++) {
            int newX = x + row[i];
            int newY = y + col[i];
            if (isValid(newX, newY) && chessBoard[newX][newY] == 0) {
                if (chessBoardCopy[newX][newY] < minValuePositionCech) {
                    minValuePositionCech = chessBoardCopy[newX][newY];
                    holdY = newY;
                    holdX = newX;
                }
            }
        }
        x = holdX;
        y = holdY;
        if (counter == chessBoardSize * chessBoardSize) {
            return;
        }
        counter++;
        for (int[] ints : chessBoardCopy) Arrays.fill(ints, 0);
        knightMove(chessBoard);
    }

    public static void printArray(int[][] array) {
        for (int[] a : array) {
            System.out.print(Arrays.toString(a) + "\n");
        }
        System.out.println();
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
