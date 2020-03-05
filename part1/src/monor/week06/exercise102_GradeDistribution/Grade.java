package monor.week06.exercise102_GradeDistribution;

import java.util.ArrayList;

public class Grade {
    private ArrayList<Scores> scores;
    private Scores score;
    private String grade0 = "0";
    private String grade1 = "1";
    private String grade2 = "2";
    private String grade3 = "3";
    private String grade4 = "4";
    private String grade5 = "5";



    public Grade(ArrayList<Scores> scores) {
        this.scores = scores;
    }

    public ArrayList<Scores> addScore(Scores score) {
//        Main.doSomething();
        this.scores.add(score);
        return this.scores;
    }
}
