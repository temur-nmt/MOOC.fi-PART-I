import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }
            if (input.equals("add")) {
                System.out.print("To add: ");
                String addTask = this.scanner.nextLine();
                this.todoList.add(addTask);
            }
            if (input.equals("list")) {
                this.todoList.print();
            }
            if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                int toRemove = Integer.valueOf(this.scanner.nextLine());
                this.todoList.remove(toRemove);
            }
        }
    }

}
