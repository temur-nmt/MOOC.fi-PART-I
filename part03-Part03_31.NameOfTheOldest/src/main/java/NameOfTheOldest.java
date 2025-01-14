
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String oldestName = "";

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {
                System.out.println("Name of the oldest: " + oldestName);
                break;
            } else {
                String[] split = input.split(",");
                String name = split[0];
                int oldest = Integer.valueOf(split[1]);

                if (oldest > max) {
                    max = oldest;
                    oldestName = name;
                }
            }

        }

    }
}
