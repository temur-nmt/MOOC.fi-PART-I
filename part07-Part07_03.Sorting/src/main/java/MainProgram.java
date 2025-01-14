import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int x : array) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallest = smallest(array);

        for (int x : array) {
            if (x == smallest) {
                return index;
            } else {
                index++;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int[] newArray = new int[table.length - startIndex];
        int newIndex = 0;

        for (int j = startIndex; j < table.length; j++) {
            newArray[newIndex] = table[j];
            newIndex++;
        }
        return indexOfSmallest(newArray) + startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {

        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }
}
