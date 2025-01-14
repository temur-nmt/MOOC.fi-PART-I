
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if ((number == 0) && (count == 0)) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (number == 0) {
                System.out.println(sum / count);
                break;
            } else if (number > 0) {
                count++;
                sum += number;
            }
        }
    }
}
