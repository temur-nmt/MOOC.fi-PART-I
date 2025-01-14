
public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int count) {

        for (int i = count; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
