
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int gift = scan.nextInt();

        if (gift < 5000) {
            System.out.println("No tax!");
        }
        if ((gift >= 5000) && (gift <= 25000)) {
            if (gift == 5000) {
                System.out.println("Tax: 100.0");
            } else {
                System.out.println("Tax: " + (100 + (gift - 5000) * 0.08));
            }
        }
        if ((gift >= 25000) && (gift <= 55000)) {
            if (gift == 2500) {
                System.out.println("Tax: 1700.0");
            } else {
                System.out.println("Tax: " + (1700 + (gift - 25000) * 0.1));
            }
        }
        if ((gift >= 55000) && (gift <= 200000)) {
            if (gift == 55000) {
                System.out.println("Tax: 4700.0");
            } else {
                System.out.println("Tax: " + (4700 + (gift - 55000) * 0.12));
            }
        }
        if ((gift >= 200000) && (gift <= 1000000)) {
            if (gift == 200000) {
                System.out.println("Tax: 22100.0");
            } else {
                System.out.println("Tax: " + (22100 + (gift - 200000) * 0.15));
            }
        }
        if (gift >= 1000000) {
            if (gift == 1000000) {
                System.out.println("Tax: 142100.0");
            } else {
                System.out.println("Tax: " + (142100 + (gift - 1000000) * 0.17));
            }
        }
    }
}
