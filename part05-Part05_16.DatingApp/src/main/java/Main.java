
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(27, 12, 2015);
        System.out.println("Friday of the examined week is " + date);

        date.advance(60);
        System.out.println(date);

    }
}
