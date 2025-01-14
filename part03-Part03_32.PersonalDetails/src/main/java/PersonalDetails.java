
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int counter = 0;
        double yearSum = 0;

        while (true) {
            String input = scanner.nextLine();

            // System.out.println(longestName);
            // System.out.println(yearSum);

            if (input.equals("")) {
                System.out.println("Longest name: " + longestName);
                System.out.println("Average of the birth years: " + (yearSum / counter));
                break;
            } else {
                String[] split = input.split(",");
                String name = split[0];
                int year = Integer.valueOf(split[1]);

                yearSum += year;
                counter++;

                if (name.length() > longestName.length()) {
                    longestName = name;
                }
            }
        }

    }
}
