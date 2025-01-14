import java.util.Scanner;

public class UI {

    private Scanner scanner;
    private GradeCalculator calculator;

    public UI(Scanner scanner, GradeCalculator calculator) {
        this.scanner = scanner;
        this.calculator = calculator;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {

            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }
            if (input >= 0 && input <= 100) {
                calculator.add(input);
            }
        }

        calculator.pointAverages();
        calculator.pointAveragesPassing();
        calculator.passPercentage();
        calculator.gradeDistribution();

    }
}
