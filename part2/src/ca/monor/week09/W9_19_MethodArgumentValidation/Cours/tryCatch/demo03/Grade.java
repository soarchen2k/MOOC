package ca.monor.week09.W9_19_MethodArgumentValidation.Cours.tryCatch.demo03;

public class Grade {
    private int grade;

    public Grade(int grade) {
        if (grade < 0 || grade > 5) {
            throw new IllegalArgumentException("The grade has to be between 0-5");
        }
        try {
            this.grade = grade;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Grade: " + grade;
    }
}
