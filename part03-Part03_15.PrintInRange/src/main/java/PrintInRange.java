
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here

        ArrayList<Integer> numbers = new ArrayList<>();
        int lowerLimit = 0;
        int upperLimit = 5;

        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        printNumbersInRange(numbers, lowerLimit, upperLimit);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {

        for (int i : numbers) {
            if (i >= lowerLimit && i <= upperLimit) {
                System.out.println(i);
            }
        }
    }
}
