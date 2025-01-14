import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstCurrent = 0;
        int secondCurrent = 0;
        int firstMax = 100;
        int secondMax = 100;

        String first = "First: " + firstCurrent + "/" + firstMax;
        String second = "Second: " + secondCurrent + "/" + secondMax;

        while (true) {
            System.out.println(first);
            System.out.println(second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String operation = parts[0];
            int amount = Integer.valueOf(parts[1]);
            // System.out.println(operation);
            // System.out.println(amount);

            if (operation.equals("add")) {
                amount = Math.abs(Integer.valueOf(parts[1]));

                if (firstCurrent + amount > 100) {
                    firstCurrent = 100;
                } else {

                    firstCurrent += amount;
                }
                first = "First: " + firstCurrent + "/" + firstMax;
            }

            if (operation.equals("move")) {

                if ((amount > firstCurrent) && (firstCurrent != 0)) {
                    secondCurrent = firstCurrent;
                    firstCurrent = 0;

                }
                if ((amount <= firstCurrent) && (amount > 0) && (firstCurrent > 0)) {
                    firstCurrent -= amount;
                    secondCurrent += amount;
                }

                if (secondCurrent > 100) {
                    secondCurrent = 100;
                }

                first = "First: " + firstCurrent + "/" + firstMax;
                second = "Second: " + secondCurrent + "/" + secondMax;
            }

            if (operation.equals("remove")) {

                if (secondCurrent < amount) {
                    secondCurrent = 0;
                }

                if (secondCurrent > 0) {
                    secondCurrent -= amount;
                }
                first = "First: " + firstCurrent + "/" + firstMax;
                second = "Second: " + secondCurrent + "/" + secondMax;
            }
        }
    }

}
