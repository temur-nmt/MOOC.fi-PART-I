
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        // implement here a program that reads user input
        // until the user enters 9999

        while (true) {
            int input = scanner.nextInt();

            if (input == 9999) {
                break;
            } else {
                list.add(input);
            }
        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        int min = Integer.MAX_VALUE;

        for (int i : list) {

            if (i < min) {
                min = i;
            }
        }

        System.out.println("Smallest number: " + min);

        for (int j = 0; j < list.size(); j++) {

            if (list.get(j) == min) {
                System.out.println("Fount at index: " + j);
            }
        }
    }
}
