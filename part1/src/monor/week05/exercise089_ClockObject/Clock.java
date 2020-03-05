package monor.week05.exercise089_ClockObject;

public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(hoursAtBeginning, 23);
        this.seconds = new BoundedCounter(secondsAtBeginning,59);
        this.minutes = new BoundedCounter(minutesAtBeginning, 59);
    }

    public void tick() {
        seconds.next();
        if (seconds.getValue() == 0) {
            minutes.next();
        }
        if (minutes.getValue() == 0 && seconds.getValue() == 0) {
            hours.next();
        }
    }

    public String toString() {
        // returns the string representation
        return this.hours + ":"
                + this.minutes + ":"
                + this.seconds;
    }
}
