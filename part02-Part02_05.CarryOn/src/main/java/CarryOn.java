
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean carryOn = true;

        while (carryOn) {
            System.out.println("Shall we carry on?");
            String answer = scanner.nextLine();
            if (answer.equals("no")) {
                carryOn = false;
            }
        }
    }
}
