package arrays;

import java.util.Arrays;

public class LargestSmallest {

    public static void main(String[] args) {

        int[] a = {12, 45, 7, 89, 23, 67};

        Arrays.sort(a);

        System.out.println("Smallest = " + a[0]);
        System.out.println("Second Smallest = " + a[1]);

        System.out.println("Largest = " + a[a.length - 1]);
        System.out.println("Second Largest = " + a[a.length - 2]);
    }
}