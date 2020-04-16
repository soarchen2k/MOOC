package ca.monor.week09.W9_19_MethodArgumentValidation;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = calculator.binomialCoefficient(6,3);
        System.out.println(a);
    }
}
