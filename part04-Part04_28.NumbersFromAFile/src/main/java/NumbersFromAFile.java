
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int counter = 0;

        try (Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                int src = Integer.valueOf(reader.nextLine());
                if ((src >= lowerBound) && (src <= upperBound)) {
                    counter++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Numbers: " + counter);
    }

}
