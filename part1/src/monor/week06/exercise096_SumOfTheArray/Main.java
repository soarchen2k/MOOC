package monor.week06.exercise096_SumOfTheArray;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int a :
                array) {
            sum += a;
        }
        return sum;
    }
}
