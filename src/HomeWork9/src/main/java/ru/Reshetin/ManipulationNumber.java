package HomeWork9.src.main.java.ru.Reshetin;

import java.util.Scanner;

public class ManipulationNumber {
    public int addMethod(int a, int b) {
        return a + b;

    }

    public int differenceMethod(int a, int b) {
        return a - b;
    }

    public int multiplicationMethod(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Нельзя умножить на ноль");
        }
        return a * b;
    }

    public int divideMethod(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
        return a / b;
    }

    public int powerMethod(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
