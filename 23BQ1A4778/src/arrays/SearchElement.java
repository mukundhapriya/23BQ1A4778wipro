package arrays;

public class SearchElement {

    public static void main(String[] args) {

        int[] a = {1, 4, 34, 56, 7};

        int key = Integer.parseInt(args[0]);

        int index = -1;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == key) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}