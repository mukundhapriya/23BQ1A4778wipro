package flowcontrol;

import java.util.Scanner;

public class LastDigit {

    public static int getLastDigit(int number) {
        return Math.abs(number % 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println("Last Digit = " + getLastDigit(num));

        sc.close();
    }
}