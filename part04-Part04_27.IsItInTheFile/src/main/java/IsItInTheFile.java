
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
            if (list.contains(searchedFor)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found!");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }

    }
}
