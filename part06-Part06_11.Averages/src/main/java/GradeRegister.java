
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Double> gradesOnPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.gradesOnPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.gradesOnPoints.add((double) points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }

        int sumOfGrades = 0;

        for (int x : grades) {
            sumOfGrades += x;
        }

        return (double) sumOfGrades / grades.size();
    }

    public double averageOfPoints() {
        if (this.gradesOnPoints.isEmpty()) {
            return -1;
        }

        double sumOfGrades = 0;

        for (double x : gradesOnPoints) {
            sumOfGrades += x;
        }

        return sumOfGrades / gradesOnPoints.size();
    }
}
