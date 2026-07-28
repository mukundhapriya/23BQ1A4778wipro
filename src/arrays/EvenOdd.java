package arrays;

public class EvenOdd {

    public static void main(String[] args) {

        int[] a = {1, 0, 1, 0, 1, 1};

        int[] result = new int[a.length];
        int index = 0;

        // Even numbers first
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                result[index++] = a[i];
            }
        }

        // Odd numbers next
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                result[index++] = a[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}