
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int points = scan.nextInt();

        if (points < 0) {
            System.out.println("Grade: impossible!");
        } else if (points <= 49) {
            System.out.println("Grade: failed");
        } else if (50 <= points && points <= 59) {
            System.out.println(1);
        } else if (60 <= points && points <= 69) {
            System.out.println(2);
        } else if (70 <= points && points <= 79) {
            System.out.println(3);
        } else if (80 <= points && points <= 89) {
            System.out.println(4);
        } else if (90 <= points && points <= 100) {
            System.out.println(5);
        } else if (points > 100) {
            System.out.println("Grade: incredible!");
        }
    }
}
