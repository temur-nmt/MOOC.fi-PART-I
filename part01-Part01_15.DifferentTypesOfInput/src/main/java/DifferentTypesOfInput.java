
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String inputOne = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        int inputTwo = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double inputThree = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean inputFour = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + inputOne);
        System.out.println("You gave the integer " + inputTwo);
        System.out.println("You gave the double " + inputThree);
        System.out.println("You gave the boolean " + inputFour);

    }
}
