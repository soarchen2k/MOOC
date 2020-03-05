package ca.monor.Week09.W9_19_MethodArgumentValidation;

//public class Calculator {
//    public int multiplication(int multiplicator) {
//        if (multiplicator < 0) {
//            throw new IllegalArgumentException();
//        }
//        int a = 1;
//        for (int i = 1; i < multiplicator; i++) {
//            a *= i;
//        }
//        return a;
//    }
//
//    public int binomialCoefficient(int k, int n) {
//        if (k < 0 || n < 0 || n < k) {
//            throw new IllegalArgumentException();
//        }
//        int fenzi = multiplication(n);
//        int fenmu = multiplication(k) * multiplication(n - k);
//        return fenzi / fenmu;
//    }
//}

public class Calculator {

    public int multiplication(int fromInteger) {
        if (fromInteger < 0) {
            throw new IllegalArgumentException();
        }
        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0 || subsetSize < setSize) {
            throw new IllegalArgumentException();
        }

        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
