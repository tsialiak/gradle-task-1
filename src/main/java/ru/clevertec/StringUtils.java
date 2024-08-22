package ru.clevertec;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isPositiveNumber("5"));
    }

    public static boolean isPositiveNumber(String str) {
        return Integer.parseInt(str) > 0;
    }
}