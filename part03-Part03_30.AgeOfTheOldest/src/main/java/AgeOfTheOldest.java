
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {
                System.out.println("Age of the oldest: " + max);
                break;
            } else {
                String[] split = input.split(",");
                int oldest = Integer.valueOf(split[1]);

                if (oldest > max) {
                    max = oldest;
                }
            }

        }

    }
}
