package org.book.chapter05.p05;

public class OrConditions {
    public static void main(String[] args) {
        boolean result = true || true;
        System.out.printf("%b\n", result);
        result = true || false;
        System.out.printf("%b\n", result);
        result = false || true;
        System.out.printf("%b\n", result);
        result = false || false;
        System.out.printf("%b\n", result);
    }
}
