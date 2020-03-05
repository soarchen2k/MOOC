package monor.week02;

public class Exercise029_EvenNumbers {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
