import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;
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
        System.out.println(numberToRussianString(scanner().nextInt()));
    }

    public static String numberToRussianString(int scanner) {
        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"), RuleBasedNumberFormat.SPELLOUT);
        return nf.format(scanner);
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
