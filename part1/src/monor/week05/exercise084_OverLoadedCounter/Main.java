package monor.week05.exercise084_OverLoadedCounter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(2,true);
//        counter.setCheck(true);
        counter.increase();
        System.out.println(counter);
        counter.decrease();
        System.out.println(counter);
        for (int i = 0; i < 6; i++) {
            counter.decrease();
            System.out.println(counter);
        }
        counter.decrease(2);
        System.out.println(counter);
        counter.increase(3);
        System.out.println(counter);
        counter.decrease(24);
        System.out.println(counter);
        counter.decrease(2);
        System.out.println(counter);
    }
}
