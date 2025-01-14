import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void print() {
        int counter = 1;
        for (String x : todoList) {
            System.out.println(counter + ": " + x);
            counter++;
        }
    }

    public void remove(int number) {
        this.todoList.remove(number - 1);
    }
}
