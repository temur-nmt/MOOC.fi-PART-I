
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            } else if (number > 0) {
                System.out.println(number * number);
            } else {
                System.out.println("Unsuitable number");
            }
        }
    }
}
