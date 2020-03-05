package monor.week05.exercise092_DifferenceDate;

import java.util.Objects;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int differenceInYears(MyDate comparedDate) {
        if (this.year > comparedDate.year) {
            return Math.abs((((this.year - comparedDate.year)
                    * 12 + this.month - comparedDate.month)
                    * 30 + this.day - comparedDate.day)
                    / 360);
        }
        return Math.abs((((comparedDate.year - this.year)
                * 12 + comparedDate.month - this.month)
                * 30 + comparedDate.day - this.day)
                / 360);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day &&
                month == myDate.month &&
                year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        return day + "." + month +
                "." + year;
    }
}
