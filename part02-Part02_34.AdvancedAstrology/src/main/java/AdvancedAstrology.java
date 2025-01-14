
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {

            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise

        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars((2 * i ) - 1); //odd number of stars for each line; i.e. 1 -> 3 -> 5 -> 7 etc.
        }
        for (int i = 1; i <= 2; i++) {
            printSpaces(((2 * height) - 4) / 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
