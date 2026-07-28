package arrays;

public class Sum67 {

    public static void main(String[] args) {

        int[] a = {10, 3, 6, 1, 2, 7, 9};

        int sum = 0;
        boolean ignore = false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 6)
                ignore = true;

            if (!ignore)
                sum += a[i];

            if (a[i] == 7 && ignore)
                ignore = false;
        }

        System.out.println(sum);
    }
}