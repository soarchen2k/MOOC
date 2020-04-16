package ca.monor.week07.W7_03_Calculator;

public class Calculator {
    private int statistic;
    private Reader reader = new Reader();

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void statistics() {
        System.out.println("Calculations done " + statistic);
    }

    private void product() {
        int[] arr = getValue();
        System.out.println("product of the values " + (arr[0] * arr[1]));
    }

    private void difference() {
        int[] arr = getValue();
        System.out.println("difference of the values " + (arr[0] - arr[1]));
    }

    private void sum() {
        int[] arr = getValue();
        System.out.println("sum of the values " + (arr[0] + arr[1]));
    }

    private int[] getValue() {
        statistic++;
        int[] arr = new int[2];
        System.out.print("value1: ");
        arr[0] = reader.readInteger();
        System.out.print("value2: ");
        arr[1] = reader.readInteger();
        return arr;
    }
}
