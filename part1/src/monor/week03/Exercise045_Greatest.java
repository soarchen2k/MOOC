package monor.week03;

public class Exercise045_Greatest {
    public static int greatest(int number1, int number2, int number3) {

        int temp = number2 > number3 ? number2 : number3;

        return number1 > temp ? number1 : temp;

    }



    public static void main(String[] args) {

        int result = greatest(2, 7, 3);

        System.out.println("Greatest: " + result);

    }
}
