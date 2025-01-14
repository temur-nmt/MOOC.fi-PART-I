
import java.util.Arrays;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        String[] input = new String[2];
        input[0] = username;
        input[1] = password;
        System.out.println(input[0]);
        System.out.println(input[1]);

        String[] alex = { "alex", "sunshine" };
        String[] emma = { "emma", "haskell" };

        if (Arrays.equals(input, alex) || Arrays.equals(input, emma)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
