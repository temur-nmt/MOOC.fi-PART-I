
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            } else {
                list.add(input);
            }
        }

        double sum = 0;

        for (int i : list) {
            sum += i;
        }

        System.out.println("Average: " + (sum / list.size()));
    }
}
