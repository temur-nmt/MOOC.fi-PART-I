import java.util.ArrayList;
import java.util.Scanner;;

public class UserInteface {

    private Scanner scanner;
    private ArrayList<Bird> birdList;

    public UserInteface(Scanner scanner) {
        this.birdList = new ArrayList<>();
        this.scanner = scanner;
    }

    public void start() {

        while (true) {

            System.out.print("? ");
            String input = scanner.nextLine();

            if (input.equals("Quit")) {
                break;
            }
            if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();

                birdList.add(new Bird(name, latinName));
            }
            if (input.equals("Observation")) {
                System.out.print("Bird? ");
                String observe = scanner.nextLine();
                boolean isBird = false;

                for (Bird x : birdList) {
                    if (x.getName().equals(observe)) {
                        x.increaseObservations();
                        isBird = true;
                        break;
                    }
                }
                if (!isBird) {
                    System.out.println("Not a bird!");
                }
            }
            if (input.equals("All")) {
                for (Bird x : birdList) {
                    System.out.println(x);
                }
            }
            if (input.equals("One")) {
                System.out.print("Bird? ");
                String one = scanner.nextLine();
                boolean isBird = false;

                for (Bird x : birdList) {
                    if (x.getName().equals(one)) {
                        isBird = true;
                        System.out.println(x);
                        break;
                    }
                }
                if (!isBird) {
                    System.out.println("Not a bird!");
                }
            }
        }
    }
}
