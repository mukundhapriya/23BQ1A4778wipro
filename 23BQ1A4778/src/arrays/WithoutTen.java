package arrays;

public class WithoutTen {

    public static void main(String[] args) {

        int[] a = {1, 10, 10, 2};
        int[] result = new int[a.length];

        int index = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] != 10) {
                result[index++] = a[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}