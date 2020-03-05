package monor.week05.exercise093_PersonExtended;


public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate comparedDate) {
        if (this.year > comparedDate.year) {
            return Math.abs((((this.year - comparedDate.year)
                    * 12 + this.month - comparedDate.month)
                    * 30 + this.day - comparedDate.day)
                    / 360);
        }
        return Math.abs((((comparedDate.year - this.year)
                * 12 + comparedDate.month - this.month)
                * 30 + comparedDate.day - this.day)
                / 360);    }
}