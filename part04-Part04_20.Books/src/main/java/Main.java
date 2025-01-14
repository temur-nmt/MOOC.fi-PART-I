import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            } else {
                System.out.print("Pages: ");
                int pages = Integer.valueOf(scanner.nextLine());
                System.out.print("Publication year: ");
                int year = Integer.valueOf(scanner.nextLine());
                books.add(new Books(title, pages, year));
            }
        }
        // System.out.println(books);
        System.out.println("");
        System.out.print("What information will be printed? ");

        String info = scanner.nextLine();

        if (info.equals("everything")) {
            for (Books i : books) {
                System.out.println(i);
            }
        } else if (info.equals("name")) {
            for (Books i : books) {
                System.out.println(i.getName());
            }
        }
    }
}
