
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }
    }

}
