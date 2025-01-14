
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            } else {

                String[] list = input.split(" ");

                for (String i : list) {
                    if (i.contains("av")) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
