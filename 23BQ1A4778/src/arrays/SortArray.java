package arrays;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] a = {45, 12, 67, 5, 90, 23};

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}