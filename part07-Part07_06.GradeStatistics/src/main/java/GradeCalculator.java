import java.util.ArrayList;

public class GradeCalculator {

    private ArrayList<Integer> points;

    public GradeCalculator() {
        this.points = new ArrayList<>();
    }

    public void add(int inputValue) {
        points.add(inputValue);
    }

    public void printList() {
        System.out.println(points);
    }

    public void pointAverages() {
        int count = 0;
        double sum = 0;

        for (int x : points) {
            count++;
            sum += x;
        }

        System.out.println("Point average (all): " + (sum / count));
    }

    public void pointAveragesPassing() {
        int count = 0;
        double sum = 0;

        for (int x : points) {
            if (x >= 50) {
                count++;
                sum += x;
            }
        }

        double average = sum / count;

        if (average < 50 || count == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + average);
        }
    }

    public void passPercentage() {

        int participants = points.size();
        double passing = 0;

        for (int x : points) {
            if (x >= 50) {
                passing++;
            }
        }

        System.out.println("Pass percentage: " + (100 * passing / participants));
    }

    public void gradeDistribution() {

        String gradeFive = "";
        String gradeFour = "";
        String gradeThree = "";
        String gradeTwo = "";
        String gradeOne = "";
        String gradeZero = "";

        for (int x : points) {
            if (x >= 90) {
                gradeFive += "*";
            }
            if (x >= 80 && x < 90) {
                gradeFour += "*";
            }
            if (x >= 70 && x < 80) {
                gradeThree += "*";
            }
            if (x >= 60 && x < 70) {
                gradeTwo += "*";
            }
            if (x >= 50 && x < 60) {
                gradeOne += "*";
            }
            if (x < 50) {
                gradeZero += "*";
            }
        }
        System.out.print("Grade distribution: " + '\n' + "5: " + gradeFive + '\n' + "4: " + gradeFour + '\n' + "3: "
                + gradeThree + '\n' + "2: " + gradeTwo + '\n' + "1: " + gradeOne + '\n' + "0: " + gradeZero + '\n');
    }
}
