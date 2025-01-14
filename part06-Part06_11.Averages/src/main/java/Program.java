
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        UserInterface ui = new UserInterface(register, scanner);
        ui.start();

        // GradeRegister register = new GradeRegister();
        // register.addGradeBasedOnPoints(3);
        // register.addGradeBasedOnPoints(3);
        // register.addGradeBasedOnPoints(4);
        // register.averageOfPoints();
    }
}
