import java.util.Scanner;

public class Lesson11 {
    /**
     * Задание 11
     * Ввести c клавиатуры число в диапазоне от 0 до 1 000 000
     * включительно. Озвучить его русскими словами. Учесть, что
     * для разных чисел могут быть различные окончание слов, например «одна тысяча», «две тысячи», «пять тысяч».
     * Например, при вводе числа 1125, программа должна вывести на консоль«одна тысяча сто двадцать пять».
     */
    public static void main(String[] args) {

    }

    public static final String ONE1 = "один";
    public static final String ONE1000 = "одна";
    public static final String ONE100 = "сто";
    public static final String ONE10 = "десять";
    public static final String TWO = "два";
    public static final String TWO2000 = "две";
    public static final String TWO100 = "двести";
    public static final String TWO10 = "двадцать";

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
