import java.util.Arrays;

public class Lesson1 {
    /**
     * Задание 1
     * Сформировать массив, элементами которого будут квадраты соответствующих индексов. Вывести результат на
     * экран.
     *
     * @param args
     */
    public static void main(String[] args) {
        squareIndex(8);
    }

    public static void squareIndex(int length) {
        Integer[] array = new Integer[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
        System.out.println(Arrays.toString(array));
    }
}
