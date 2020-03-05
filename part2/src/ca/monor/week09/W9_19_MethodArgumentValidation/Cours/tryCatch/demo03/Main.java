package ca.monor.week09.W9_19_MethodArgumentValidation.Cours.tryCatch.demo03;

public class Main {
    public static void main(String[] args) {
        Grade grade = new Grade(3);
        System.out.println(grade.getGrade());

        Grade wrongGrade = new Grade(22);
    }
}
