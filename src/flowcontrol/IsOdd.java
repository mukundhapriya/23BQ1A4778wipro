package flowcontrol;

import java.util.Scanner;

public class IsOdd {

    public static int isOdd(int number) {
        if (number != 0 && number % 2 != 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println(isOdd(num));

        sc.close();
    }
}