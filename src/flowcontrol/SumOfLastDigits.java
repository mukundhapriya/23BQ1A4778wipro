package flowcontrol;

import java.util.Scanner;

public class SumOfLastDigits {

    public static int addLastDigits(int input1, int input2) {

        int lastDigit1 = Math.abs(input1 % 10);
        int lastDigit2 = Math.abs(input2 % 10);

        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum = " + addLastDigits(num1, num2));

        sc.close();
    }
}