package arrays;

public class Only14 {

    public static void main(String[] args) {

        int[] a = {1, 4, 1, 4};

        boolean flag = true;

        for (int i = 0; i < a.length; i++) {

            if (a[i] != 1 && a[i] != 4) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}