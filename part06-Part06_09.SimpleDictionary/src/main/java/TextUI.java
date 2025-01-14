import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {

            System.out.print("Command: ");
            String input = this.scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye Bye!");
                break;
            }
            if (input.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                this.dictionary.add(word, translation);
            }
            if (input.equals("search")) {
                System.out.print("To be translated: ");
                String toBeTranslated = this.scanner.nextLine();
                if (this.dictionary.translate(toBeTranslated) == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    System.out.println("Translation: " + this.dictionary.translate(toBeTranslated));
                }
            } else {
                System.out.println("Unknown command");
            }
        }

    }
}
