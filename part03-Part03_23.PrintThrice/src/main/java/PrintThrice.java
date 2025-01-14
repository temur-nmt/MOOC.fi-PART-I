
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.print("Give a word: ");
        String input = scanner.nextLine();
        int count = 3;

        while (count > 0) {
            System.out.print(input);
            count--;
        }

    }
}
