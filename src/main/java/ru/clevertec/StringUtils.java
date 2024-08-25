package ru.clevertec;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            if (str == null) return false;
            double number = Double.parseDouble(str);
            return number > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}