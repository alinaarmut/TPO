package org.example.task1;


public class Function {
    private static final double EPSILON = 0.001;

    public static double atan(double x) {
        if (Math.abs(x) > 1) {
            throw new IllegalArgumentException("|x| должен быть <= 1");
        }

        double result = 0.0;
        double term = x;
        int i = 0;

        while (Math.abs(term) > EPSILON) {
            result += term;
            i++;
            term = Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / (2 * i + 1);
        }

        return result;
    }

}
