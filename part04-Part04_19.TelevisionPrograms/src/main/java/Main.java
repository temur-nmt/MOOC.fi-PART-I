import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String showName = scanner.nextLine();

            if (showName.isEmpty()) {
                break;
            } else {
                System.out.print("Duration: ");
                int showDuration = Integer.valueOf(scanner.nextLine());
                programs.add(new TelevisionProgram(showName, showDuration));
            }
        }
        // System.out.println(programs);
        System.out.println("");
        System.out.print("Program's maximum duration? ");
        int maxDuration = scanner.nextInt();

        for (TelevisionProgram i : programs) {
            if (maxDuration >= i.getDuration()) {
                System.out.println(i);
            }
        }
    }
}
