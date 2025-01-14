
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        // write some code here

        int[] list = { number1, number2, number3 };
        int temp = Integer.MIN_VALUE;

        for (int i = 0; i <= list.length - 1; i++) {
            if (temp < list[i]) {
                temp = list[i];
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
