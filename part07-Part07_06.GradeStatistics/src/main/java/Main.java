
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeCalculator calculator = new GradeCalculator();
        UI newUi = new UI(scanner, calculator);

        newUi.start();
    }
}
