
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            String firstString = "First: " + first;
            String secondString = "Second: " + second;
            System.out.println(firstString);
            System.out.println(secondString);
            System.out.print("> ");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] operations = input.split(" ");
            String operator = operations[0];
            int amount = Integer.valueOf(operations[1]);

            if (operator.equals("add")) {
                first.add(amount);
            }
            if (operator.equals("remove")) {
                second.remove(amount);
            }
            if (operator.equals("move")) {

                if (first.contains() > 0) {

                    if (amount > first.contains()) {
                        second.add(first.contains());
                        first.remove(first.contains());
                    } else {
                        first.remove(amount);
                        second.add(amount);
                    }
                }
            }
        }
    }

}
