
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " + (Double.valueOf(sum) / count));
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            } else {
                count++;
                sum += input;
                if (input % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
    }
}
