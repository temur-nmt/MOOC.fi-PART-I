
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        double sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Average of the numbers: " + (sum / count));
                break;
            } else {
                count++;
                sum += number;
            }
        }
    }
}
